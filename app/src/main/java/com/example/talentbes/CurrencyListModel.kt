package com.example.talentbes

import com.example.talentbes.ApiClient.client
import com.example.talentbes.MainActivityContract.Model.OnFinishedListener
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CurrencyListModel : MainActivityContract.Model {
    override fun getCurrencyList(onFinishedListener: OnFinishedListener) {
        val apiService = client!!.create(APIInterface::class.java)
        val call = apiService.currency
        call!!.enqueue(object : Callback<Currency?> {
            override fun onResponse(call: Call<Currency?>, response: Response<Currency?>) {
                onFinishedListener.onFinished(response.body()!!)
            }

            override fun onFailure(call: Call<Currency?>, t: Throwable) {
                onFinishedListener.onFailure(t)
            }
        })
    }
}