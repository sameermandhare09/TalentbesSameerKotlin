package com.example.talentbes

import android.view.View

class MainActivityContract {
/*

    lateinit var bpi : Currency.Bpi;
    lateinit var viw : View ;
    lateinit var pickerVals : Array<String>;
*/


    interface Cpresenter{

        fun resquestDataFromServer();

    }
    interface  View{

        fun setDataToNumberPicker(currency: Currency);
        fun onResponseFailure(throwable: Throwable);
    }

    interface Model{

        interface OnFinishedListener{

            fun onFinished(currency: Currency);
            fun onFailure(throwable: Throwable);
        }

        fun getCurrencyList(onFinishedListener: OnFinishedListener);
    }
}