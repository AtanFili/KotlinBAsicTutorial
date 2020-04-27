package com.example.kotlinbasictutorial

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_calc3_layout.*

class Calc3Activity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc3_layout)

        operators()
    }

    fun operators() {
        button_calc3_Add.setOnClickListener {
            var firstNumberText: String = edit_text_number1.text.toString()
            var secondNumberText: String = edit_text_number2.text.toString()
            if (firstNumberText.isEmpty() || secondNumberText.isEmpty()) {
                calc3_result.text = "0"
                Toast.makeText(applicationContext, "no calue entered", Toast.LENGTH_LONG).show()
            } else {
                var result = firstNumberText.toInt() + secondNumberText.toInt()
                calc3_result.text = "$result"
            }
        }
        button_calc3_Div.setOnClickListener {
            var firstNumberText: String = edit_text_number1.text.toString()
            var secondNumberText: String = edit_text_number2.text.toString()
            if (firstNumberText.isEmpty() || secondNumberText.isEmpty()) {
                calc3_result.text = "0"
            } else {
                var result=firstNumberText.toInt()/secondNumberText.toInt()
                calc3_result.text = "$result"
            }
        }
        button_calc3_MUL.setOnClickListener {
            var firstNumberText: String = edit_text_number1.toString()
            var secondNumberText: String = edit_text_number2.toString()
            if (firstNumberText.isEmpty() || secondNumberText.isEmpty()) {
                calc3_result.text = "0"
            } else {
                var result = firstNumberText.toInt() * secondNumberText.toInt()
                calc3_result.text = "$result"
            }
        }

        button_calc3_Sub.setOnClickListener {
            var firstNumberText: String = edit_text_number1.toString()
            var secondNumberText: String = edit_text_number2.toString()
            if (firstNumberText.isEmpty() || secondNumberText.isEmpty()) {
                calc3_result.text = "0"
            } else {
                var result = firstNumberText.toInt() - secondNumberText.toInt()
                calc3_result.text = "$result"
            }
        }
    }
}






