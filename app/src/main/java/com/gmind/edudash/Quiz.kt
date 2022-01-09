package com.gmind.edudash

data class Quiz (
        var id:  Int = 0,
        var soal : String = "",
        var soalPhoto : Int = 0,

        var opsi1 : String = "",
        var opsi2 : String = "",
        var opsi3 : String = "",
        var jawaban : Int = 0

)