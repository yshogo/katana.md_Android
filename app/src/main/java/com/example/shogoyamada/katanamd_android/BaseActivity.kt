package com.example.shogoyamada.katanamd_android

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
    }
}
