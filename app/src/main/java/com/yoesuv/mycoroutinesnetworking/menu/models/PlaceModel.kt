package com.yoesuv.mycoroutinesnetworking.menu.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PlaceModel(
    val name: String?,
    val location: String?,
    val description: String?,
    val thumbnail: String?,
    val image: String?
) : Parcelable