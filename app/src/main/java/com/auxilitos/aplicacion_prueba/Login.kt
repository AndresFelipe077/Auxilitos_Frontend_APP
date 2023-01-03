package com.auxilitos.aplicacion_prueba

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import androidx.core.util.PatternsCompat
import com.auxilitos.aplicacion_prueba.Interface.ApiService
import com.auxilitos.aplicacion_prueba.Model.LoginApi
import com.auxilitos.aplicacion_prueba.databinding.ActivityLoginBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import www.sanju.motiontoast.MotionToast
import www.sanju.motiontoast.MotionToastStyle
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.regex.Pattern


@Suppress("CAST_NEVER_SUCCEEDS")
class Login : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    //private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var btn_login: Button
    private val servicio: ApiService =
        getRetrofit().create(ApiService::class.java)//Config.getRetrofit.create(ApiService::class.java)


    @RequiresApi(Build.VERSION_CODES.P)
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)//R.layout.activity_login

        btn_login = findViewById<Button>(R.id.btn_login);
        val btn = findViewById<TextView>(R.id.register);
        //email = findViewById(R.id.email)
        password = findViewById(R.id.password)

        binding.btnMotionToast.setOnClickListener {

            val i = Intent(this, MainActivity::class.java)
            startActivity(i)

            MotionToast.darkColorToast(
                this,
                "Upload Completed!",
                "a",
                MotionToastStyle.SUCCESS,
                MotionToast.GRAVITY_TOP,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this, R.font.dynapuff)

                /*MotionToast.darkToast(
                this,
                "Upload Completed!",
                "a",
                MotionToastStyle.SUCCESS,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this,R.font.dynapuff)*/


                /*MotionToast.createColorToast(
                this,
                "Exito!",
                "a",
                MotionToastStyle.SUCCESS,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this,R.font.dynapuff)*/


                /*MotionToast.createToast(
                this,
                null,
                "Se ha logueado exitosamente",
                MotionToastStyle.SUCCESS,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this,R.font.dynapuff)*/
            )

        }

        /*btn_login.setOnClickListener {


            if ((email.text.toString().isEmpty()) and (password.text.toString().isEmpty())) {

                MotionToast.darkColorToast(
                    this,
                    "Upload Completed!",
                    "Vacio",
                    MotionToastStyle.SUCCESS,
                    MotionToast.GRAVITY_TOP,
                    MotionToast.LONG_DURATION,
                    ResourcesCompat.getFont(this, R.font.dynapuff)
                )

            } else {
                MotionToast.darkColorToast(
                    this,
                    "Upload Completed!",
                    "lleno",
                    MotionToastStyle.SUCCESS,
                    MotionToast.GRAVITY_TOP,
                    MotionToast.LONG_DURATION,
                    ResourcesCompat.getFont(this, R.font.dynapuff)
                )
            }


        }

        btn.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "Vista de registro", Toast.LENGTH_LONG).show()
            val i = Intent(this, register::class.java)
            startActivity(i)

        })*/

        binding.btnLogin.setOnClickListener{ validate() }

    }//Fin Activity

    private fun validate(){
        val result = arrayOf(validateEmail(), validatePassword())
        if(false in result)
        {
            return
        }

        Toast.makeText(this, "Success", Toast.LENGTH_LONG).show()

    }

    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("http://192.168.1.106/Mis-Primeros-Auxilitos-Jet/public/api/login/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    //Fin getRetrofit

    private fun validateEmail():Boolean {
        val email = binding.email.text.toString()
        return if(email.isEmpty()){
            binding.email.error = "El campo del correo no puede estar vacio"
            false
        }else if(!PatternsCompat.EMAIL_ADDRESS.matcher(email).matches()) {
            binding.email.error = "Por favor ingresa un correo valido"
            false
        } else {
            binding.email.error = null
            true
        }
    }

    private fun validatePassword(): Boolean {
        val password = binding.password.text.toString()
        return if(password.isEmpty())
        {
            binding.password.error = "El campo contraseña no debe estar vacio"
            false
        } else {
            binding.password.error = null
            true
        }
    }


}//Fin todo