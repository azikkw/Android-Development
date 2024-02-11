package com.example.assignment1.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity (
    tableName = "users",
    indices = [
        Index("email", unique = true)
    ]
)
class UserEntity (
    val name: String,
    val surname: String,
    @ColumnInfo(collate = ColumnInfo.NOCASE) val email: String,
    val password: String,
    @PrimaryKey(autoGenerate = false) val id: Int? = null
)