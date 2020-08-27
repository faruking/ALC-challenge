package com.faruking.alcchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class ProfilePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);

        ImageView imageView = findViewById(R.id.imageView);
        Picasso.get()
                .load(R.drawable.my_profile_pictures)
               // .centerCrop()
              //  .fit()
                .into(imageView);
    }
}