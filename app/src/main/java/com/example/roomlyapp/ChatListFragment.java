package com.example.roomlyapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public class ChatListFragment extends Fragment {
    public ChatListFragment(){

    }

    @Override
    public @Nullable View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflatedView = inflater.inflate(R.layout.chatslitsactivity_main, container, false);
        inflatedView.findViewById(R.id.btnBack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requireActivity().getOnBackPressedDispatcher().onBackPressed();
            }
        });
        return inflatedView;
    }
}
