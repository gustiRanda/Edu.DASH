package com.gmind.edudash

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PolaDietDash2 (
    var column1 : String = "",
    var column2 : String = "",
    var column3 : String = "",
    var column4 : String = ""
) : Parcelable