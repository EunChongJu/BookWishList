package com.codesample.bookwishlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.codesample.bookwishlist.databinding.ActivityInfoBookBinding;

public class InfoBook extends AppCompatActivity {
    private ActivityInfoBookBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityInfoBookBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonUpdate.setOnClickListener(v -> {
            startActivity(new Intent(this, UpdateBook.class));
        });

        binding.buttonPurchase.setOnClickListener(v -> {
//            startActivity(new Intent(this, AddBook.class));
        });
    }
}
