package com.gmind.edudash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.gmind.edudash.databinding.ActivityDietDashBinding

class DietDashActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_HIPERTENSI = "extra_hipertensi"
    }


    private lateinit var activityDietDashBinding: ActivityDietDashBinding

    //diet dash
    private lateinit var polaDietDashAdapter: PolaDietDashAdapter
    private val polaDietDashList = ArrayList<PolaDietDash>()
    private lateinit var rvPolaDietDash: RecyclerView



    //diet dash2
    private lateinit var polaDietDash2Adapter: PolaDietDash2Adapter
    private val polaDietDash2List = ArrayList<PolaDietDash2>()
    private lateinit var rvPolaDietDash2: RecyclerView



    //jenis makanan
    private lateinit var jenisMakananAdapter: JenisMakananAdapter
    private val jenisMakananList = ArrayList<JenisMakanan>()
    private lateinit var rvJenisMakanan: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityDietDashBinding = ActivityDietDashBinding.inflate(layoutInflater)
        setContentView(activityDietDashBinding.root)

        val hipertensi = intent.getParcelableExtra<MateriHipertensi>(DetailActivity.EXTRA_HIPERTENSI)

        Glide.with(this)
            .load(hipertensi?.contentAsset)
            .into(activityDietDashBinding.ivDetailFoto)


        Glide.with(this)
            .load(hipertensi?.contentAsset2)
            .into(activityDietDashBinding.ivContentFoto)

        Glide.with(this)
            .load(hipertensi?.contentAsset3)
            .into(activityDietDashBinding.ivContentFoto2)

        Glide.with(this)
            .load(hipertensi?.contentAsset4)
            .into(activityDietDashBinding.ivContentFoto3)

        Glide.with(this)
            .load(hipertensi?.contentAsset5)
            .into(activityDietDashBinding.ivContentFoto4)

        Glide.with(this)
            .load(hipertensi?.contentAsset6)
            .into(activityDietDashBinding.ivContentFoto5)

        Glide.with(this)
            .load(hipertensi?.contentAsset7)
            .into(activityDietDashBinding.ivContentFoto6)

        Glide.with(this)
            .load(hipertensi?.contentAsset8)
            .into(activityDietDashBinding.ivContentFoto7)



        activityDietDashBinding.tvDetailJudul.text = hipertensi?.contentJudul

        activityDietDashBinding.tvDetailContent.text = hipertensi?.contentDeskripsi
        activityDietDashBinding.tvDetailContent2.text = hipertensi?.contentDeskripsi2
        activityDietDashBinding.tvDetailContent3.text = hipertensi?.contentDeskripsi3
        activityDietDashBinding.tvDetailContent4.text = hipertensi?.contentDeskripsi4
        activityDietDashBinding.tvDetailContent5.text = hipertensi?.contentDeskripsi5

        //diet dash
        rvPolaDietDash = activityDietDashBinding.rvPolaDietDash
        rvPolaDietDash.setHasFixedSize(true)

        polaDietDashList.addAll(PolaDietDashData.getPolaDietDashData())

        rvPolaDietDash.layoutManager = LinearLayoutManager(this)
        polaDietDashAdapter = PolaDietDashAdapter(polaDietDashList)
        rvPolaDietDash.adapter = polaDietDashAdapter



        //diet dash2
        rvPolaDietDash2 = activityDietDashBinding.rvPolaDietDash2
        rvPolaDietDash2.setHasFixedSize(true)

        polaDietDash2List.addAll(PolaDietDash2Data.getPolaDietDash2Data())

        rvPolaDietDash2.layoutManager = LinearLayoutManager(this)
        polaDietDash2Adapter = PolaDietDash2Adapter(polaDietDash2List)
        rvPolaDietDash2.adapter = polaDietDash2Adapter



        //diet dash2
        rvJenisMakanan = activityDietDashBinding.rvJenisMakanan
        rvJenisMakanan.setHasFixedSize(true)

        jenisMakananList.addAll(JenisMakananData.getJenisMakananData())

        rvJenisMakanan.layoutManager = LinearLayoutManager(this)
        jenisMakananAdapter = JenisMakananAdapter(jenisMakananList)
        rvJenisMakanan.adapter = jenisMakananAdapter


        activityDietDashBinding.tvBack.setOnClickListener {
            val intent = Intent(this, MateriHipertensiActivity::class.java)
            startActivity(intent)
            finishAffinity()
        }
    }
}