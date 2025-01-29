package com.openclassrooms.magicgithub.model

data class User(
    val id: Int,
    val login: String,
    val avatarUrl: String,
    var isActive: Boolean // Added active/inactive state
)

