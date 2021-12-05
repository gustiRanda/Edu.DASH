package com.gmind.edudash

object JenisMakananData {
    fun getJenisMakananData() : ArrayList<JenisMakanan>{
        val jenisMakanan : ArrayList<JenisMakanan> = arrayListOf()

        val data1 = JenisMakanan(
            "Sumber",
            "Bahan Makanan yang Dianjurkan",
            "Bahan Makanan yang Tidak Dianjurkan"
        )

        val data2 = JenisMakanan(
            "Karbohidrat",
            "Beras, kentang, singkong, ubi",
            "Biskuit, nasi uduk, mie instan"
        )

        val data3 = JenisMakanan(
            "Protein Hewani",
            "Ikan, ayam tanpa kulit, telur ayam dan telur bebek maksimal 1 butir per hari",
            "Daging merah berlemak, ikan kaleng, kornet, sosis, ikan asap, ati ampela, kornet, daging asap, ikan asin, abon, dendeng, telur puyuh, kulit ayam"
        )

        val data4 = JenisMakanan(
            "Protein Nabati",
            "Tahu, tempe, kacang hijau, kacang tanah, kacang kedelai, kacang merah, kacang tolo",
            "Kacang dalam kaleng"
        )

        val data5 = JenisMakanan(
            "Sayuran",
            "Semua sayuran segar dianjurkan",
            "Sayur dalam kaleng, asinan sayur"
        )

        val data6 = JenisMakanan(
            "Buah-buahan",
            "Semua buah segar dianjurkan",
            "Buah-buahan kaleng, asinan dan manisan buah"
        )

        val data7 = JenisMakanan(
            "Lemak",
            "Minyak kelapa sawit, margarin, mentega unsalted (tawar)",
            "Margarin, mentega, mayonaise"
        )

        val data8 = JenisMakanan(
            "Minuman",
            "Teh dan jus buah dengan pembatasan gula, susu rendah lemak",
            "Minuman bersoda, minuman kemasan"

        )

        val data9 = JenisMakanan(
            "Bumbu",
            "Rempah-rempah, bumbu segar, garam dapur dengan penggunaan 1/3 sampai  1/2 sendok teh dalam sehari",
            "MSG, kecap, saus  BBQ, saus teriyaki, saus tomat, bumbu instan "
        )

        val data10 = JenisMakanan(
            "Lain-lain",
            "Agar-agar",
            "Kerupuk, snack kemasan, cake manis"
        )



        jenisMakanan.add(data1)
        jenisMakanan.add(data2)
        jenisMakanan.add(data3)
        jenisMakanan.add(data4)
        jenisMakanan.add(data5)
        jenisMakanan.add(data6)
        jenisMakanan.add(data7)
        jenisMakanan.add(data8)
        jenisMakanan.add(data9)
        jenisMakanan.add(data10)
        return jenisMakanan
    }
}