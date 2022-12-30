package com.auxilitos.aplicacion_prueba

class Font {

    companion object {
        /*const val NORMAL_FONT = 0
        const val BOLD_FONT = 1
        const val MEDIUM_FONT = 2
        const val LIGHT_FONT = 3
        const val ULTRA_LIGHT_FONT = 4*/
        const val PUFF = 5

        @JvmStatic
        fun getFont(type: Int): String {
            return when (type) {
                /*LIGHT_FONT -> "font/fontLight.ttf"
                BOLD_FONT -> "font/fontBold.ttf"
                MEDIUM_FONT -> "font/fontMedium.ttf"
                ULTRA_LIGHT_FONT -> "font/fontUltraLight.ttf"*/
                PUFF -> "font/dynapuff.ttf"
//                else -> "font/fontNormal.ttf"
                else -> {"font/dynapuff.ttf"}
            }
        }
    }
}