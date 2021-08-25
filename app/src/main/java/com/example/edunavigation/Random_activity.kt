package com.example.edunavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Random_activity : AppCompatActivity() {

    lateinit var results: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random)

        val r_btn: Button = findViewById(R.id.Random_btn)

        r_btn.setOnClickListener {
            randomNumber()
        }

        results = findViewById(R.id.results)

    }

    private fun randomNumber(){
        val n1: Int = findViewById<EditText>(R.id.first_number).getText().toString().toInt()
        val n2: Int = findViewById<EditText>(R.id.second_number).getText().toString().toInt()
        val r1: Int = (n1..n2).random()
        results.setText(r1.toString())
    }
}