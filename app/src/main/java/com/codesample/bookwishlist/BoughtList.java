package com.codesample.bookwishlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.codesample.bookwishlist.databinding.ActivityBoughtListBinding;

public class BoughtList extends AppCompatActivity {
    private ActivityBoughtListBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBoughtListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonMenu.setOnClickListener(v -> {
            startActivity(new Intent(this, MainActivity.class));
        });
    }
}
