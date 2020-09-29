package com.example.mvpdemo.Base

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.e("pika","pika")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("pika","pika")

    }
}