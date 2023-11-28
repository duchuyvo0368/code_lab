package com.example.recyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.ItemViewBinding
import com.example.recyclerview.model.User


class ListUserAdapter(private val listUserAdapter: List<User>): RecyclerView.Adapter<ListUserAdapter.ViewHolderUser>() {
    class ViewHolderUser(private val binding:ItemViewBinding):RecyclerView.ViewHolder(binding.root) {
        fun bind(user: User){
            binding.name.text=user.name
            binding.age.text=user.age.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderUser {
        val binding=ItemViewBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolderUser(binding)
    }

    override fun onBindViewHolder(holder: ViewHolderUser, position: Int) {
        holder.bind(listUserAdapter[position])
    }

    override fun getItemCount(): Int {
        return listUserAdapter.size
    }

}


