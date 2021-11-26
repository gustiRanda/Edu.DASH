package com.gmind.edudash

object HipertensiData {

    //nullable type

    fun getHipertensiData() : ArrayList<Hipertensi>{
        val hipertensi : ArrayList<Hipertensi> = arrayListOf()



        val data2 = Hipertensi(
            "Pengertian",
            "Hipertensi atau tekanan darah tinggi adalah kondisi peningkatan tekanan darah sistolik dan diastolik.",
            R.drawable.ic_pengertian,
            R.drawable.ic_pengertian
        )


        val data3 = Hipertensi(
            "Klasifikasi Hipertensi",
            "Menurut JNC 7, 2003 tekanan darah pada orang dewasa dengan usia ≥ 18 tahun dapat diklasifikasikan menjadi kelompok normal, prehipertensi, hipertensi stage 1, dan hipertensi stage 2 (Chobanian et al., 2003)",
            R.drawable.klasifikasi,
            R.drawable.klasifikasi,
            R.drawable.tabel
        )

        val data4 = Hipertensi(
            "Tanda dan Gejala",
            "Hipertensi disebut sebagai sillent killer, sehingga kebanyakan penderita hipertensi tidak memiliki gejala sama sekali. Terkadang hipertensi memiliki tanda dan gejala antara lain, sakit kepala, sesak napas, pusing, nyeri dada, jantung berdebar-debar, dan hidung berdarah. Tanda seperti dapat dijadikan peringatan bahwa perlunya perubahan gaya hidup yang signifikan (WHO, 2013)",
            R.drawable.ic_gejala,
            R.drawable.ic_gejala
        )

        val data5 = Hipertensi(
            "Penyebab",
            "Penyebab Yang Tidak Dapat Dikendalikan\n" +
                    "\n" +
                    "1.\tUsia \n" +
                    "Seiring dengan bertambahnya umur, seseorang akan mudah terkena hipertensi karena pembuluh darah yang tidak lentur. Hipertensi lebih berisiko pada kelompok usia > 55 tahun dibandingkan kelompok 40-55 tahun. \n" +
                    "\n" +
                    "2.\tJenis kelamin \n" +
                    "Laki-laki lebih mudah terkena hipertensi dibandingkan wanita. Kejadian hipertensi pada laki-laki sebesar 60% dibandingkan wanita karena laki-laki lebih banyak melakukan aktivitas sehingga timbul kelelahan, pola makan dan pola hidup yang tidak sehat. \n" +
                    "\n" +
                    "3.\tRiwayat keluarga \n" +
                    "Keturunan atau riwayat keluarga dapat menjadi penyebab hipertensi. apabila salah satu orang tua mengalami hipertensi maka penyakit hipertensi akan diturunkan kepada anaknya sebesar 30%, sedangkan apabila kedua orang tua mengalami hipertensi maka penyakit hipertensi akan diturunkan kepada anaknya sebesar 50%. \n" +
                    "\n" +
                    "Penyebab yang dapat dikendalikan \n" +
                    "\n" +
                    "1.\tStress\n" +
                    "Stress timbul karena tekanan pekerjaan, lingkungan sosial, tekanan emosional. Semakin tinggi tingkat stress maka akan menyebabkan hipertensi. \n" +
                    "\n" +
                    "2.\tAktivitas fisik\n" +
                    "Seseorang yang jarang melakukan aktivitas fisik dapat mengalami hipertensi. Tidak melakukan aktivitas fisik denyut nadi jantung akan tinggi.\n" +
                    "Bagaimana bisa kurangnya aktivitas fisik dapat menyebabkan hipertensi ?\n" +
                    "Kurang aktivitas fisik dapat menurunkan curah jantung shingga tekanan darah meningkat\n" +
                    "\n" +
                    "3.\tObesitas \n" +
                    "Massa tubuh yang besar meningkatkan jumlah darah yang diperlukan dalam mengedarkan oksigen dan sari makanan ke seluruh jaringan tubuh. Kondisi ini menyebabkan volume darah meningkat sehingga memberikan tekanan yang lebih besar pada dinding arteri\n" +
                    "\n" +
                    "4.\tKonsumsi makanan asin \n" +
                    "Konsumsi garam berlebih meningkatkan volume darah yang berakibat penyempitan pembuluh darah  sehingga jantung harus memompa darah lebih kuat.\n" +
                    "\n" +
                    "5.\tKonsumsi makanan tinggi lemak \n" +
                    "Konsumsi makanan tinggi lemak memicu terjadinya obesitas \n" +
                    "\n" +
                    "6.\tKonsumsi alkohol \n" +
                    "Alkohol dapat meningkatkan keasaman darah sehingga darah menjadi kental dan kerja jantung semakin berat \n" +
                    "\n" +
                    "7.\tKebiasaan merokok\n" +
                    "Nikotin dapat menyempitkan pembuluh darah sehingga jantung harus bekerja lebih keras untuk menggantikan pasokan oksigen menuju jaringan tubuh.\n",
            R.drawable.ic_penyebab,
            R.drawable.ic_penyebab
        )

        val data6 = Hipertensi(
            "Dampak",
            "1.\tStroke \n" +
                    "2.\tJantung koroner \n" +
                    "3.\tGinjal kronis \n" +
                    "4.\tDiabetes \n",
            R.drawable.dampak,
            R.drawable.dampak
        )


        hipertensi.add(data2)
        hipertensi.add(data3)
        hipertensi.add(data4)
        hipertensi.add(data5)
        hipertensi.add(data6)
        return hipertensi
    }



