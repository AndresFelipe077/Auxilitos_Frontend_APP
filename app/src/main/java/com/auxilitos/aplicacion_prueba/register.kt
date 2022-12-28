package com.auxilitos.aplicacion_prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        var btn_register = findViewById<Button>(R.id.btn_register);
        var btn_regresar = findViewById<Button>(R.id.btn_regresar);

        btn_register.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "Registrado", Toast.LENGTH_LONG).show()
        })

        btn_regresar.setOnClickListener(View.OnClickListener {
            val i = Intent(this, Login::class.java)
            startActivity(i)
        })



    }
}