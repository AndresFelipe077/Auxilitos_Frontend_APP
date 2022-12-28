package com.auxilitos.aplicacion_prueba.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Nico y Smith me la chupan entera!!!"
    }
    val text: LiveData<String> = _text
}