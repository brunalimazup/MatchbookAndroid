package com.example.myapplication.adapter

import android.content.Context
import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Models.ModelGenres
import com.example.myapplication.Models.ModelRegister
import com.example.myapplication.R
import com.example.myapplication.User
import kotlinx.android.synthetic.main.activity_register.view.*
import kotlinx.android.synthetic.main.item_feed.view.*
import androidx.recyclerview.widget.RecyclerView.ViewHolder as ViewHolder1


class UserListAdapter(private val user: List<User>)
private val context: Context): Adapter <UserListAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder1?, position: Int) {
        val users = user[position]
        holder?.let {
            it.fullName.text = users.fullName
            it.genres.text = users.genres
            it.biography.text = users.biography
        }

        override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder1 {
            val view = LayoutInflater.from(context).inflate(R.layout.item_feed, parent, false)
            return ViewHolder1(view)
        }


        override fun getItemCount(): Int {
            return users.size
        }


        class ViewHolder(itemView: View) : ViewHolder1(itemView) {

            fun bindView(user: User) {
                val name = itemView.fullName
                val genres = itemView.genres
                val biography = itemView.biography

                name.text = user.name
                genres.hasSelection()
                biography.text = user.biography
            }
        }
    }



