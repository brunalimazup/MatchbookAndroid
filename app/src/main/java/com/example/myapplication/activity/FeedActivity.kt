package com.example.myapplication.activity

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.myapplication.Models.ModelGenres
import com.example.myapplication.Models.ModelRegister

import com.example.myapplication.R
import com.example.myapplication.User
import com.example.myapplication.adapter.UserListAdapter
import com.example.myapplication.domain.n.dao.UserDAO
import kotlinx.android.synthetic.main.activity_feed.*
import kotlinx.android.synthetic.main.activity_register.*


class FeedActivity : AppCompatActivity() {

//    private val listGenre: MutableList<ModelGenres> = ArrayList<ModelGenres>()
    //    private val user: MutableList<User> = ArrayList<User>()
//    private val userDao = UserDAO()
//    private lateinit var adapter: UserListAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feed)
        allComponents()
//        configureAddUser()
//        configureRecyclerView()

    }

    //Componentes
    fun allComponents() {
        var toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "Feed Matchbook"
        toolbar.setNavigationIcon(R.drawable.ic_action_menu);
    }

    //Menu
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.edit -> {
                val intent = Intent(this, EditProfileActivity::class.java)
                startActivity(intent)
                true
            }
            R.id.getout -> {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                true
            }

            else -> super.onOptionsItemSelected(item)
        }

    }


//    //Usuários
//    private fun configureAddUser() {
//        btnRegister.setOnClickListener {
//            val openUserForm = Intent(this, RegisterActivity::class.java)
//            startActivity(openUserForm)
//        }
//    }

//    override fun onResume() {
//        super.onResume()
//        adapter.replaceAllUsers(userDao.all() as MutableList<User>)
//
//    }
//
//    private fun configureRecyclerView() {
//        this.adapter = UserListAdapter(context = this)
//        recyclerView.adapter = adapter
//    }


//    fun add() {
//
//        listGenre.add(
//            ModelGenres(
//                true, false, false, false,
//                true, false, true, false,
//                false, false, false
//            )
//        )
//
//        user.add(
//            ModelRegister(
//                "bruna.lima@hotmail.com", "Bruna Marçal",
//                "Bru", "123", "Eu sou...", register
//            )
//        )
//
//    }

}


