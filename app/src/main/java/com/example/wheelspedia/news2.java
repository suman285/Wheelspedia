package com.example.wheelspedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class news2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news2);

        //news2 photo
        String imageUrl24 = "https://cdn.vox-cdn.com/thumbor/mTGZ9Yaa9SIzrXlYgeGZjHkNyJ0=/0x0:4661x3122/1400x1400/filters:focal(2331x1561:2332x1562)/cdn.vox-cdn.com/uploads/chorus_asset/file/19352562/1170373908.jpg.jpg";
        ImageView imageView24 = findViewById(R.id.news2);
        Picasso.get().load(imageUrl24).fit().centerCrop().into(imageView24);
    }
}