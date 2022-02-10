package com.adityagupta.trivia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_won)

        val homeButton: Button = findViewById<Button>(R.id.homeButton)
        homeButton.setOnClickListener {
            val intent = Intent(this@WonActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}