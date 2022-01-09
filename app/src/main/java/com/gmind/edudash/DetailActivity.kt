package com.gmind.edudash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

        val hipertensi = intent.getParcelableExtra<MateriHipertensi>(EXTRA_HIPERTENSI)

        Glide.with(this)
            .load(hipertensi?.contentAsset)
            .into(activityDetailBinding.ivDetailFoto)


        Glide.with(this)
            .load(hipertensi?.contentAsset2)
            .into(activityDetailBinding.ivContentFoto)

//        Glide.with(this)
//            .load(hipertensi?.contentAsset3)
//            .into(activityDetailBinding.ivContentFoto2)
//
//
//        Glide.with(this)
//            .load(hipertensi?.contentAsset4)
//            .into(activityDetailBinding.ivContentFoto3)
//
//
//        Glide.with(this)
//            .load(hipertensi?.contentAsset5)
//            .into(activityDetailBinding.ivContentFoto4)

        activityDetailBinding.tvDetailJudul.text = hipertensi?.contentJudul

        activityDetailBinding.tvDetailContent.text = hipertensi?.contentDeskripsi
//        activityDetailBinding.tvDetailContent2.text = hipertensi?.contentDeskripsi2
//        activityDetailBinding.tvDetailContent3.text = hipertensi?.contentDeskripsi3
//        activityDetailBinding.tvDetailContent4.text = hipertensi?.contentDeskripsi4
//        activityDetailBinding.tvDetailContent5.text = hipertensi?.contentDeskripsi

        activityDetailBinding.tvBack.setOnClickListener {
            val intent = Intent(this, MateriHipertensiActivity::class.java)
            startActivity(intent)
            finishAffinity()
        }
    }
}