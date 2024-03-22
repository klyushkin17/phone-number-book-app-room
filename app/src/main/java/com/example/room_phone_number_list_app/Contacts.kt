package com.example.room_phone_number_list_app

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Contacts(
    val firstName: String,
    val lastName: String,
    val phoneNumber: String,
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
)
