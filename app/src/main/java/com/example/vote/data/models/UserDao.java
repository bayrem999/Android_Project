package com.example.vote.data.models;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface UserDao {
    @Query("SELECT * FROM user WHERE cin = :cin AND phone_number = :phoneNumber")
    User getUserByCredentials(String cin, String phoneNumber);

    @Insert
    void insertUser(User user);

    // Other CRUD operations...
}
