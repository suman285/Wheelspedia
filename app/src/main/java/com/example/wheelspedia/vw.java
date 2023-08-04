package com.example.wheelspedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class vw extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vw);

        //image_1
        String imageUrl1 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Volkswagen/Virtus/9141/1677760290941/front-left-side-47.jpg?tr=w-456";
        ImageView imageView1 = findViewById(R.id.vw1);
        Picasso.get().load(imageUrl1).fit().into(imageView1);

        //image_2
        String imageUrl2 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Volkswagen/Taigun/1981/1677915119518/front-left-side-47.jpg?tr=w-456";
        ImageView imageView2 = findViewById(R.id.vw2);
        Picasso.get().load(imageUrl2).fit().into(imageView2);

        //image_3
        String imageUrl3 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Volkswagen/Tiguan/10132/1684404924124/front-left-side-47.jpg?tr=w-456";
        ImageView imageView3 = findViewById(R.id.vw3);
        Picasso.get().load(imageUrl3).fit().into(imageView3);
    }
}