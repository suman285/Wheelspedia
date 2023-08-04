package com.example.wheelspedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class citroen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citroen);

        //image_1
        String imageUrl1 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Citroen/C3/9139/1677916330735/front-left-side-47.jpg?tr=w-456";
        ImageView imageView1 = findViewById(R.id.citroen1);
        Picasso.get().load(imageUrl1).fit().into(imageView1);

        //image_2
        String imageUrl2 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Citroen/C3-EV/9598/1676960438789/front-left-side-47.jpg?tr=w-456";
        ImageView imageView2 = findViewById(R.id.citroen2);
        Picasso.get().load(imageUrl2).fit().into(imageView2);

        //image_3
        String imageUrl3 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Citroen/C5-Aircross/8749/1662624961896/front-left-side-47.jpg?tr=w-456";
        ImageView imageView3 = findViewById(R.id.citroen3);
        Picasso.get().load(imageUrl3).fit().into(imageView3);
    }
}