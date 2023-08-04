package com.example.wheelspedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class volvo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volvo);

        //image_1
        String imageUrl1 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Volvo/XC40/9320/1663821223546/front-left-side-47.jpg?tr=w-456";
        ImageView imageView1 = findViewById(R.id.volvo1);
        Picasso.get().load(imageUrl1).fit().into(imageView1);

        //image_2
        String imageUrl2 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Volvo/XC40-Recharge/8398/1659334957989/front-left-side-47.jpg?tr=w-456";
        ImageView imageView2 = findViewById(R.id.volvo2);
        Picasso.get().load(imageUrl2).fit().into(imageView2);

        //image_3
        String imageUrl3 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Volvo/XC60/9469/1676369308531/front-left-side-47.jpg?tr=w-456";
        ImageView imageView3 = findViewById(R.id.volvo3);
        Picasso.get().load(imageUrl3).fit().into(imageView3);

        //image_4
        String imageUrl4 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Volvo/S90/9470/1669876182351/front-left-side-47.jpg?tr=w-456";
        ImageView imageView4 = findViewById(R.id.volvo4);
        Picasso.get().load(imageUrl4).fit().into(imageView4);

        //image_5
        String imageUrl5 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Volvo/XC-90/9468/1676370898732/front-left-side-47.jpg?tr=w-456";
        ImageView imageView5 = findViewById(R.id.volvo5);
        Picasso.get().load(imageUrl5).fit().into(imageView5);
    }
}