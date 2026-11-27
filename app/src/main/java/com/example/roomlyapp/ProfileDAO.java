package com.example.roomlyapp;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ProfileDAO {
    @Insert
    void insertProfile(Profile p);
    @Update
    void updateProfile(Profile p);
    @Delete
    void deleteProfile(Profile p);
    @Query("Select * from Profile where profileID = :id")
    Profile getProfile(int id);
    @Query("Select * from Profile")
    List<Profile> getProfiles();
}
