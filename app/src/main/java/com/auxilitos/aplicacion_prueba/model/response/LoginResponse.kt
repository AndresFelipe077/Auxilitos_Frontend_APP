package com.auxilitos.aplicacion_prueba.model.response

data class LoginResponse (
        val user_id: Int,
        val email: String,
        val password: String
    )