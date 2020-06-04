package com.codesample.bookwishlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.codesample.bookwishlist.databinding.ActivityMainBinding;
import com.codesample.bookwishlist.databinding.ActivitySearchBinding;

public class SearchActivity extends AppCompatActivity {
    private ActivitySearchBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySearchBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

}
