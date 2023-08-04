package com.example.wheelspedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class isuzu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isuzu);

        //image_1
        String imageUrl1 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Isuzu/D-Max/9422/1667896979680/front-left-side-47.jpg?tr=w-456";
        ImageView imageView1 = findViewById(R.id.isuzu1);
        Picasso.get().load(imageUrl1).fit().into(imageView1);

        //image_2
        String imageUrl2 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Isuzu/MU-X/9889/1681734066714/front-left-side-47.jpg?tr=w-456";
        ImageView imageView2 = findViewById(R.id.isuzu2);
        Picasso.get().load(imageUrl2).fit().into(imageView2);

    }
}