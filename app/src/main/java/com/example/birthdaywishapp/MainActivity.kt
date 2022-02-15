package com.example.birthdaywishapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var btnCard: Button
    private lateinit var teitName: TextInputEditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCard = findViewById(R.id.btn_birthcard)
        teitName = findViewById(R.id.tiet_name)

        btnCard.setOnClickListener {

            val name = teitName.text.toString()
            val intent=Intent(this,Greeting_Card_Activity::class.java)
            intent.putExtra("name",name)
            startActivity(intent)
        }
    }
}