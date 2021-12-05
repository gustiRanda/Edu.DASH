package com.gmind.edudash

object TipsKesehatanData {

    private val contentTips = arrayOf(
        "Kontrol Hipertensi dengan Diet DASH",
        "Kendalikan tekanan darah agar hidup berkualitas",
        "Terapkan diet DASH agar sehat optimal",
    )




//    private val fotoTips = intArrayOf(
//        R.drawable.db,
//        R.drawable.gl,
//        R.drawable.gs,
//        R.drawable.hbg,
//        R.drawable.hh,
//        R.drawable.hm,
//        R.drawable.lbg,
//        R.drawable.lc,
//        R.drawable.ls,
//        R.drawable.sa)


    val listTips: ArrayList<TipsKesehatan>
        get() {
            val list = arrayListOf<TipsKesehatan>()
            for (position in contentTips.indices) {
                val tipsKesehatan = TipsKesehatan()
                tipsKesehatan.judul = contentTips[position]
//                tipsKesehatan.foto = fotoTips[position]
                list.add(tipsKesehatan)
            }
            return list
        }
}