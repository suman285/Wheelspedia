package com.example.wheelspedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class jaguar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jaguar);

        //image_1
        String imageUrl1 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Jaguar/XF/8670/Jaguar-XF-2.0-Petrol-R-Dynamic-S/1635170619851/front-left-side-47.jpg?tr=w-456";
        ImageView imageView1 = findViewById(R.id.jaguar1);
        Picasso.get().load(imageUrl1).fit().into(imageView1);

        //image_2
        String imageUrl2 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Jaguar/F-Pace/8449/1675426034233/front-left-side-47.jpg?tr=w-456";
        ImageView imageView2 = findViewById(R.id.jaguar2);
        Picasso.get().load(imageUrl2).fit().into(imageView2);

        //image_3
        String imageUrl3 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Jaguar/F-TYPE/7810/1675671305429/front-left-side-47.jpg?tr=w-456";
        ImageView imageView3 = findViewById(R.id.jaguar3);
        Picasso.get().load(imageUrl3).fit().into(imageView3);

        //image_4
        String imageUrl4 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Jaguar/I-Pace/8078/1675676920728/front-left-side-47.jpg?tr=w-456";
        ImageView imageView4 = findViewById(R.id.jaguar4);
        Picasso.get().load(imageUrl4).fit().into(imageView4);
    }
}