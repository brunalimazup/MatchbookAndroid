//package com.example.myapplication.activity
//
//import android.content.Intent
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.view.View
//import android.widget.ImageButton
//import androidx.appcompat.widget.Toolbar
//import com.example.myapplication.R
//
//class FavoritesActivity : AppCompatActivity() {
//
//    val list = listOf<Boolean>()
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_favorites)
//        allComponents()
//    }
//
//    fun allComponents() {
//        var toolbarFavorites = findViewById<Toolbar>(R.id.toolbar)
//        setSupportActionBar(toolbarFavorites)
//        toolbarFavorites.setNavigationOnClickListener(View.OnClickListener { finish() })
//        supportActionBar?.title = "Favorites "
//
//        var btnLike = findViewById<ImageButton>(R.id.btnLike)
//        btnLike.setOnClickListener {  (true) }
//            btnSeeMyInvestments.setOnClickListener { gotoHome() }
//
//        }
//    }
//}