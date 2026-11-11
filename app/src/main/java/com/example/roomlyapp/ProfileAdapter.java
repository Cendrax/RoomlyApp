package com.example.roomlyapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProfileAdapter extends RecyclerView.Adapter<ProfileViewHolder> {
    private final String[] names;
    private final String[] locations;
    private final String[] tags1;
    private final String[] tags2;
    private final String[] matches;

    public ProfileAdapter(String[] names, String[] locations, String[] tags1, String[] tags2, String[] matches){
        this.names = names;
        this.locations = locations;
        this.tags1 = tags1;
        this.tags2 = tags2;
        this.matches = matches;
    }

    @NonNull
    @Override
    public ProfileViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_profile, parent, false);
        return new ProfileViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ProfileViewHolder holder, int position){
        holder.name.setText(names[position]);
        holder.location.setText(locations[position]);
        holder.tag1.setText(tags1[position]);
        holder.tag2.setText(tags2[position]);
        holder.match.setText(matches[position]);
    }

    @Override
    public int getItemCount(){
        return names.length;
    }
}
