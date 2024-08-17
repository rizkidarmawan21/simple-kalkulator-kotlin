package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val number1 = findViewById<EditText>(R.id.number1)
        val number2 = findViewById<EditText>(R.id.number2)
        val result = findViewById<TextView>(R.id.result)

        val buttonAdd = findViewById<Button>(R.id.buttonAdd)
        val buttonSubtract = findViewById<Button>(R.id.buttonSubtract)
        val buttonMultiply = findViewById<Button>(R.id.buttonMultiply)
        val buttonDivide = findViewById<Button>(R.id.buttonDivide)

        buttonAdd.setOnClickListener {
            val num1 = number1.text.toString().toDouble()
            val num2 = number2.text.toString().toDouble()
            val sum = num1 + num2
            result.text = "Hasil: $sum"
        }

        buttonSubtract.setOnClickListener {
            val num1 = number1.text.toString().toDouble()
            val num2 = number2.text.toString().toDouble()
            val difference = num1 - num2
            result.text = "Hasil: $difference"
        }

        buttonMultiply.setOnClickListener {
            val num1 = number1.text.toString().toDouble()
            val num2 = number2.text.toString().toDouble()
            val product = num1 * num2
            result.text = "Hasil: $product"
        }

        buttonDivide.setOnClickListener {
            val num1 = number1.text.toString().toDouble()
            val num2 = number2.text.toString().toDouble()
            val quotient = num1 / num2
            result.text = "Hasil: $quotient"
        }
    }
}