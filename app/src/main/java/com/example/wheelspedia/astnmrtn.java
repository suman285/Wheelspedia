package com.example.wheelspedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class astnmrtn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_astnmrtn);

        //image_1
        String imageUrl1 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Aston-Martin/Vantage/8062/1676272900290/front-left-side-47.jpg?tr=w-456";
        ImageView imageView1 = findViewById(R.id.astnmrtn1);
        Picasso.get().load(imageUrl1).fit().into(imageView1);

        //image_2
        String imageUrl2 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Aston-Martin/DB11/8064/1676268014798/front-left-side-47.jpg?tr=w-456";
        ImageView imageView2 = findViewById(R.id.astnmrtn2);
        Picasso.get().load(imageUrl2).fit().into(imageView2);

        //image_3
        String imageUrl3 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Aston-Martin/DBX/9386/1676270378012/front-left-side-47.jpg?tr=w-456";
        ImageView imageView3 = findViewById(R.id.astnmrtn3);
        Picasso.get().load(imageUrl3).fit().into(imageView3);
    }
}