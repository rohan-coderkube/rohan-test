package com.example.mvpdemo.Login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvpdemo.Base.BaseActivity
import com.example.mvpdemo.R

class LoignActivity : AppCompatActivity(), MainView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loign)
    }


    override fun showProgress() {

    }

    override fun hideProgress() {

    }

}


