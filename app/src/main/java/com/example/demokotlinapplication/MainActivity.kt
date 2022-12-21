package com.example.demokotlinapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val showDataButton = findViewById<Button>(R.id.showDataButton)
        val nameSurname = findViewById<EditText>(R.id.nameSurname)
        val resultField = findViewById<TextView>(R.id.resultField)

        showDataButton.setOnClickListener {
            resultField.text = nameSurname.text
            nameSurname.text.clear()
        }
    }
}