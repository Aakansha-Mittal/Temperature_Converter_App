package com.example.temperature_converter_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickNext(view : View) {
        val data = (view as Button).text.toString()
        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("data", data)
        startActivity(intent)
    }
}