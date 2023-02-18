package com.vinayakgardi.unit_converter

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.text.Typography.dollar
import kotlin.text.Typography.euro

class CurrencyActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_currency)
//
        val convert : Button = findViewById(R.id.currencyConvert)
        val cedittext : EditText = findViewById(R.id.cedittext)
        val currencytext : TextView = findViewById(R.id.currencytext)


//
        convert.setOnClickListener {
            val rupee : Double =  cedittext.text.toString().toDouble()
            val dollar : Double = rupee * 0.012
            val euro  : Double = rupee *0.011
            val egyptianpound : Double = rupee* 0.37
            val dihram : Double = rupee *0.044
            val jpnyen : Double = rupee * 1.63
              currencytext.append("$dollar\n")
            currencytext.append("$euro\n")
        }
//
    }
}