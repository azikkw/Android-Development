package com.example.assignment2.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
class UserEntity (
    val name: String,
    val surname: String,
    val email: String,
    val password: String,
    @PrimaryKey(autoGenerate = false) val id: Int? = null
)