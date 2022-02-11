package com.adityagupta.avengers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.create

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val api = RetrofitHelper.getInstance().create(Api::class.java)

        GlobalScope.launch {
            val result = api.getQuotes()
            Log.i("avengers", result.body().toString())
        }
    }
}