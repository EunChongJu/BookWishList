package com.codesample.bookwishlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.codesample.bookwishlist.databinding.ActivityBookInfoBinding;

public class BookInfo extends AppCompatActivity {
    private ActivityBookInfoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBookInfoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
