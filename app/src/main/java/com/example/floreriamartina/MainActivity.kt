package com.example.floreriamartina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun abrirLogin(view: View){
        val intent = Intent(this, Display::class.java)
        startActivity(intent)
    }

}