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
import www.sanju.motiontoast.MotionToast
import www.sanju.motiontoast.MotionToastStyle


class Login : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding


    @RequiresApi(Build.VERSION_CODES.P)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)//R.layout.activity_login

        val btn_login = findViewById<Button>(R.id.btn_login);
        val btn = findViewById<TextView>(R.id.register);

        binding.btnMotionToast.setOnClickListener{

            MotionToast.darkColorToast(
                this,
                "Upload Completed!",
                "a",
                MotionToastStyle.SUCCESS,
                MotionToast.GRAVITY_TOP,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this,R.font.dynapuff)




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

        btn_login.setOnClickListener{

            val i = Intent(this,MainActivity::class.java)
            startActivity(i)

            MotionToast.darkColorToast(
                this,
                "Upload Completed!",
                "a",
                MotionToastStyle.SUCCESS,
                MotionToast.GRAVITY_TOP,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this,R.font.dynapuff))


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