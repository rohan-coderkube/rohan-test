package com.example.mvpdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvpdemo.Base.BaseActivity
import com.example.mvpdemo.Base.BasePresenter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}