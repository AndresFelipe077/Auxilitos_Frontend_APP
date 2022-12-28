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
        /*var btn = findViewById<Button>(R.id.register);
        var a = 1;
        btn.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "Holis", Toast.LENGTH_LONG).show()
            if(a == 1)
            {
                Toast.makeText(this, "Logueado mi amor", Toast.LENGTH_LONG).show()
            }
            val i = Intent(this,register::class.java)
            startActivity(i)

        })*/


        var btn = findViewById<TextView>(R.id.register);

        btn.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "Holis", Toast.LENGTH_LONG).show()
            val i = Intent(this,register::class.java)
            startActivity(i)

        })

    }//Fin Activity

}//Fin todo