package com.adityagupta.currencyconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.core.widget.doOnTextChanged

class MainActivity : AppCompatActivity() {

    val dollarValue = 74.81
    val rupeeValue = 0.013
    lateinit var dollarEditText: EditText
    lateinit var rupeeEditText: EditText
    lateinit var convertButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dollarEditText = findViewById(R.id.editTextDollar)
        rupeeEditText = findViewById(R.id.editTextRupee)
        convertButton = findViewById(R.id.convertButton)

        convertButton.setOnClickListener {
            convert()
        }
        

    }

    fun convert(){
        if(dollarEditText.text.isNotEmpty() || rupeeEditText.text.isNotEmpty()){
            if(dollarEditText.text.isNotEmpty()){
                val ans = dollarToRupee(dollarEditText.text.toString().toDouble())
                rupeeEditText.setText(ans.toString())
            }else{
                val ans = rupeeToDollar(rupeeEditText.text.toString().toDouble())
                dollarEditText.setText(ans.toString())
            }
        }
    }

    fun dollarToRupee(dollar: Double): Double = dollar * dollarValue
    fun rupeeToDollar(rupee: Double): Double = rupee * rupeeValue
}