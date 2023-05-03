package com.github.thirdpartylogin.constant

import androidx.annotation.IntDef

/**
 * @author: libo
 * @date: 2023/5/2 22:46
 * @Description: 定义登录的类型包含种类
 */
@IntDef(
    PlatformType.WECHAT,
    PlatformType.QQ,
    PlatformType.SINA,
    PlatformType.GOOGLE,
    PlatformType.FACEBOOK)
@Retention(AnnotationRetention.SOURCE)
@Target(AnnotationTarget.VALUE_PARAMETER)
annotation class PlatformType {
    companion object {
        const val WECHAT = 1
        const val QQ = 2
        const val SINA = 3
        const val GOOGLE = 4
        const val FACEBOOK = 5
    }
}