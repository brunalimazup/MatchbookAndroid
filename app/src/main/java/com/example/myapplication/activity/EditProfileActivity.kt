package com.example.myapplication.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.appcompat.widget.Toolbar
import com.example.myapplication.R

class EditProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)
        allComponents()
    }

    fun allComponents() {
        var saveEdition = findViewById<Button>(R.id.btnSave)

        saveEdition.setOnClickListener {
            val intent = Intent(this, FeedActivity::class.java)
            startActivity(intent)
        }

        var toolbarEdit = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbarEdit)
        toolbarEdit.setNavigationOnClickListener(View.OnClickListener { finish() })
        supportActionBar?.setTitle("Edit Profile ")

    }

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
//            R.id.favorites -> {
//                val intent = Intent(this, FavoritesActivity::class.java)
//                startActivity(intent)
//                true
//            }
            R.id.getout -> {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                true
            }

            else -> super.onOptionsItemSelected(item)
        }

    }
}
