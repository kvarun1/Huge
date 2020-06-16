package com.mbinfo.huge.data.db;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface RegisterDao {
    @Insert
    public void insert(Register... registers);

    @Update
    public void update(Register... registers);

    @Delete
    public void delete(Register registers);
    @Query("SELECT * FROM register")
    public List<Register> getRegister();
}
