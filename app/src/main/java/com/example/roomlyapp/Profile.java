package com.example.roomlyapp;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.ArrayList;

@Entity
public class Profile {
    @PrimaryKey(autoGenerate = true)
    int profileID;
    int userID;
    String bio;
    String location;
    String tag1;
    String tag2;
    String tag3;
    int grad;

    public Profile (int userID, String bio, String location, String[] tags, int grad) {
        this.userID = userID;
        this.bio = bio;
        this.location = location;
        this.tag1 = tags[0];
        this.tag2 = tags[1];
        this.tag3 = tags[2];
        this.grad = grad;
    }

    // prefer having 3 tags, maybe enforce 3 tags
    public Profile (int userID, String bio, String location, String tag, int grad) {
        this.userID = userID;
        this.bio = bio;
        this.location = location;
        this.tag1 = tag;
        this.tag2 = "no tag2!";
        this.tag3 = "no tag3!";
        this.grad = grad;
    }

}
