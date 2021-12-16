package com.example.daliev_azim_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class activity_first : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val textView = findViewById<ImageView>(R.id.favourites)

        textView.setOnClickListener{
            startActivity(Intent(this,activity_favored::class.java))
        }

    }
}