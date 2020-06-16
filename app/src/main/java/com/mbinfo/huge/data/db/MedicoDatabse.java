package com.mbinfo.huge.data.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Register.class}, version = 1)
public abstract class MedicoDatabse extends RoomDatabase {
    public abstract RegisterDao getRegisterDao();
}
