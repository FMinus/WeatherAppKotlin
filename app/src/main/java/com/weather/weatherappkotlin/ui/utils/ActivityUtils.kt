package com.weather.weatherappkotlin.ui.utils

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

fun Context.toast(message: CharSequence, length: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, length).show()
}

val ViewGroup.childViews: List<View>
    get() = (0 until childCount).map { getChildAt(it) }

