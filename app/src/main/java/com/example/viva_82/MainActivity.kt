package com.example.viva_82

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button=findViewById<Button>(R.id.button)
        val email=findViewById<EditText>(R.id.editTextTextEmailAddress)
        val pas=findViewById<EditText>(R.id.editTextTextPassword)
        button.setOnClickListener(){
            Toast.makeText(this,"Email: "+email.text.toString()+"Password:"+pas.text.toString(),Toast.LENGTH_LONG).show()
        }
    }
}