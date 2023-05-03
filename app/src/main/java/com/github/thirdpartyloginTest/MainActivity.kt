package com.github.thirdpartyloginTest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

        }

        binding?.btnQq?.setOnClickListener {

        }

        binding?.btnSina?.setOnClickListener {

        }

        binding?.btnGoogle?.setOnClickListener {

        }

        binding?.btnFacebook?.setOnClickListener {

        }
    }
}