package com.auxilitos.aplicacion_prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Login : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btn_login = findViewById<Button>(R.id.btn_login);
        val btn = findViewById<TextView>(R.id.register);

        btn_login.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "Logueado", Toast.LENGTH_LONG).show()
            val i = Intent(this,MainActivity::class.java)
            startActivity(i)
        })

        btn.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "Holis", Toast.LENGTH_LONG).show()
            val i = Intent(this,register::class.java)
            startActivity(i)

        })

    }//Fin Activity

}//Fin todo