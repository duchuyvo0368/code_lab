package com.example.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.adapter.ListUserAdapter
import com.example.recyclerview.databinding.ActivityMainBinding
import com.example.recyclerview.model.User


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var listUserAdapter:ListUserAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setListAdapter()
    }

    private fun setListAdapter() {
        val  listUser= listOf<User>(User("Le Van Hoang",12),User("Duc Huy",17),User("Hoan",16),User("Nam",15))
        listUserAdapter= ListUserAdapter(listUser)
        val linearLayoutManager = LinearLayoutManager(this)
        binding.listUser.adapter=listUserAdapter
        binding.listUser.layoutManager=linearLayoutManager

    }
}