package com.example.talentbes

import com.example.talentbes.MainActivityContract.Cpresenter
import com.example.talentbes.MainActivityContract.Model.OnFinishedListener

class MainActivityPresenter(var view: MainActivityContract.View?) : Cpresenter, OnFinishedListener {
    var model: CurrencyListModel

    override fun onFinished(currency: Currency) {
        view!!.setDataToNumberPicker(currency)
        if (view != null) {
//            view.hideProgress()
        }
    }

    override fun onFailure(t: Throwable) {
        view!!.onResponseFailure(t)
        if (view != null) {
//            view.hideProgress()
        }
    }

    init {
        model = CurrencyListModel()
    }

    override fun resquestDataFromServer() {

        model.getCurrencyList(this)
    }
}