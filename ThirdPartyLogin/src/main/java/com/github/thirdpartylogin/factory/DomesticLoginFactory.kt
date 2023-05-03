package com.github.thirdpartylogin.factory

import com.github.thirdpartylogin.api.ILogin
import com.github.thirdpartylogin.constant.LoginType
import com.github.thirdpartylogin.impl.WechatLogin

/**
 * @author: libo
 * @date: 2023/5/3 11:33
 * @Description: 国内登录类型factory
 */
class DomesticLoginFactory: LoginFactory {

    override fun create(@LoginType loginType: Int): ILogin {
        return when(loginType) {
            LoginType.WECHAT -> {
                WechatLogin()
            }
            else -> {
                WechatLogin()
            }
        }
    }
}