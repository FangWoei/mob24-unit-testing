package com.foo.mob24test.core

import android.util.Log

object Utils {
    fun <T> debugLog(tag: String = "debugging"): (T) -> Unit {
        return {
            Log.d(tag, it.toString())
        }
    }
}