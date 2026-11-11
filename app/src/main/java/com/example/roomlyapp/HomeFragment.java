package com.example.roomlyapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.navigation.NavigationView;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public class HomeFragment extends Fragment {

    public HomeFragment(){

    }

    @Override
    public @Nullable View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflatedView = inflater.inflate(R.layout.activity_main_roomly, container, false);

        NavigationView nav = inflatedView.findViewById(R.id.navigationView);
        MenuItem nightItem = nav.getMenu().findItem(R.id.night_mode_Switch);
        Switch nightToggle = nightItem.getActionView().findViewById(R.id.nightModeToggle);
        DrawerLayout drawer = inflatedView.findViewById(R.id.drawerLayout);

        //database user data
        String[] names = {
                "Test", "Test2", "Test3", "Test1BillionTrillion"
        };

        String[] locations = {
            "Orlando, FL", "Oviedo, FL", "Winter Park, FL", "Orlando,FL"
        };

        String[] tags1 = {
            "Clean", "Night Owl", "Quiet", "Pet friendly"
        };

        String[] tags2 = {
            "Student", "Non-smoker", "Clean", "Quiet"
        };

        String[] matches = {
            "92% Match", "44% Match", "68% Match", "70% Match"
        };

        RecyclerView rv = inflatedView.findViewById(R.id.rvProfiles);
        rv.setLayoutManager(new LinearLayoutManager(requireContext()));
        rv.setAdapter(new ProfileAdapter(names, locations, tags1, tags2, matches));

        //navigate to chat screen
        inflatedView.findViewById(R.id.chatButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) requireActivity()).navigateTo(ChatListFragment.class, true);
            }
        });

        //night mode
        nightToggle.setChecked(AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES);
        nightToggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(@androidx.annotation.NonNull CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                else
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            }
        });

        //menu buttons
        inflatedView.findViewById(R.id.menuButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer.openDrawer(GravityCompat.START);
            }
        });

        nav.getHeaderView(0).findViewById(R.id.closeMenuButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer.closeDrawer(GravityCompat.START);
            }
        });

        return inflatedView;
    }
}
