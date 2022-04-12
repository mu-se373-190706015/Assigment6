package com.example.assignment6

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {

   lateinit var sharedPreferences:SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btn=findViewById(R.id.btnLogin) as Button
        val etuser=findViewById(R.id.etUserPassword) as EditText
        val etpassword=findViewById(R.id.etUserPassword) as EditText

          var sharedPreferences=this.getSharedPreferences("axis1", Context.MODE_PRIVATE)





    }
}