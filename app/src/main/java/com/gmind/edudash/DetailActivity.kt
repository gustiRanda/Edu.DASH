package com.gmind.edudash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.bumptech.glide.Glide
import com.gmind.edudash.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_HIPERTENSI = "extra_hipertensi"
    }

    private lateinit var activityDetailBinding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityDetailBinding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(activityDetailBinding.root)

        val hipertensi = intent.getParcelableExtra<Hipertensi>(EXTRA_HIPERTENSI)

        Glide.with(this)
            .load(hipertensi?.contentAsset)
            .into(activityDetailBinding.ivDetailFoto)


        Glide.with(this)
            .load(hipertensi?.contentAsset2)
            .into(activityDetailBinding.ivContentFoto)

        Glide.with(this)
            .load(hipertensi?.contentAsset3)
            .into(activityDetailBinding.ivContentFoto2)


        Glide.with(this)
            .load(hipertensi?.contentAsset4)
            .into(activityDetailBinding.ivContentFoto3)

        activityDetailBinding.tvDetailJudul.text = hipertensi?.contentJudul

        activityDetailBinding.tvDetailContent.text = hipertensi?.contentDeskripsi

        activityDetailBinding.tvBack.setOnClickListener {
            val intent = Intent(this, MateriActivity::class.java)
            startActivity(intent)
            finishAffinity()
        }
    }
}