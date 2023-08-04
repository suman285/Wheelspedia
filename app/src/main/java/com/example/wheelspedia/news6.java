package com.example.wheelspedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class news6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news6);

        String imageUrl26 = "https://etimg.etb2bimg.com/photo/75327681.cms";
        ImageView imageView26 = findViewById(R.id.news6);
        Picasso.get().load(imageUrl26).fit().centerCrop().into(imageView26);
    }
}