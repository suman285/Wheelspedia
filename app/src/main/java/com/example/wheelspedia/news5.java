package com.example.wheelspedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class news5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news5);

        //news5 photo
        String imageUrl27 = "https://images.hindustantimes.com/auto/img/2022/03/20/1600x900/BMW_X5_xDrive_SPortX_Plus_1631527933460_1647776517858.jpg";
        ImageView imageView27 = findViewById(R.id.news5);
        Picasso.get().load(imageUrl27).fit().centerCrop().into(imageView27);
    }
}