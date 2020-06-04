package com.codesample.bookwishlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.codesample.bookwishlist.databinding.ActivityMyWishlistBinding;

public class MyWishlist extends AppCompatActivity {
    private ActivityMyWishlistBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMyWishlistBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
