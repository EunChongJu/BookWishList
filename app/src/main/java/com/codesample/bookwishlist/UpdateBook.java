package com.codesample.bookwishlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.codesample.bookwishlist.databinding.ActivityUpdateBookBinding;

public class UpdateBook extends AppCompatActivity {
    private ActivityUpdateBookBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityUpdateBookBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonUpdating.setOnClickListener(v -> {
            startActivity(new Intent(this, MainActivity.class));
        });

        binding.buttonDelete.setOnClickListener(v -> {
            startActivity(new Intent(this, AddBook.class));
        });
    }
}
