package com.auxilitos.aplicacion_prueba

import android.content.Intent
import android.graphics.Typeface
import android.os.Build
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.TypefaceSpan
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.utils.widget.MotionTelltales
import androidx.core.content.res.ResourcesCompat
import androidx.core.content.res.ResourcesCompat.getFont
import com.auxilitos.aplicacion_prueba.databinding.ActivityLoginBinding
import com.auxilitos.aplicacion_prueba.databinding.ActivityMainBinding


class Login : AppCompatActivity() {

    private lateinit var btn_login1: ActivityLoginBinding


    @RequiresApi(Build.VERSION_CODES.P)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        btn_login1 = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(btn_login1.root)//R.layout.activity_login

        val btn_login = findViewById<Button>(R.id.btn_login);
        val btn = findViewById<TextView>(R.id.register);
        

        btn_login.setOnClickListener{

            /*MotionToast.createToast(this,
                "Hurray success 😍",
                "Upload Completed successfully!",
                MotionToastStyle.SUCCESS,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this,R.font.helvetica_regular))*/

            val i = Intent(this,MainActivity::class.java)
            startActivity(i)
        }

        btn.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "Holis", Toast.LENGTH_LONG).show()
            val i = Intent(this,register::class.java)
            startActivity(i)

        })

    }//Fin Activity

    /*fun persianToast(message: String): Toast {
        return Toast.makeText(this, message, Toast.LENGTH_SHORT).also {
            val view = it.view as LinearLayout
            val tv = view.getChildAt(0) as TextView
            val typeFace = Typeface.createFromAsset(this.assets, Font.getFont(Font.PUFF))
            tv.typeface = typeFace
        }
    }*/

}//Fin todo