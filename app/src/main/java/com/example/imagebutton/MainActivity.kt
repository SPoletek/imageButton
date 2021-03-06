package com.example.imagebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageButton = findViewById<ImageButton>(R.id.imageButton)
        imageButton?.setOnClickListener { Toast.makeText(this@MainActivity, R.string.image_button_clicked, Toast.LENGTH_SHORT).show()
    }
}

}
