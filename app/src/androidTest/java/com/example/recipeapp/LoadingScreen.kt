package com.example.recipeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoadingScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading)

        val buttonClick = findViewById<Button>(R.id.start_button)
        buttonClick.setOnClickListener {
            val intent = Intent(this@LoadingScreen, com.example.recipeapp.HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}