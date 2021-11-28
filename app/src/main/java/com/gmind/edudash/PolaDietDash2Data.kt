package com.gmind.edudash

object PolaDietDash2Data {
    fun getPolaDietDash2Data() : ArrayList<PolaDietDash2>{
        val polaDietDash2 : ArrayList<PolaDietDash2> = arrayListOf()

        val data1 = PolaDietDash2(
            "Kelompok Makanan",
            "Sajian/Hari",
            "Porsi",
            "Contoh"
        )

        val data2 = PolaDietDash2(
            "Sumber Karbohidrat",
            "2-8",
            "½ gls beras ,½ gls bihun, 4 bj sdg kentang, ½ gls makaroni, ½ gls jagung segar, 3 lembar roti tawar, 1 bh sdg ubi\n" +
                    "5 sdm tepung beras",
            "Beras, bihun, jagung segar, makaroni, kentang, mie basah, mie kering, singkong, talas, tepung beras, tepung terigu, ubi."

        )

        val data3 = PolaDietDash2(
            "Sayur",
            "3-4",
            "1 mangkok sayur matang \n" +
                    "2 mangkok sayur mentah",
            "Bayam, buncis, kol, kembang kol, kapri, daun katuk, kangkung, wortel, brokoli, jagung muda"
        )

        val data4 = PolaDietDash2(
            "Buah",
            "5-6",
            "1 bh bsr belimbing, 2 bh sdg jeruk  manis, 1 bh bsr jambu biji , 1 ptg sdg melon, ½ bh sdg pear, 1 bh pisang ambon, 1 ptg bsr pepaya, 2 ptg sdg semangka",
            "Belimbing, jeruk, jambu biji, melon, pear, pisang ambon, melon, pepaya, semangka"
        )

        val data5 = PolaDietDash2(
            "Susu tanpa lemak atau rendah lemak",
            "1",
            "1 gls susu skim cair , 2/3 gls yogurt",
            "Yogurt, keju, susu sapi, susu skim"
        )

        val data6 = PolaDietDash2(
            "Daging, unggas, ikan",
            "2-3",
            "1 ptg sdg ayam tanpa kulit ,1/3 ekor sdg ikan segar, 5 ekor sdg udang segar\n" +
                    "1 ½ butir putih telur",
            "Daging tanpa lemak, ayam tanpa kulit, ikan, telur ayam"
        )

        val data7 = PolaDietDash2(
            "Kacang-kacangan",
            "4-5",
            "2 sdm kacang hijau, 2 ½ sdm kacang kedelai, 2 ptg sdg tempe,1 ptg sdg tahu",
            "Kacang hijau, kacang merah, kacang kedelai, tahu, tempe, kacang tanah, kacang tolo"
        )

        val data8 = PolaDietDash2(
            "Minyak dan Lemak",
            "2-3",
            "1 sdt minyak kelapa sawit , 1/3 gls santan, 1 sdt mentega , 1 sdt minyak kelapa, 1 sdt minyak vegan",
            "Minyak kelapa sawit, minyak kelapa, minyak wijen, minyak jagung, minyak kelapa, santaan, mentega"
        )

        val data9 = PolaDietDash2(
            "Gula",
            "2-4",
            "1 sdm gula pasir ,1 sdm madu",
            "Gula pasir, madu"
        )

        val data10 = PolaDietDash2(
            "Garam",
            "3,5",
            "1/3 - ½ sdt",
            "Penambahan garam pada masakan"
        )

        polaDietDash2.add(data1)
        polaDietDash2.add(data2)
        polaDietDash2.add(data3)
        polaDietDash2.add(data4)
        polaDietDash2.add(data5)
        polaDietDash2.add(data6)
        polaDietDash2.add(data7)
        polaDietDash2.add(data8)
        polaDietDash2.add(data9)
        polaDietDash2.add(data10)
        return polaDietDash2
    }
}