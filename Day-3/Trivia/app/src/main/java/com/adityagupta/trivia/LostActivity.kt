package com.adityagupta.trivia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LostActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lost)

        val tryAgainButton: Button = findViewById<Button>(R.id.tryAgainButton)
        tryAgainButton.setOnClickListener {
            val intent = Intent(this@LostActivity, QuestionsActivity::class.java)
            startActivity(intent)
        }
    }
}