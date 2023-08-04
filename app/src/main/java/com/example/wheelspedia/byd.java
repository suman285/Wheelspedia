package com.example.wheelspedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class byd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_byd);

        //image_1
        String imageUrl1 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/BYD/E6/8675/1676289700142/front-left-side-47.jpg?tr=w-456";
        ImageView imageView1 = findViewById(R.id.byd1);
        Picasso.get().load(imageUrl1).fit().into(imageView1);

        //image_2
        String imageUrl2 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/BYD/Atto-3/9307/1673519348297/front-left-side-47.jpg?tr=w-456";
        ImageView imageView2 = findViewById(R.id.byd2);
        Picasso.get().load(imageUrl2).fit().into(imageView2);
    }
}