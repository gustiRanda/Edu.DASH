package com.gmind.edudash

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.gmind.edudash.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var activityHomeBinding: ActivityHomeBinding

    private var backPressedTime = 0L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityHomeBinding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(activityHomeBinding.root)

        activityHomeBinding.materi.setOnClickListener {
            val intent = Intent(this, MateriHipertensiActivity::class.java)
            startActivity(intent)
        }

        activityHomeBinding.statusGizi.setOnClickListener {
            val intent = Intent(this, IndeksMassaTubuhActivity::class.java)
            startActivity(intent)
        }

        activityHomeBinding.kuis.setOnClickListener {
            val intent = Intent(this, QuizActivity::class.java)
            startActivity(intent)
        }

        activityHomeBinding.whatsapp.setOnClickListener {

            val installed = isAppInstalled("com.whatsapp");

            if (installed) {
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(BuildConfig.WHATSAPP_URI)
                startActivity(intent)
            } else {
                Toast.makeText(this@HomeActivity,
                    "Whatsapp Tidak Ditemukan!",
                    Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun isAppInstalled(string: String): Boolean {
        var isInstalled: Boolean
        try {
            packageManager.getPackageInfo(string, PackageManager.GET_ACTIVITIES)
            isInstalled = true
        } catch (e: PackageManager.NameNotFoundException) {
            isInstalled = false
            e.printStackTrace()
        }
        return isInstalled
    }

    override fun onBackPressed() {
        if(backPressedTime + 2000 > System.currentTimeMillis()){
            super.onBackPressed()

        } else{
            Toast.makeText(applicationContext, "Tekan Sekali Lagi Untuk Keluar", Toast.LENGTH_SHORT).show()
        }
        backPressedTime = System.currentTimeMillis()
    }
}