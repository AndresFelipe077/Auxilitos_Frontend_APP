package com.auxilitos.aplicacion_prueba.model.response

data class RegisterResponse (
    val id: Int,
    val name: String,
    val email: String,
    val genero: String,
    val fechaNacimiento: String,
    val password: String,
)