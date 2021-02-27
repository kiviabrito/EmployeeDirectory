package com.kiviabrito.employeedirectory.utils

import android.view.View

object ViewUtils {

    fun View.setIsVisible(isVisible: Boolean){
        visibility = if (isVisible) {
            View.VISIBLE
        } else {
            View.GONE
        }
    }

}