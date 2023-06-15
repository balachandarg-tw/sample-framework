package com.balagtw.samplelibrary

import android.content.Context
import android.widget.Toast

class ToasterMessage {

    fun showToast(context: Context, message: String){
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }
}