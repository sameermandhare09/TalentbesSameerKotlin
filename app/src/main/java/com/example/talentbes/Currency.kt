package com.example.talentbes

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Currency {
    @SerializedName("time")
    @Expose
    var time: Time? = null

    @SerializedName("disclaimer")
    @Expose
    var disclaimer: String? = null

    @SerializedName("chartName")
    @Expose
    var chartName: String? = null

    @SerializedName("bpi")
    @Expose
    var bpi: Bpi? = null

    inner class Bpi {
        @SerializedName("USD")
        @Expose
        var uSD: USD? = null

        @SerializedName("GBP")
        @Expose
        var gBP: GBP? = null

        @SerializedName("EUR")
        @Expose
        var eUR: EUR? = null
    }

    inner class EUR {
        @SerializedName("code")
        @Expose
        var code: String? = null

        @SerializedName("symbol")
        @Expose
        var symbol: String? = null

        @SerializedName("rate")
        @Expose
        var rate: String? = null

        @SerializedName("description")
        @Expose
        var description: String? = null

        @SerializedName("rate_float")
        @Expose
        var rateFloat: Double? = null
    }

    inner class Time {
        @SerializedName("updated")
        @Expose
        var updated: String? = null

        @SerializedName("updatedISO")
        @Expose
        var updatedISO: String? = null

        @SerializedName("updateduk")
        @Expose
        var updateduk: String? = null
    }

    inner class GBP {
        @SerializedName("code")
        @Expose
        var code: String? = null

        @SerializedName("symbol")
        @Expose
        var symbol: String? = null

        @SerializedName("rate")
        @Expose
        var rate: String? = null

        @SerializedName("description")
        @Expose
        var description: String? = null

        @SerializedName("rate_float")
        @Expose
        var rateFloat: Double? = null
    }

    inner class USD {
        @SerializedName("code")
        @Expose
        var code: String? = null

        @SerializedName("symbol")
        @Expose
        var symbol: String? = null

        @SerializedName("rate")
        @Expose
        var rate: String? = null

        @SerializedName("description")
        @Expose
        var description: String? = null

        @SerializedName("rate_float")
        @Expose
        var rateFloat: Double? = null
    }
}