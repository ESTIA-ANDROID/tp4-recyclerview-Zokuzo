package com.openclassrooms.magicgithub.ui.user_list

import android.graphics.Color
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.openclassrooms.magicgithub.databinding.ItemListUserBinding
import com.openclassrooms.magicgithub.model.User


class ListUserViewHolder(private val binding: ItemListUserBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(user: User, callback: UserListAdapter.Listener) {
        Glide.with(itemView.context)
            .load(user.avatarUrl)
            .apply(RequestOptions.circleCropTransform())
            .into(binding.itemListUserAvatar)

        binding.itemListUserUsername.text = user.login

        if (user.isActive) {
            binding.root.setBackgroundColor(Color.WHITE) // Active state
        } else {
            binding.root.setBackgroundColor(Color.RED) // Inactive state
        }

        binding.itemListUserDeleteButton.setOnClickListener { callback.onClickDelete(user) }
    }
}
