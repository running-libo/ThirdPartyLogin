package com.github.thirdpartylogin.utils

import android.util.Log
import com.github.thirdpartylogin.BuildConfig

/**
 * @author: libo
 * @date: 2023/5/3 09:43
 * @Description: 日志工具类，仅在debug模式下打日志
 */
object LogUtil {

    inline fun v(tag:() -> String, message:() -> String) {
        if (BuildConfig.IS_DEBUG) {
            Log.v(tag(), message())
        }
    }

    fun v(tag: String, msg: String) {
        if (BuildConfig.IS_DEBUG) {
            Log.v(tag, msg)
        }
    }

    fun e(tag: String, msg: String) {
        if (BuildConfig.IS_DEBUG) {
            Log.e(tag, msg)
        }
    }

    fun d(tag: String, msg: String) {
        if (BuildConfig.IS_DEBUG) {
            Log.d(tag, msg)
        }
    }
}