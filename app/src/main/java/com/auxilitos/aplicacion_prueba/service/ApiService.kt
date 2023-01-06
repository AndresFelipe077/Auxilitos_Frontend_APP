package com.auxilitos.aplicacion_prueba.service


import com.auxilitos.aplicacion_prueba.model.request.LoginRequest
import com.auxilitos.aplicacion_prueba.model.request.RegisterRequest
import com.auxilitos.aplicacion_prueba.model.response.LoginResponse
import com.auxilitos.aplicacion_prueba.model.response.RegisterResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {

    @POST("/api/login/")
    fun loginUser(@Body loginRequest: LoginRequest): Call<LoginResponse>

    @POST("/users/")
    fun registerUser(@Body registerRequest: RegisterRequest): Call<RegisterResponse>

}