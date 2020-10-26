package com.example.talentbes

import retrofit2.Call
import retrofit2.http.GET

interface APIInterface {
    @get:GET("currentprice.json/")
    val currency: Call<Currency?>?
}