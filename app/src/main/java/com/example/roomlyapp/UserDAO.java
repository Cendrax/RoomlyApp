package com.example.roomlyapp;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface UserDAO {
    @Insert
    void insertUser(User u);
    @Update
    void updateUser(User u);
    @Delete
    void deleteUser(User u);
    @Query("Select * from User where userID = :id")
    User getUser(int id);
    @Query("Select * from User")
    List<User> getUsers();

}
