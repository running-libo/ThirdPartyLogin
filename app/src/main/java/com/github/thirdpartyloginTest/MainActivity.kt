package com.github.thirdpartyloginTest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.thirdpartylogin.api.ILoginApi
import com.github.thirdpartylogin.api.ILoginCallBack
import com.github.thirdpartylogin.constant.PlatformType
import com.github.thirdpartylogin.constant.Tags
import com.github.thirdpartylogin.utils.LogUtil
import com.github.thirdpartyloginTest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        event()
    }

    private fun event() {
        binding?.btnWechat?.setOnClickListener {
            handleLogin(PlatformType.WECHAT, Tags.WECHAT)
        }

        binding?.btnQq?.setOnClickListener {
            handleLogin(PlatformType.QQ, Tags.QQ)
        }

        binding?.btnSina?.setOnClickListener {
            handleLogin(PlatformType.SINA, Tags.SINA)
        }

        binding?.btnGoogle?.setOnClickListener {
            handleLogin(PlatformType.GOOGLE, Tags.GOOGLE)
        }

        binding?.btnFacebook?.setOnClickListener {
            handleLogin(PlatformType.FACEBOOK, Tags.FACEBOOK)
        }
    }

    private fun handleLogin(@PlatformType platformType: Int, tag: String) {
        LogUtil.v(Tags.COMMON, "$platformType login click")
        ILoginApi.Factory.create(platformType)?.login(object: ILoginCallBack {
            override fun onLoginSuccess() {
                LogUtil.v(tag, "$platformType onLoginSuccess")
            }

            override fun onLoginCancel() {
                LogUtil.v(tag, "$platformType onLoginCancel")
            }

            override fun onLoginFail() {
                LogUtil.v(tag, "$platformType onLoginFail")
            }
        })
    }
}