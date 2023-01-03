package com.auxilitos.aplicacion_prueba.Interface

import android.widget.EditText
import com.auxilitos.aplicacion_prueba.Model.LoginApi
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {

    @GET("Login")
    fun getPublicaciones(): Call<List<LoginApi?>?>?

    @POST("Login")
    @FormUrlEncoded
    fun savePublicacion(
        @Field("nombre") nombre: EditText,
        @Field("descripcion") descripcion: EditText
    ): Call<LoginApi?>?

}