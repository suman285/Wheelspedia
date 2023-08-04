package com.example.wheelspedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class msrt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msrt);

        //image_1
        String imageUrl1 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Maserati/Ghibli/8338/1612512313468/front-left-side-47.jpg?tr=w-456";
        ImageView imageView1 = findViewById(R.id.msrt1);
        Picasso.get().load(imageUrl1).fit().into(imageView1);

        //image_2
        String imageUrl2 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Maserati/Levante/7547/1582365134672/front-left-side-47.jpg?tr=w-456";
        ImageView imageView2 = findViewById(R.id.msrt2);
        Picasso.get().load(imageUrl2).fit().into(imageView2);

        //image_3
        String imageUrl3 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Maserati/Quattroporte/7561/1582364877697/front-left-side-47.jpg?tr=w-456";
        ImageView imageView3 = findViewById(R.id.msrt3);
        Picasso.get().load(imageUrl3).fit().into(imageView3);

        //image_4
        String imageUrl4 = "https://imgd.aeplcdn.com/0X0/n/cw/ec/108971/mc20-exterior-right-front-three-quarter.jpeg?isig=0&q=75";
        ImageView imageView4 = findViewById(R.id.msrt4);
        Picasso.get().load(imageUrl4).fit().into(imageView4);
    }
}