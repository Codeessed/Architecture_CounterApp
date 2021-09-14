package com.example.counterapp.MVVM

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.counterapp.R
import kotlinx.android.synthetic.main.activity_mvvm.*

class MvvmActivity : AppCompatActivity() {
    lateinit var viewModel:MvvmActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvvm)

        //to call the viewModel from the viewModel class
        viewModel = ViewModelProvider(this).get(MvvmActivityViewModel::class.java)
        //to observe the change in value
        viewModel.addNumber.observe(this, Observer {
            mvvmTextView.text = it.toString()
        })
        increaseCount()
    }
    fun increaseCount(){
        mvvmCountButton.setOnClickListener {
            viewModel.addNumber.value = ++viewModel.number
        }
    }
}