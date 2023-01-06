package com.auxilitos.aplicacion_prueba

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.*
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.util.PatternsCompat
import com.auxilitos.aplicacion_prueba.client.ApiClient
import com.auxilitos.aplicacion_prueba.databinding.ActivityLoginBinding
import com.auxilitos.aplicacion_prueba.model.request.LoginRequest
import com.auxilitos.aplicacion_prueba.model.response.LoginResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


@Suppress("CAST_NEVER_SUCCEEDS", "UNCHECKED_CAST", "DEPRECATION")
class Login : AppCompatActivity() {
    //http://192.168.1.106:8000/api/login/
    private lateinit var binding: ActivityLoginBinding

    private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var btn_login: Button
    var toast = ToastCustom()

    @RequiresApi(Build.VERSION_CODES.P)
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)//R.layout.activity_login

        hideKeyBoard()


       /* btn_login = findViewById(R.id.btn_login)
        val btn = findViewById<TextView>(R.id.register)
        email = findViewById(R.id.email)
        password = findViewById(R.id.password)*/

        /*btn.setOnClickListener {
            toast.toastSuccess(this,"Registro", "Vista de registro")
            val i = Intent(this, register::class.java)
            startActivity(i)
        }*/

        binding.btnlogin.setOnClickListener{
            //validate()
            initData()
        }




    }//Fin Activity




    private fun initData()
    {
        clickListener()
    }

    private fun clickListener()
    {
        binding.btnlogin.setOnClickListener{
            getInputs()
        }
    }

    private fun getInputs()
    {
        val email = binding.etUsername.text.toString()
        val password = binding.edPassword.text.toString()

        if(email.isNotEmpty() && password.isNotEmpty())
        {
            loginUser(email, password)
        }
        else
        {
            toast.toastSuccess(this, "requiere", "All inputs required ...")
        }




    }

    private fun loginUser(email: String, password: String)
    {
        val loginRequest = LoginRequest(email,password)
        val apiCall = ApiClient.getApiService().loginUser(loginRequest)
        apiCall.enqueue(object : Callback<LoginResponse>{
            override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {
                if(response.isSuccessful)
                {
                    startActivity(Intent(this@Login, MainActivity::class.java))
                }
                else
                {
                    toast.toastError(this@Login, "Error", "Corrige tus credenciales")
                }
            }

            override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
                toast.toastError(this@Login, "Error", "Ha ocurrido un error inesperado" + t.localizedMessage)
            }

        })


    }




    private fun validate(){
        val result = arrayOf(validateEmail(), validatePassword())
        if(false in result)
        {
            return
        }


    }

    private fun validateEmail():Boolean {
    val email = binding.etUsername.text.toString()
    return if(email.isEmpty()){
        binding.etUsername.error = "El campo del correo no puede estar vacio"
        false
    }else if(!PatternsCompat.EMAIL_ADDRESS.matcher(email).matches()) {
        binding.etUsername.error = "Por favor ingresa un correo valido"
        false
    } else {
        binding.etUsername.error = null
        true
    }
}

    private fun validatePassword(): Boolean {
    val password = binding.edPassword.text.toString()
    return if(password.isEmpty())
    {
        binding.edPassword.error = "El campo contraseña no debe estar vacio"
        false
    } else {
        binding.edPassword.error = null
        true
    }
}

    private fun hideKeyBoard()
    {
        val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(binding.viewRoot.windowToken, 0)
    }


    private fun getRetrofit(): Retrofit
    {
        return Retrofit.Builder()
            .baseUrl("http://192.168.1.106:8000/api/login/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }



}//Fin

