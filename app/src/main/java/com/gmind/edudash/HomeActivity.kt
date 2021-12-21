package com.gmind.edudash

import android.content.Intent
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
            val intent = Intent(this, MateriActivity::class.java)
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