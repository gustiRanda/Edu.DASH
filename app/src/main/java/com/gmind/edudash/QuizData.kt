package com.gmind.edudash

object QuizData {

    const val score : String = "score"

    fun getSoal() : ArrayList<Quiz>{
        val soal : ArrayList<Quiz> = arrayListOf()

        val soal1 = Quiz(
                1,
                "Seseorang mengalami hipertensi atau tekanan darah tinggi jika tekanan darah sebesar ...",
                "130/90",
                "120/80",
                "110/70",
                1,

        )
        val soal2 = Quiz(
                2,
                "Penyebab yang dapat dikendalikan terjadinya hipertensi antara lain, kecuali …",
                "Kebiasaan merokok",
                "Obesitas atau kegemukan",
                "Jenis Kelamin",
                3,
        )

        val soal3 = Quiz(
                3,
                "Pola makan yang dianjurkan untuk penderita hipertensi adalah ..",

            "Diet DASH",
            "Diet tinggi lemak",
            "Diet tinggi garam",
            1
        )

        val soal4 = Quiz(
                4,
                "Dibawah ini merupakan prinsip diet DASH kecuali..",

            "Konsumsi rendah natrium (makanan yang diawetkan)",
                    "Konsumsi tinggi serat (buah dan sayur)",
                    "Konsumsi tinggi lemak",

                    3
        )

        val soal5 = Quiz(
                5,
                "Dibawah ini kelompok makanan yang tinggi natrium adalah ",

           "Kornet, sosis, ikan asin, abon",
                  " Pisang, melon, semangka",
                    "Sawi,  kacang panjang.",

            1
        )

        val soal6 = Quiz(
                6,
                "Dibawah ini kelompok bumbu yang harus dibatasi penggunaanya adalah  ",

           "Bawang putih, bawang merah, cabe",
                   "Jahe, kunyit",
                  "MSG, kecap asin, bumbu instant",


                    3
        )

        val soal7 = Quiz(
                7,
                "Kulit ayam merupakan makanan sumber … ",

           "Serat",
                  "Vitamin",
                    "Kolesterol",

            3
        )

        val soal8 = Quiz(
                8,
                "Manfaat menerapkan diet DASH, kecuali… ",

            "Meningkatkan tekanan darah",
                    "Menurunkan tekanan darah",
                    "Menurunkan kolesterol darah",


            1
        )

        val soal9 = Quiz(
                9,
                "Dalam sehari mengonsumsi buah dan sayur sesuai anjuran diet DASH sebanyak ...",

           "1 porsi",
                  "3 porsi",
                    "5 porsi",

            3
        )

        val soal10 = Quiz(
                10,
                "Tahu, tempe, dan kacang-kacangan merupakan kelompok sumber makanan ...",

           "Protein nabati",
                  "Protein hewani",
                    "Kolesterol",

            1
        )

        soal.add(soal1)
        soal.add(soal2)
        soal.add(soal3)
        soal.add(soal4)
        soal.add(soal5)
        soal.add(soal6)
        soal.add(soal7)
        soal.add(soal8)
        soal.add(soal9)
        soal.add(soal10)
        return soal
    }
}