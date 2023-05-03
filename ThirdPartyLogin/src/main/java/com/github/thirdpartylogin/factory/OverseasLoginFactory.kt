package com.github.thirdpartylogin.factory

import com.github.thirdpartylogin.api.ILogin
import com.github.thirdpartylogin.constant.LoginType
import com.github.thirdpartylogin.impl.GoogleLogin

/**
 * @author: libo
 * @date: 2023/5/3 11:33
 * @Description: 海外登录类型factory
 */
class OverseasLoginFactory: LoginFactory {

    override fun create(loginType: Int): ILogin {
        return when(loginType) {
            LoginType.GOOGLE -> {
                GoogleLogin()
            }
            else -> {
                GoogleLogin()
            }
        }
    }
}