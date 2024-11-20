package com.example.appcalculo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton: Button = findViewById(R.id.btnCalcular)
        val opA: EditText = findViewById(R.id.txtNumero1)
        val opB: EditText = findViewById(R.id.txtNumero2)
        val res: TextView = findViewById(R.id.textView2)

        boton.setOnClickListener {
            val num1: Int = opA.text.toString().toIntOrNull() ?: 0
            val num2: Int = opB.text.toString().toIntOrNull() ?: 0

            if (num2 != 0) {
                res.text = ((num1.toDouble() / num2) * 100).toString()
            } else {
                res.text = "Error: División por cero"
            }
        }
    }
}