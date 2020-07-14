package com.codesample.bookwishlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;

import com.codesample.bookwishlist.databinding.ActivityAddBookBinding;

public class AddBook extends AppCompatActivity {
    static final int REQUEST_IMAGE_SET = 1;
    private ActivityAddBookBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAddBookBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.addBookBtn.setOnClickListener(v -> {
            startActivity(new Intent(this, MainActivity.class));
        });

        binding.buttonMenu.setOnClickListener(v -> {
            startActivity(new Intent(this, MainActivity.class));
        });

        binding.addBookImage.setOnClickListener(v -> {
            selectImage();
        });
    }

    public void selectImage() {
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("image/*");

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(intent, REQUEST_IMAGE_SET);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_IMAGE_SET && resultCode == RESULT_OK) {
            Bitmap thumbnail = data.getParcelableExtra("data");
            Uri fullPhotoUri = data.getData();
            binding.addBookImage.setImageURI(fullPhotoUri);
        }
    }
}
