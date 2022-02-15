package com.example.birthdaywishapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Greeting_Card_Activity : AppCompatActivity() {

    private lateinit var tv_card: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting_card)

        tv_card = findViewById(R.id.tv_card)

        val card = intent.getStringExtra("name")
        tv_card.text = card

    }
}