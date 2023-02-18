package com.vinayakgardi.unit_converter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LengthActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_length)

       val convert: Button = findViewById(R.id.lengthConvert)
       val lengthtext: TextView = findViewById(R.id.Lengthtext)
       val edittext: EditText = findViewById(R.id.ledittext)



        convert.setOnClickListener {
            val m =  edittext.text.toString()
            var meter : Double = m.toDouble()
            val cm : Double= meter * 100.00
            val inch : Double =meter *39.3701
            val foot : Double = meter * 3.28084
            val km : Double = meter * 0.001
            val mile : Double = meter *0.000621371
            val mm : Double = meter * 1000.0



        }


    }
}



