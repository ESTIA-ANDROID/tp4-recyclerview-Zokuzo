package com.openclassrooms.magicgithub.repository

import com.openclassrooms.magicgithub.api.ApiService
import com.openclassrooms.magicgithub.model.User
import java.util.Collections

class UserRepository(
    private val apiService: ApiService

) {
    fun getUsers(): List<User> {
        return apiService.getUsers()
    }

    fun addRandomUser() {
        apiService.addRandomUser()
    }

    fun deleteUser(user: User) {
        apiService.deleteUser(user)
    }


    fun toggleUserActiveState(user: User) {
        user.isActive = !user.isActive
    }

    fun moveUser(fromIndex: Int, toIndex: Int) {
        val usersList = apiService.getUsers().toMutableList()

        if (fromIndex in usersList.indices && toIndex in usersList.indices) {
            Collections.swap(usersList, fromIndex, toIndex)
        }
    }


}