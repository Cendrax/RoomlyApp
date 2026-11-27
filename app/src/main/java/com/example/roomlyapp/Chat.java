package com.example.roomlyapp;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Entity
public class Chat {
    @PrimaryKey(autoGenerate = true)
    int chatID;
    int senderID;
    int receiverID;
    String message;
    String sentTime;

    public Chat(int senderID, int receiverID, String message, String sentTime) {
        this.senderID = senderID;
        this.receiverID = receiverID;
        this.message = message;
        this.sentTime = sentTime;
    }
}
