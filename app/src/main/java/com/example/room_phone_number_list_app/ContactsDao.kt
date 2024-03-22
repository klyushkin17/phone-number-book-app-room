package com.example.room_phone_number_list_app

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface ContactsDao {

    @Upsert
    suspend fun upsertContact(contacts: Contacts)

    @Delete
    suspend fun deleteContact(contacts: Contacts)

    @Query("SELECT * FROM contacts ORDER BY firstName ASC")
    fun getContactsOrderedByFirstName(): Flow<List<Contacts>>

    @Query("SELECT * FROM contacts ORDER BY lastName ASC")
    fun getContactsOrderedByLastName(): Flow<List<Contacts>>

    @Query("SELECT * FROM contacts ORDER BY phoneNumber ASC")
    fun getContactsOrderedByPhoneNumber(): Flow<List<Contacts>>
}