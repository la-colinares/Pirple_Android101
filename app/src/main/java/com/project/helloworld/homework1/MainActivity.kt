package com.project.helloworld.homework1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.project.helloworld.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvMessage = findViewById<TextView>(R.id.tv_message)
        val btnPressMe = findViewById<Button>(R.id.btn_press_me)

        btnPressMe.setOnClickListener {
            tvMessage.visibility = View.VISIBLE
        }
    }
}