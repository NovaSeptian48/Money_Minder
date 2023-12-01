package com.nova.moneyminder.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.nova.moneyminder.database.dao.DatabaseDao;
import com.nova.moneyminder.model.ModelDatabase;

@Database(entities = {ModelDatabase.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract DatabaseDao databaseDao();
}
