package com.example.room_phone_number_list_app

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.room_phone_number_list_app.Contacts
import com.example.room_phone_number_list_app.ContactsDao

@Database(
    entities = [Contacts::class],
    version = 1
)
abstract class ContactsDatabase: RoomDatabase() {
    abstract val dao: ContactsDao
}