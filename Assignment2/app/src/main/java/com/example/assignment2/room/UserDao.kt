package com.example.assignment2.room

import androidx.room.*
import com.example.assignment2.entities.UserEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {

    @Query("select * from user")
    fun getAllFlow(): Flow<List<UserEntity>>

    @Insert
    suspend fun insert(user: UserEntity)

    @Update
    suspend fun update(user: UserEntity)

    @Delete
    suspend fun delete(user: UserEntity)

}