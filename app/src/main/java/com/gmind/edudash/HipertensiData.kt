package com.gmind.edudash

object HipertensiData {

    //nullable type

    fun getHipertensiData() : ArrayList<Hipertensi>{
        val hipertensi : ArrayList<Hipertensi> = arrayListOf()


        val data2 = Hipertensi(
            "Pengertian Hipertensi",
            "Hipertensi atau tekanan darah tinggi adalah kondisi peningkatan tekanan darah sistolik dan diastolik diatas 140/90 mmHg.",
                "",
                "",
                "",
            R.drawable.ic_pengertian,
            R.drawable.ic_pengertian
        )


        val data3 = Hipertensi(
            "Klasifikasi Hipertensi",
            "",
                "",
                "",
                "",
            R.drawable.klasifikasi,
            R.drawable.klasifikasi,
            R.drawable.tabel
        )

        val data4 = Hipertensi(
            "Tanda dan Gejala Hipertensi",
            "Hipertensi disebut sebagai sillent killer, sehingga kebanyakan penderita hipertensi tidak memiliki gejala sama sekali. Terkadang hipertensi memiliki tanda dan gejala antara lain : \n" +
                    "\n1. Sakit kepala\n" +
                    "\n2. Sesak napas\n" +
                    "\n3. Pusing, nyeri dada\n" +
                    "\n4. Jantung berdebar-debar\n" +
                    "\n5. Hidung berdarah \n" +
                    "\n(WHO, 2013)\n",
                "",
                "",
                "",
            R.drawable.ic_gejala,
            R.drawable.ic_gejala
        )

        val data5 = Hipertensi(
            "Komplikasi Hipertensi",
            "\n1. Stroke\n" +
                    "\n2. Jantung Koroner\n" +
                    "\n3. Ginjal Kronis\n" +
                    "\n4. Diabetes Mellitus\n",
                "",
                "",
                "",
            R.drawable.ic_gejala,
            R.drawable.ic_gejala
        )

        val data6 = Hipertensi(
            "Penyebab Hipertensi",
            "Penyebab Yang Tidak Dapat Dikendalikan\n" +

                    "\n" +
                    "1.\tUsia \n" +
                    "Seiring dengan bertambahnya umur, seseorang akan mudah terkena hipertensi karena pembuluh darah yang tidak lentur. Hipertensi lebih berisiko pada kelompok usia > 55 tahun dibandingkan kelompok 40-55 tahun. \n" +

                    "\n" +
                    "2.\tJenis kelamin \n" +
                    "Laki-laki lebih mudah terkena hipertensi dibandingkan wanita. Kejadian hipertensi pada laki-laki sebesar 60% dibandingkan wanita karena laki-laki lebih banyak melakukan aktivitas sehingga timbul kelelahan, pola makan dan pola hidup yang tidak sehat. \n" +

                    "\n" +
                    "3.\tRiwayat keluarga \n" +
                    "Keturunan atau riwayat keluarga dapat menjadi penyebab hipertensi. apabila salah satu orang tua mengalami hipertensi maka penyakit hipertensi akan diturunkan kepada anaknya sebesar 30%, sedangkan apabila kedua orang tua mengalami hipertensi maka penyakit hipertensi akan diturunkan kepada anaknya sebesar 50%.  \n" +

                    "\n" +
                    "Penyebab yang dapat dikendalikan \n" +

                    "\n" +
                    "1.\tStress\n" +
                    "Stress timbul karena tekanan pekerjaan, lingkungan sosial, tekanan emosional. Semakin tinggi tingkat stress maka akan menyebabkan hipertensi. \n" +

                    "\n" +
                    "2.\tAktivitas fisik\n" +
                    "Seseorang yang jarang melakukan aktivitas fisik dapat mengalami hipertensi. Kurang aktivitas fisik dapat menurunkan curah jantung shingga tekanan darah meningkat. \n" +

                    "\n" +
                    "3.\tObesitas\n" +
                    "Kondisi tubuh yang besar dapat meningkatkan tekanan pada dinding pembuluh darah yang memicu hipertensi. \n" +

                    "\n" +
                    "4.\tKonsumsi makanan tinggi natrium \n" +
                    "Makanan gurih, berpengawet, kemasan, kalengan merupakan makanan tinggi natrium berakibat penyempitan pembuluh darah  sehingga jantung harus memompa darah lebih kuat dan menyebabkan peningkatan tekanan darah. \n" +

                    "\n" +
                    "5.\tKonsumsi alkohol \n" +
                    "Alkohol dapat meningkatkan keasaman darah sehingga darah menjadi kental dan kerja jantung semakin berat yang berakibat peningkatan tekanan darah. \n" +

                    "\n" +
                    "6.\tKebiasaan merokok\n" +
                    "Nikotin dapat menyempitkan pembuluh darah sehingga jantung harus bekerja lebih keras untuk menggantikan pasokan oksigen menuju jaringan tubuh.\n",
                "",
                "",
                "",
            R.drawable.ic_penyebab,
            R.drawable.ic_penyebab
        )

        val data7 = Hipertensi(
                "Diet DASH",
                "\nDiet Dietary Approaches to Stop Hypertension (DASH) merupakan salah satu diet atau pengaturan pola makan pada penderita hipertensi untuk membantu terapi atau mencegah hipertensi (darah tinggi). \n" +

                        "\n" +
                        "\nPrinsip diet DASH antara lain : \n" +
                        "\n1. Konsumsi makanan rendah lemak jenuh, kolesterol, dan lemak total. \n" +
                        "\n2. Konsumsi makanan tinggi serat seperti buah dan sayur.\n" +
                        "\n3. Konsumsi produk susu rendah lemak atau bebas lemak. \n" +
                        "\n4. Konsumsi makanan rendah gula. \n" +
                        "\n5. Mengurangi konsumsi makanan tinggi natrium atau garam, dan makanan yang diawetkan. \n" +
                        "\n6. Konsumsi makanan tinggi protein \n" +
                        "\n7. Konsumsi natrium hanya 1500 mg per hari atau setara dengan garam 1/3 sendok teh dalam sehari\n" +
                        "\n8. Konsumsi natrium hanya 2300 mg per hari atau setara dengan garam 1/2 sendok teh dalam sehari, jika tidak dengan komplikasi jantung dan ginjal kronis\n" +

                        "\n" +
                        "\nManfaat menerapkan diet DASH antara lain : \n" +
                        "\n1. Menurunkan tekanan darah \n" +
                        "\n2. Menurunkan berat badan apabila mengalami kegemukan \n" +
                        "\n3. Menurunkan kadar LDL dalam darah\n" +
                        "\n4. Menurunkan kadar kolesterol dalam darah \n" +
                        "\n5. Menurunkan risiko penyakit jantung\n" +

                        "\n" +
                        "\nTips Mengurangi Garam dan Natrium \n" +
                        "\n1. Untuk sayuran pilih sayuran segar\n" +
                        "\n2. Pilih unggas segar, ikan, dan daging tanpa lemak, dan daging yang diolah dengan pengasapan.\n" +
                        "\n3. Mengurangi atau membatasi makanan yang diawetkan seperti sosis, ikan asin, keju, abon, dendeng, kornet. Serta makanan yang direndam dengan air garam (acar) \n" +
                        "\n4. Mengurangi atau membatasi penggunaan bumbu (saus tomat, saus BBQ, kecap asin, saus teriyaki, saus mustard, dan saus dengan bahan yang mengandung garam, MSG) \n" +
                        "\n5. Mengurangi atau membatasi penggunaan garam sebanyak 1/3 sampai ½ sendok teh sehari\n" +
                        "\n6. Mengurangi atau membatasi makanan instan, cepat saji, sup instan dan kaldu kalengan. \n" +
                        "\n7. Disarankan ketika memasak ikan asin, bilas ikan tersebut untuk mengurangi natrium.\n" +
                        "\n8. Disarankan menggunakan rempah-rempah, jeruk nipis sebagai bumbu masakan seperti bawang merah, bawang putih, jahe, kunyit, dll\n" +
                        "\n9. Disarankan untuk selingan mengonsumsi buah dibandingkan dengan makanan ringan. \n" +

                        "\n" +
                        "\nTips Membaca Label Makanan",
                "\nPOLA DIET DASH \n",
                "\nPOLA DIET DASH \n",
                "\nJENIS MAKANAN YANG DIANJURKAN DAN TIDAK DIANJURKAN \n",

                R.drawable.ic_gejala,
                R.drawable.ic_gejala,
                R.drawable.produk_tinggi_natrium,
                R.drawable.produk_rendah_natrium

        )



        hipertensi.add(data2)
        hipertensi.add(data3)
        hipertensi.add(data4)
        hipertensi.add(data5)
        hipertensi.add(data6)
        hipertensi.add(data7)
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