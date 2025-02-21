package com.example.ex_1_323

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txtCounter = findViewById<TextView>(R.id.txtCounter)
    }
    fun changeFontSize(view: View) {
        val txtCounter = findViewById<TextView>(R.id.txtCounter)

        txtCounter.textSize = 50f
    }
    fun changeFontColor(view: View) {
        val txtCounter = findViewById<TextView>(R.id.txtCounter)
        txtCounter.setTextColor(Color.parseColor("#D32F2F")) // Dark red
    }

    fun changeBackgroundColor(view: View) {
        val linearLayout = findViewById<LinearLayout>(R.id.linearLayout)
        linearLayout.setBackgroundColor(Color.parseColor("#03A9F4")) // Bright Blue
    }
}
