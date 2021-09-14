package com.example.counterapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.counterapp.MVC.MvcActivity
import com.example.counterapp.MVVM.MvvmActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mvcButton.setOnClickListener {
            startActivity(Intent(this, MvcActivity::class.java))
        }
        mvvmButton.setOnClickListener {
            startActivity(Intent(this, MvvmActivity::class.java))
        }
    }
}