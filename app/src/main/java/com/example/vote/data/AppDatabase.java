package com.example.vote.data;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.vote.data.models.User;
import com.example.vote.data.models.UserDao;

@Database(entities = {User.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    private static AppDatabase instance;

    public abstract UserDao userDao();

    public static synchronized AppDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, "VoteDataBase")
                    .fallbackToDestructiveMigration() // Use this only during development, it recreates the database if the version number is incremented
                    .build();
        }
        return instance;
    }
}
