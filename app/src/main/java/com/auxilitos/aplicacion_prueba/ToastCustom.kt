package com.auxilitos.aplicacion_prueba

import android.app.Activity
import android.content.Context
import androidx.compose.ui.semantics.SemanticsProperties.Error
import androidx.core.content.res.ResourcesCompat
import www.sanju.motiontoast.MotionToast
import www.sanju.motiontoast.MotionToastStyle

class ToastCustom {

    fun toastSuccess(context: Context, title: String, message: String)
    {

        MotionToast.createColorToast(
            context as Activity,
            title,
            message,
            MotionToastStyle.SUCCESS,
            MotionToast.GRAVITY_BOTTOM,
            MotionToast.LONG_DURATION,
            ResourcesCompat.getFont(context, R.font.dynapuff)
        )

    }

    fun toastError(context: Context, title: String, message: String)
    {

        MotionToast.createColorToast(
            context as Activity,
            title,
            message,
            MotionToastStyle.ERROR,
            MotionToast.GRAVITY_BOTTOM,
            MotionToast.LONG_DURATION,
            ResourcesCompat.getFont(context, R.font.dynapuff)
        )

    }

}