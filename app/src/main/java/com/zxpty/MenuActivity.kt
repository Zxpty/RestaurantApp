package com.zxpty

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.Zxpty.restaurantapp.R
import com.zxpty.restaurantapp.MainActivity

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSeeCart = findViewById<TextView>(R.id.ButtonCarta)
        btnSeeCart.setOnClickListener { navigateToSeeCart() }


    }
    private fun navigateToSeeCart(){
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}