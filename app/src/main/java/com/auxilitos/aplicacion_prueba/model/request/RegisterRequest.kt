package com.auxilitos.aplicacion_prueba.model.request

data class RegisterRequest (
    val username: String,
    val email: String,
    val password: String,
    val data_joined: String,

)