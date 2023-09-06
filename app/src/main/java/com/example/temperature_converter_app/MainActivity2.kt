package com.example.temperature_converter_app

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity2 : AppCompatActivity() {

    private var tempConvert : Float = 0.0F

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val data = (intent.getStringExtra("data")).toString()
        val temp = findViewById<TextInputEditText>(R.id.temp)
        val btnConvert = findViewById<Button>(R.id.btnConvert)
        val ansTemp = findViewById<TextView>(R.id.ansTemp)

        temp.hint = "Temperature in ${data[0]}"

        btnConvert.setOnClickListener {
            if(temp.text?.isEmpty()!!){
                Toast.makeText(this, "Enter Temperature", Toast.LENGTH_SHORT).show()
            } else {
                val value = Integer.parseInt(temp.text.toString())

                if (data == "C to F") {
                    tempConvert = ((value * 9 / 5) + 32).toFloat()
                } else if (data == "C to K") {
                    tempConvert = (value + 273.15).toFloat()
                } else if (data == "K to C") {
                    tempConvert = (value - 273.15).toFloat()
                } else if (data == "K to F") {
                    tempConvert = ((value - 273.15) * 9 / 5 + 32).toFloat()
                } else if (data == "F to C") {
                    tempConvert = ((value - 32) * 5 / 9).toFloat()
                } else if (data == "F to K") {
                    tempConvert = (((value - 32) * 5 / 9) + 273.15).toFloat()
                } else {
                    Toast.makeText(this, "Wrong conversion unit", Toast.LENGTH_SHORT).show()
                }
                ansTemp.text = "$tempConvert  ${data[5]}"
                ansTemp.alpha = 1f
            }
        }
    }
}
