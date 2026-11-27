package com.example.roomlyapp;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ListingDAO {
    @Insert
    void insertListing(Listing l);
    @Update
    void updateListing(Listing l);
    @Delete
    void deleteListing(Listing l);
    @Query("Select * from Listing where listingID = :id")
    Listing getListing(int id);
    @Query("Select * from Listing")
    List<Listing> getListings();
}
