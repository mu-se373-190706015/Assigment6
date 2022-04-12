package com.example.assignment6

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val textid = findViewById(R.id.textViewId)as TextView
        val usertext = findViewById(R.id.textViewUsername)as TextView
        val textviewemail = findViewById(R.id.textViewEmail)as TextView
        val textGender = findViewById(R.id.textViewGender)as TextView
        val btnlog=findViewById(R.id.buttonLogout)as Button



    }


}