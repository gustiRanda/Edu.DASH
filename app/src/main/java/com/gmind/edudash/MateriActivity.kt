package com.gmind.edudash

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.text.Html
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.gmind.edudash.*
import com.gmind.edudash.databinding.ActivityMateriBinding

class MateriActivity : AppCompatActivity() {

    private lateinit var activityMateriBinding: ActivityMateriBinding

    private lateinit var tipsAdapter: TipsSliderAdapter
    private val tipsList = ArrayList<TipsKesehatan>()
    private lateinit var dots: ArrayList<TextView>

    private lateinit var handler: Handler
    private lateinit var runnable: Runnable

    private lateinit var listItemAdapter: ListItemAdapter
    private val itemList = ArrayList<Hipertensi>()
    private lateinit var rvItem: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMateriBinding = ActivityMateriBinding.inflate(layoutInflater)
        setContentView(activityMateriBinding.root)

        handler = Handler(Looper.getMainLooper())
        runnable = object : Runnable {
            var index = 0
            override fun run() {
                if (index == tipsList.size)
                    index = 0
                Log.e("Runnable ", "$index")
                activityMateriBinding.viewPager.currentItem = index
                index++
                handler.postDelayed(this, 2000)
            }
        }

        tipsList.addAll(TipsKesehatanData.listTips)

        tipsAdapter = TipsSliderAdapter(tipsList)
        activityMateriBinding.viewPager.adapter = tipsAdapter
        dots = ArrayList()
        setDotIndicator()

        activityMateriBinding.viewPager.registerOnPageChangeCallback(object :
            ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                selectedDots(position)
                super.onPageSelected(position)
            }
        })

        rvItem = activityMateriBinding.rvItem
        rvItem.setHasFixedSize(true)

        itemList.addAll(HipertensiData.getHipertensiData())

        rvItem.layoutManager = LinearLayoutManager(this)
        listItemAdapter = ListItemAdapter(itemList)
        rvItem.adapter = listItemAdapter

        listItemAdapter.setOnItemClickCallback(object : ListItemAdapter.OnItemClickCallback {
            override fun onItemClicked(hipertensi: Hipertensi) {
                if (hipertensi.contentJudul == "Diet DASH"){
                    val intent = Intent(this@MateriActivity, DietDashActivity::class.java)
                    intent.putExtra(DietDashActivity.EXTRA_HIPERTENSI, hipertensi)
                    startActivity(intent)
                } else{
                    val intent = Intent(this@MateriActivity, DetailActivity::class.java)
                    intent.putExtra(DetailActivity.EXTRA_HIPERTENSI, hipertensi)
                    startActivity(intent)
                }
            }

        })
    }

    private fun selectedDots(position: Int) {
        for (i in 0 until tipsList.size) {
            if (i == position)
                dots[i].setTextColor(ContextCompat.getColor(this, R.color.black))
            else
                dots[i].setTextColor(ContextCompat.getColor(this, R.color.white))
        }
    }

    private fun setDotIndicator() {
        for (i in 0 until tipsList.size) {
            dots.add(TextView(this))
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                dots[i].text = Html.fromHtml("&#9679", Html.FROM_HTML_MODE_LEGACY).toString()
            } else {
                dots[i].text = Html.fromHtml("&#9679")
            }
            dots[i].textSize = 18f
            activityMateriBinding.dotIndicator.addView(dots[i])
        }
    }

    override fun onStart() {
        super.onStart()
        handler.post(runnable)
    }

    override fun onStop() {
        super.onStop()
        handler.removeCallbacks(runnable)
    }
}