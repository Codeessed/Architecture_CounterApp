package com.example.counterapp.MVC

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.counterapp.R
import kotlinx.android.synthetic.main.activity_mvc.*
import kotlin.properties.Delegates

class MvcActivity : AppCompatActivity() {
    var number by Delegates.notNull<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvc)
        number = 0

        increaseCount()
    }
    fun increaseCount(){
        mvcAddButton.setOnClickListener {
            mvcTextView.text = (++number).toString()
        }
    }
}