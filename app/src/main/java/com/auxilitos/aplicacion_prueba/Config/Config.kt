package com.auxilitos.aplicacion_prueba.Config

import android.content.Context
import android.widget.Toast
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import androidx.core.content.res.ResourcesCompat

public class Config {

    private val BASEURLLOGIN = "http://192.168.1.106/Mis-Primeros-Auxilitos-Jet/public/api/login/"
    private val BASEURLREGISTRO = "http://192.168.1.106/Mis-Primeros-Auxilitos-Jet/public/api/registro/"

    private var retrofit: Retrofit? = null

    public fun getRetrofit(): Retrofit? {
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .baseUrl(BASEURLLOGIN)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit
    }

    @Suppress("unused")
    public fun Mensaje(context: Context?, mensaje: String?) {
        Toast.makeText(context, mensaje, Toast.LENGTH_LONG).show()
    }

}