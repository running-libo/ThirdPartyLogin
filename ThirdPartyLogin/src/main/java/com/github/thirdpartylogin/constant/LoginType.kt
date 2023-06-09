package com.github.thirdpartylogin.constant

import androidx.annotation.IntDef
import java.lang.annotation.RetentionPolicy

/**
 * @author: libo
 * @date: 2023/5/2 22:46
 * @Description: 定义登录的类型包含种类
 */
@IntDef(
    LoginType.WECHAT,
    LoginType.QQ,
    LoginType.SINA,
    LoginType.GOOGLE,
    LoginType.FACEBOOK)
@java.lang.annotation.Retention(RetentionPolicy.SOURCE)
annotation class LoginType {
    companion object {
        const val WECHAT = 1
        const val QQ = 2
        const val SINA = 3
        const val GOOGLE = 4
        const val FACEBOOK = 5
    }
}