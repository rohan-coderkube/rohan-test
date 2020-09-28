package com.example.mvpdemo.Login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvpdemo.Base.BaseActivity
import com.example.mvpdemo.R

class LoignActivity : BaseActivity<out LoginPresenter>(), MainView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loign)
        presenter?.onAttched()

    }

    override fun createPresenter(): LoginPresenter {
        var obj = LoginPresenter(this)
        return obj;
    }

    override fun showProgress() {

    }

    override fun hideProgress() {

    }

}