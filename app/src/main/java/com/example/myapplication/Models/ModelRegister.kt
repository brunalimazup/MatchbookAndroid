package com.example.myapplication.Models

import android.widget.CheckBox


data class ModelRegister(
    val email: String,
    val name: String,
    val nickName: String,
    val password: String,
    val biography: String,
    val genres: List<ModelGenres>


)
