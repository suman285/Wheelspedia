package com.example.wheelspedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class skoda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skoda);

        //image_1
        String imageUrl1 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Skoda/Slavia/9813/1681805581204/front-left-side-47.jpg?tr=w-456";
        ImageView imageView1 = findViewById(R.id.skoda1);
        Picasso.get().load(imageUrl1).fit().into(imageView1);

        //image_2
        String imageUrl2 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Skoda/Kushaq/9815/1681724041593/front-left-side-47.jpg?tr=w-456";
        ImageView imageView2 = findViewById(R.id.skoda2);
        Picasso.get().load(imageUrl2).fit().into(imageView2);

        //image_3
        String imageUrl3 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Skoda/Superb/9822/1683532806044/front-left-side-47.jpg?tr=w-456";
        ImageView imageView3 = findViewById(R.id.skoda3);
        Picasso.get().load(imageUrl3).fit().into(imageView3);

        //image_4
        String imageUrl4 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Skoda/Kodiaq/9827/1681469570831/front-left-side-47.jpg?tr=w-456";
        ImageView imageView4 = findViewById(R.id.skoda4);
        Picasso.get().load(imageUrl4).fit().into(imageView4);
    }
}