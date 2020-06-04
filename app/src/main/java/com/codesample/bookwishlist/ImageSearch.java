package com.codesample.bookwishlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.codesample.bookwishlist.databinding.ActivityImageSearchBinding;

public class ImageSearch extends AppCompatActivity {
    private ActivityImageSearchBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityImageSearchBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
