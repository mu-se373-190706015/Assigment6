package com.example.assignment6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.RadioButton
import android.widget.RadioGroup

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val username=findViewById(R.id.editTextUsername)as EditText
        val email=findViewById(R.id.editTextEmail)as EditText
        val password=findViewById(R.id.editTextPassword)as EditText

        val progres=findViewById(R.id.progressBar)as ProgressBar
        val radiogroup=findViewById(R.id.radioGender)as RadioGroup

    }
}