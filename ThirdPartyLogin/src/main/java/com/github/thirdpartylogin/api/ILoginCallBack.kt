package com.github.thirdpartylogin.api

/**
 * @author: libo
 * @date: 2023/5/3 15:32
 * @Description: 登录结果回调
 */
interface ILoginCallBack {

    fun onLoginSuccess()

    fun onLoginCancel()

    fun onLoginFail()
}