package com.example.edunavigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun next(view: View){
        val intent = Intent(this, Second_Page_Dice_Roller::class.java)
        startActivity(intent)
    }

    fun toRandom(view: View){
        val intent = Intent(this, Random_activity::class.java)
        startActivity(intent)
    }
}