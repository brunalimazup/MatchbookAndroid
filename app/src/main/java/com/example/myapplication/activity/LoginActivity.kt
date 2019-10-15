package com.example.myapplication.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.myapplication.Extensions.getTextString
import com.example.myapplication.Extensions.toast
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_toolbar.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        setSupportActionBar(toolbar)
        allComponents()
    }

    fun allComponents() {
        var btnLogin = findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener {
            val cNickname = getTextString(R.id.tLogin)
            val cPassword = getTextString(R.id.tPassword)
            val intent = Intent(this, FeedActivity::class.java)
            startActivity(intent)

            if ("$tLogin" == cNickname && "$tPassword" == cPassword) {
                toast("Bem- vindo, Login realizado com sucesso")
            } else {
                toast("Login ou senha incorreto")
            }

        }

        var toolbarLogin = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbarLogin)
        supportActionBar?.setTitle("Login")
        toolbarLogin.setNavigationOnClickListener(View.OnClickListener { finish() })
    }


}


