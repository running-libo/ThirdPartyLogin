package com.github.thirdpartylogin.impl

import com.github.thirdpartylogin.api.ILoginApi
import com.github.thirdpartylogin.api.ILoginCallBack
import com.github.thirdpartylogin.constant.Tags
import com.github.thirdpartylogin.utils.LogUtil

/**
 * @author: libo
 * @date: 2023/5/3 15:20
 * @Description:
 */
class SinaLogin: ILoginApi {

    override fun login(callBack: ILoginCallBack?) {
        LogUtil.v(Tags.COMMON, "sina login start")
    }
}