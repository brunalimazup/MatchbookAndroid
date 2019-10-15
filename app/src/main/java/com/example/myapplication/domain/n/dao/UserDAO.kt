package com.example.myapplication.domain.n.dao

import com.example.myapplication.User

class UserDAO {


    companion object {
        private val users: MutableList<User> = mutableListOf()
    }

    fun all (): List<User> {
        return users
    }

    fun add(vararg user: User){
        users.addAll(user)
    }

}
