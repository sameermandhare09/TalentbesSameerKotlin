package com.example.talentbes

import android.os.Bundle
import android.widget.NumberPicker
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(),NumberPicker.OnValueChangeListener,MainActivityContract.View {

    lateinit var txt_price : TextView;
    lateinit var nbr_price : NumberPicker;
    lateinit var pickerVals : Array<String>;
    lateinit var bpi : Currency.Bpi;



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide()
        initUi();
        var mainActivityPresenter = MainActivityPresenter(this);
        mainActivityPresenter.resquestDataFromServer();
        nbr_price.setOnValueChangedListener(this);

    }

    private fun initUi() {
        txt_price = findViewById(R.id.txt_price);
        nbr_price = findViewById(R.id.nbr_price);
//        pickerVals = arrayOf("fgas","BGP","EUR","USD","has");

        nbr_price.maxValue = 4
        nbr_price.minValue = 0
    }

    override fun onValueChange(p0: NumberPicker?, p1: Int, p2: Int) {

        var pos : Int = nbr_price.value;
        if (pickerVals[pos].equals("GBP")){

            txt_price.setText(bpi.gBP!!.rate)
        }else if(pickerVals[pos].equals("USD")){

            txt_price.setText(bpi.uSD!!.rate)
        }else if(pickerVals[pos].equals("EUR")){

            txt_price.setText(bpi.eUR!!.rate)
        }else{
            txt_price.setText("Price");
        }



    }

    override fun setDataToNumberPicker(currency: Currency) {

        bpi = currency.bpi!!;
        pickerVals = arrayOf(
            "ASA", bpi.eUR!!.code.toString(),
            bpi.uSD!!.code.toString(), bpi.gBP!!.code.toString(), "IR"
        );

        nbr_price.displayedValues = pickerVals;
    }

    override fun onResponseFailure(throwable: Throwable) {
        TODO("Not yet implemented")
    }
}
