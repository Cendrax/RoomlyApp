package com.example.roomlyapp;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Listing {
    @PrimaryKey(autoGenerate = true)
    int listingID;
    int profileID;
    String location;
    String availability;
    int rentAmount;

    public Listing(int profileID, String location, String availability, int rentAmount) {
        this.profileID = profileID;
        this.location = location;
        this.availability = availability;
        this.rentAmount = rentAmount;
    }
}
