package com.vinayakgardi.unit_converter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    private var length : Button ?= null
    private var weight : Button ?= null
    private var currency : Button ?= null
    private var time : Button ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        length = findViewById<Button>(R.id.length)
        weight = findViewById<Button>(R.id.weight)
        currency = findViewById<Button>(R.id.currency)
        time = findViewById<Button>(R.id.time)


        length?.setOnClickListener {
            val intent = Intent(this,LengthActivity::class.java)
            startActivity(intent)
        }
        weight?.setOnClickListener {
            val intent = Intent(this,WeightActivity::class.java)
            startActivity(intent)
        }
        currency?.setOnClickListener {
            val intent = Intent(this,CurrencyActivity::class.java)
            startActivity(intent)
        }
        time?.setOnClickListener {
            val intent = Intent(this,TimeActivity::class.java)
            startActivity(intent)
        }



        }
    }
