package com.zxpty.restaurantapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.Zxpty.restaurantapp.R

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val tvResult = findViewById<TextView>(R.id.tvResult)
        val name:String= intent.extras?.getString("EXTRA_NAME").orEmpty()
        tvResult.text = "Hola $name"


    }
}