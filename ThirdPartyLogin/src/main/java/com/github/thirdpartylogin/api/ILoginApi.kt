package com.github.thirdpartylogin.api

import com.github.thirdpartylogin.constant.PlatformType
import com.github.thirdpartylogin.impl.*

/**
 * @author: libo
 * @date: 2023/5/3 11:16
 * @Description: 抽象登录类型
 */
interface ILoginApi {

    fun login(callBack: ILoginCallBack?)

    class Factory {

        companion object {
            /**
            * 根据三方登录平台创建对应功能实现
            * @param
            * @return
            */
            fun create(@PlatformType platformType: Int): ILoginApi? {
                return when(platformType) {
                    PlatformType.WECHAT -> {
                        WechatLogin()
                    }
                    PlatformType.QQ -> {
                        QQLogin()
                    }
                    PlatformType.SINA -> {
                        SinaLogin()
                    }
                    PlatformType.GOOGLE -> {
                        GoogleLogin()
                    }
                    PlatformType.FACEBOOK -> {
                        FacebookLogin()
                    }
                    else -> {
                        null
                    }
                }
            }
        }
    }
}