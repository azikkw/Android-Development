package com.example.assignment1.viewmodel

import androidx.lifecycle.ViewModel
import com.example.assignment1.data.repository.UserRepository
import com.example.assignment1.model.UserEntity
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import javax.inject.Inject

interface UserViewModelAbstract {
    val userListFlow: Flow<List<UserEntity>>
    fun addUser(user: UserEntity)
    fun updateUser(user: UserEntity)
    fun deleteUser(user: UserEntity)
}

@HiltViewModel
class UserViewModel
@Inject constructor(private val userRepository: UserRepository,) : ViewModel(), UserViewModelAbstract {
    private val ioScope = CoroutineScope(Dispatchers.IO)
    override val userListFlow: Flow<List<UserEntity>> = userRepository.getAllFlow()

    override fun addUser(user: UserEntity) {
        ioScope.launch {
            userRepository.insert(user = user)
        }
    }
    override fun updateUser(user: UserEntity) {
        ioScope.launch {
            userRepository.update(user = user)
        }
    }
    override fun deleteUser(user: UserEntity) {
        ioScope.launch {
            userRepository.delete(user = user)
        }
    }
}