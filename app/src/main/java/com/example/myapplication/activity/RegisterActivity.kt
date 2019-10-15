package com.example.myapplication.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.myapplication.Models.ModelGenres
import com.example.myapplication.R
import com.example.myapplication.User
import com.example.myapplication.domain.n.dao.UserDAO
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_register.*
import kotlinx.android.synthetic.main.item_feed.*


class RegisterActivity : AppCompatActivity() {

    private val userDao = UserDAO()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        allComponents()

        var toolbarRegister = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbarRegister)
        supportActionBar?.setTitle("Register")
        toolbarRegister.setNavigationOnClickListener(View.OnClickListener { finish() })

    }

    fun allComponents() {

        var btnRegister = findViewById<Button>(R.id.btnRegister)
        btnRegister.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
//            saveUser()
            finish()
        }
    }

//    private fun saveUser() {
//        val createdUser = create()
//        userDao.add(createdUser)
//    }

    fun onCheckboxClicked(view: View) {
        var checked = view as List<ModelGenres>
        if (romance == checked) {
            if (romance.isChecked) {
            }
        }

        if (horror == checked) {
            if (horror.isChecked) {
            }
        }
        if (comedy == checked) {
            if (comedy.isChecked) {
            }
        }

        if (sciences == checked) {
            if (sciences.isChecked) {
            }
        }
        if (philosophy == checked) {
            if (philosophy.isChecked) {
            }
        }

        if (fiction == checked) {
            if (fiction.isChecked) {
            }
        }
        if (poetry == checked) {
            if (poetry.isChecked) {
            }
        }

        if (chronicles == checked) {
            if (chronicles.isChecked) {
            }
        }
        if (fantasy == checked) {
            if (fantasy.isChecked) {
            }
        }
        if (childish == checked) {
            if (childish.isChecked) {
            }
        }

        if (politics == checked) {
            if (politics.isChecked) {
            }

            fun message(str: String) {
                Toast.makeText(this, str, Toast.LENGTH_LONG).show()
            }
        }
    }

//    private fun create(): User {
//        val name = name.editText6?.text.toString()
//        val genres = listOf(genres)
//        val biography = biographyR.editText6?.text.toString()
//        return User(name = name, genres = listGenres ,  biography = biography)
    }
//}



