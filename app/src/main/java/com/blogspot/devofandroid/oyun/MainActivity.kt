package com.blogspot.devofandroid.oyun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonBasla.setOnClickListener {
            startActivity(Intent(this@MainActivity,Oyunekrani::class.java))
        }
    }
}