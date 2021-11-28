package com.gmind.edudash

object PolaDietDashData {
    fun getPolaDietDashData() : ArrayList<PolaDietDash>{
        val polaDietDash : ArrayList<PolaDietDash> = arrayListOf()

        val data1 = PolaDietDash(
            "Kelompok Makanan",
            "Sajian/Hari"
        )

        val data2 = PolaDietDash(
            "Sumber Karbohidrat",
            "4"
        )

        val data3 = PolaDietDash(
            "Sayur",
            "4"
        )

        val data4 = PolaDietDash(
            "Buah",
            "4"
        )

        val data5 = PolaDietDash(
            "Susu tanpa lemak atau rendah lemak",
            "1"
        )

        val data6 = PolaDietDash(
            "Daging, unggas, ikan",
            "2"
        )

        val data7 = PolaDietDash(
            "Kacang-kacangan",
            "4"
        )

        val data8 = PolaDietDash(
            "Minyak dan Lemak",
            "2"
        )

        val data9 = PolaDietDash(
            "Gula",
            "2"
        )

        val data10 = PolaDietDash(
            "Garam",
            "1/3 – ½ sendok teh"
        )

        polaDietDash.add(data1)
        polaDietDash.add(data2)
        polaDietDash.add(data3)
        polaDietDash.add(data4)
        polaDietDash.add(data5)
        polaDietDash.add(data6)
        polaDietDash.add(data7)
        polaDietDash.add(data8)
        polaDietDash.add(data9)
        polaDietDash.add(data10)
        return polaDietDash
    }
}