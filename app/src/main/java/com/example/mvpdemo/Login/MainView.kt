package com.example.mvpdemo.Login

import com.example.mvpdemo.Base.BaseView

interface MainView : BaseView{

    fun showProgress();
    fun hideProgress();

}