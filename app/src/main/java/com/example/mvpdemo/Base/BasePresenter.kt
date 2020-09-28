package com.example.mvpdemo.Base

import android.view.View

abstract class BasePresenter<T> where T : BaseView {

     var view: BaseView? = null;

    constructor(view: BaseView) {
        this.view = view
    }

    fun onDetach() {
        view = null
    }
}