package com.example.roomlyapp;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ChatDAO {
    @Insert
    void insertChat(Chat c);
    @Update
    void updateChat(Chat c);
    @Delete
    void deleteChat(Chat c);
    @Query("Select * from Chat where chatID = :id")
    Chat getChat(int id);

    @Query("Select * from Chat")
    List<Chat> getChats();
}