    //not nullable



//    private val judulData = arrayOf(
//        "Indeks Massa Tubuh",
//        "Pengertian",
//        "Klasifikasi Hipertensi",
//        "Tanda dan Gejala",
//        "Penyebab",
//        "Dampak",
//        "Kuis"
//        )
//
//    private val deskripsiData = arrayOf(
//        "Indeks Massa Tubuh",
//        "Hipertensi atau tekanan darah tinggi adalah kondisi peningkatan tekanan darah sistolik dan diastolik.",
//        "Menurut JNC 7, 2003 tekanan darah pada orang dewasa dengan usia ≥ 18 tahun dapat diklasifikasikan menjadi kelompok normal, prehipertensi, hipertensi stage 1, dan hipertensi stage 2 (Chobanian et al., 2003)",
//        "Hipertensi disebut sebagai sillent killer, sehingga kebanyakan penderita hipertensi tidak memiliki gejala sama sekali. Terkadang hipertensi memiliki tanda dan gejala antara lain, sakit kepala, sesak napas, pusing, nyeri dada, jantung berdebar-debar, dan hidung berdarah. Tanda seperti dapat dijadikan peringatan bahwa perlunya perubahan gaya hidup yang signifikan (WHO, 2013)",
//        "Penyebab Yang Tidak Dapat Dikendalikan\n" +
//                "\n" +
//                "1.\tUsia \n" +
//                "Seiring dengan bertambahnya umur, seseorang akan mudah terkena hipertensi karena pembuluh darah yang tidak lentur. Hipertensi lebih berisiko pada kelompok usia > 55 tahun dibandingkan kelompok 40-55 tahun. \n" +
//                "\n" +
//                "2.\tJenis kelamin \n" +
//                "Laki-laki lebih mudah terkena hipertensi dibandingkan wanita. Kejadian hipertensi pada laki-laki sebesar 60% dibandingkan wanita karena laki-laki lebih banyak melakukan aktivitas sehingga timbul kelelahan, pola makan dan pola hidup yang tidak sehat. \n" +
//                "\n" +
//                "3.\tRiwayat keluarga \n" +
//                "Keturunan atau riwayat keluarga dapat menjadi penyebab hipertensi. apabila salah satu orang tua mengalami hipertensi maka penyakit hipertensi akan diturunkan kepada anaknya sebesar 30%, sedangkan apabila kedua orang tua mengalami hipertensi maka penyakit hipertensi akan diturunkan kepada anaknya sebesar 50%. \n" +
//                "\n" +
//                "Penyebab yang dapat dikendalikan \n" +
//                "\n" +
//                "1.\tStress\n" +
//                "Stress timbul karena tekanan pekerjaan, lingkungan sosial, tekanan emosional. Semakin tinggi tingkat stress maka akan menyebabkan hipertensi. \n" +
//                "\n" +
//                "2.\tAktivitas fisik\n" +
//                "Seseorang yang jarang melakukan aktivitas fisik dapat mengalami hipertensi. Tidak melakukan aktivitas fisik denyut nadi jantung akan tinggi.\n" +
//                "Bagaimana bisa kurangnya aktivitas fisik dapat menyebabkan hipertensi ?\n" +
//                "Kurang aktivitas fisik dapat menurunkan curah jantung shingga tekanan darah meningkat\n" +
//                "\n" +
//                "3.\tObesitas \n" +
//                "Massa tubuh yang besar meningkatkan jumlah darah yang diperlukan dalam mengedarkan oksigen dan sari makanan ke seluruh jaringan tubuh. Kondisi ini menyebabkan volume darah meningkat sehingga memberikan tekanan yang lebih besar pada dinding arteri\n" +
//                "\n" +
//                "4.\tKonsumsi makanan asin \n" +
//                "Konsumsi garam berlebih meningkatkan volume darah yang berakibat penyempitan pembuluh darah  sehingga jantung harus memompa darah lebih kuat.\n" +
//                "\n" +
//                "5.\tKonsumsi makanan tinggi lemak \n" +
//                "Konsumsi makanan tinggi lemak memicu terjadinya obesitas \n" +
//                "\n" +
//                "6.\tKonsumsi alkohol \n" +
//                "Alkohol dapat meningkatkan keasaman darah sehingga darah menjadi kental dan kerja jantung semakin berat \n" +
//                "\n" +
//                "7.\tKebiasaan merokok\n" +
//                "Nikotin dapat menyempitkan pembuluh darah sehingga jantung harus bekerja lebih keras untuk menggantikan pasokan oksigen menuju jaringan tubuh.\n",
//        "1.\tStroke \n" +
//                "2.\tJantung koroner \n" +
//                "3.\tGinjal kronis \n" +
//                "4.\tDiabetes \n",
//        "Kuis"
//    )

//    private val iconData = intArrayOf(
//        R.drawable.sa,
//        R.drawable.ic_pengertian,
//        R.drawable.ic_gejala,
//        R.drawable.ic_penyebab,
//        R.drawable.hbg,
//        R.drawable.hh,
//        R.drawable.hm,
//        )
//
//    private val assetData = intArrayOf(
//        R.drawable.ic_penyebab,
//            R.drawable.ic_pengertian,
//            R.drawable.ic_gejala,
//            R.drawable.ic_penyebab,
//            R.drawable.hbg,
//            R.drawable.hh,
//            R.drawable.hm,
//
//            )
//
//    private val assetData2 = intArrayOf(
//        R.drawable.tabel,
//
//    )
//
//
//
//
//    val listData: ArrayList<Hipertensi>
//        get() {
//            val list = arrayListOf<Hipertensi>()
//            for (position in judulData.indices) {
//                val hipertensi = Hipertensi()
//                hipertensi.contentJudul = judulData[position]
//                hipertensi.contentDeskripsi = deskripsiData[position]
//                hipertensi.contentIcon = iconData[position]
//                hipertensi.contentAsset = assetData[position]
////                hipertensi.contentAsset2 = assetData2[position]
//                list.add(hipertensi)
//            }
//            return list
//        }
}