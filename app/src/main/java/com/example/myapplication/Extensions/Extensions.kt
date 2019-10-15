package com.example.myapplication.Extensions
import android.app.Activity
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.IdRes
import androidx.annotation.StringRes


//Mostra um toast

fun Activity.toast(message: CharSequence, length:Int = Toast.LENGTH_SHORT)=
    Toast.makeText(this, message, length).show()

//Evento de click

fun Activity.onClick(@IdRes viewId: Int, onClick: (v: android.view.View?) -> Unit){
    val view = findViewById<View>(viewId)
    view.setOnClickListener{ onClick(it) }
}

fun Activity.getTextString(@IdRes id: Int): String {
    val textView = findViewById<TextView>(id)
    val s = textView.text.toString()
    return s
}

