package com.example.wheelspedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class rr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rr);

        //image_1
        String imageUrl1 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Rolls-Royce/Rolls-Royce-Wraith/6398/1595835409056/front-left-side-47.jpg?tr=w-456";
        ImageView imageView1 = findViewById(R.id.rr1);
        Picasso.get().load(imageUrl1).fit().into(imageView1);

        //image_2
        String imageUrl2 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Rolls-Royce/Rolls-Royce-Dawn/4289/1556525892112/front-left-side-47.jpg?tr=w-456";
        ImageView imageView2 = findViewById(R.id.rr2);
        Picasso.get().load(imageUrl2).fit().into(imageView2);

        //image_3
        String imageUrl3 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Rolls-Royce/Rolls-Royce-Cullinan/6405/1556533266269/front-left-side-47.jpg?tr=w-456";
        ImageView imageView3 = findViewById(R.id.rr3);
        Picasso.get().load(imageUrl3).fit().into(imageView3);

        //image_4
        String imageUrl4 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Rolls-Royce/Rolls-Royce-Phantom/7783/1587206758888/front-left-side-47.jpg?impolicy=resize&imwidth=480";
        ImageView imageView4 = findViewById(R.id.rr4);
        Picasso.get().load(imageUrl4).fit().into(imageView4);
    }
}