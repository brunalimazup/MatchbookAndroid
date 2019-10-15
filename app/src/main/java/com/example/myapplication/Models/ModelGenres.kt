package com.example.myapplication.Models

import java.io.Serializable


data class ModelGenres (
    val romance: Boolean,
    val horror: Boolean,
    val comedy: Boolean,
    val sciences: Boolean,
    val philosophy: Boolean,
    val fiction: Boolean,
    val poetry: Boolean,
    val chronicles: Boolean,
    val fantasy: Boolean,
    val childish: Boolean,
    val politics: Boolean
):Serializable{}