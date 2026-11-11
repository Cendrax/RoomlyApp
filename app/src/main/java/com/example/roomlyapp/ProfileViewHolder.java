package com.example.roomlyapp;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ProfileViewHolder extends RecyclerView.ViewHolder {
    TextView name, location, tag1, tag2, match;

    public ProfileViewHolder(View itemView){
        super(itemView);
        name = itemView.findViewById(R.id.nameLabel);
        location = itemView.findViewById(R.id.locationLabel);
        tag1 = itemView.findViewById(R.id.tagLabel);
        tag2 = itemView.findViewById(R.id.tagLabelAgain);
        match = itemView.findViewById(R.id.matchLabel);
    }
}
