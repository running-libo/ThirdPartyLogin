package com.github.thirdpartylogin.factory

import com.github.thirdpartylogin.api.ILogin
import com.github.thirdpartylogin.constant.LoginType

/**
 * @author: libo
 * @date: 2023/5/3 11:29
 * @Description: 各种登录工厂的接口
 */
interface LoginFactory {

    fun create(@LoginType loginType: Int): ILogin
}