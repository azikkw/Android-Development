package com.example.assignment1.data

import androidx.room.*
import com.example.assignment1.model.UserEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {

    @Query("select * from users")
    fun getAllFlow(): Flow<List<UserEntity>>

    @Insert
    suspend fun insert(user: UserEntity)

    @Update
    suspend fun update(user: UserEntity)

    @Delete
    suspend fun delete(user: UserEntity)
}