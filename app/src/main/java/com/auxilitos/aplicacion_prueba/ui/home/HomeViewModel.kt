package com.auxilitos.aplicacion_prueba.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "hogar"
    }
    val text: LiveData<String> = _text
}