package com.example.mvpdemo.Login

import com.example.mvpdemo.Base.BasePresenter

class LoginPresenter(view: MainView) : BasePresenter<MainView>(view) {

    fun onAttched() {

        view?.showProgress();
    }


}