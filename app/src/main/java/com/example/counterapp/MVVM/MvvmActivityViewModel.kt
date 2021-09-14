package com.example.counterapp.MVVM

import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.coroutines.coroutineContext

class MvvmActivityViewModel:ViewModel() {

    var number = 0

    val addNumber: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }
}