package com.github.thirdpartyloginTest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.thirdpartylogin.api.ILogin
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
            LogUtil.v(Tags.COMMON, "wechat login click")
        }

        binding?.btnQq?.setOnClickListener {
            LogUtil.v(Tags.COMMON, "qq login click")
        }

        binding?.btnSina?.setOnClickListener {
            LogUtil.v(Tags.COMMON, "sina login click")
        }

        binding?.btnGoogle?.setOnClickListener {
            LogUtil.v(Tags.COMMON, "google login click")
        }

        binding?.btnFacebook?.setOnClickListener {
            LogUtil.v(Tags.COMMON, "facebook login click")
        }
    }
}