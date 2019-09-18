package com.yoesuv.mycoroutinesnetworking.utils

import android.util.Log
import androidx.appcompat.widget.AppCompatImageView
import androidx.databinding.BindingAdapter
import coil.api.load
import com.yoesuv.mycoroutinesnetworking.BuildConfig
import com.yoesuv.mycoroutinesnetworking.Constants
import com.yoesuv.mycoroutinesnetworking.R

fun logDebug(message: String) {
    if (BuildConfig.DEBUG) Log.d(Constants.TAG_DEBUG, message)
}

fun logError(message: String) {
    if (BuildConfig.DEBUG) Log.e(Constants.TAG_ERROR, message)
}

@BindingAdapter("loadImage")
fun AppCompatImageView.loadImage(imageUrl: String?) {
    this.load(imageUrl){
        crossfade(true)
        placeholder(R.drawable.placeholder_image)
        error(R.drawable.placeholder_image)
    }
}