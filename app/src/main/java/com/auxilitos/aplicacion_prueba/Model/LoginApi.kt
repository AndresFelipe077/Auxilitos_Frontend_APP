package com.auxilitos.aplicacion_prueba.Model

class LoginApi {

    private var id = 0
    private var email: String? = null
    private var password: String? = null

    fun getId(): Int {
        return id
    }

    fun setId(Id: Int) {
        this.id = Id
    }

    fun getEmail(): String? {
        return email
    }

    fun setEmail(Email: String) {
        this.email = Email
    }

    fun getPassword(): String? {
        return password
    }

    fun setPassword(password: String) {
        this.password = password
    }


}