package com.example.roomlyapp;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {
    @PrimaryKey(autoGenerate = true)
    int userID;
    String username;
    String fName;
    String lName;
    int age;
    String email;
    String password;

    // favorites is a single string containing listingIDs delimited by a comma
    String favorites;

    public User(String username, String fName, String lName, int age, String email, String password, String favorites) {
        this.username = username;
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.email = email;
        this.password = password;
        this.favorites = favorites;
    }

}
