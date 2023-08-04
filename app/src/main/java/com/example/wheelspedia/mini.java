package com.example.wheelspedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class mini extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mini);

        //image_1
        String imageUrl1 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Mini/3-DOOR/5176/1647857006326/front-left-side-47.jpg?tr=w-456";
        ImageView imageView1 = findViewById(R.id.mini1);
        Picasso.get().load(imageUrl1).fit().into(imageView1);

        //image_2
        String imageUrl2 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Mini/Cooper-Countryman/8395/1677573838492/front-left-side-47.jpg?tr=w-456";
        ImageView imageView2 = findViewById(R.id.mini2);
        Picasso.get().load(imageUrl2).fit().into(imageView2);

        //image_3
        String imageUrl3 = "https://imgd.aeplcdn.com/1200x900/n/cw/ec/39603/cooper-jcw-exterior-right-front-three-quarter-2.jpeg?q=75";
        ImageView imageView3 = findViewById(R.id.mini3);
        Picasso.get().load(imageUrl3).fit().into(imageView3);

        //image_4
        String imageUrl4 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Mini/Cooper-SE/8669/Mini-Cooper-SE-Electric/1645696928987/front-left-side-47.jpg?tr=w-456";
        ImageView imageView4 = findViewById(R.id.mini4);
        Picasso.get().load(imageUrl4).fit().into(imageView4);

        //image_5
        String imageUrl5 = "https://imgd.aeplcdn.com/0x0/n/cw/ec/34561/cooper-convertible-exterior-right-front-three-quarter-2.jpeg";
        ImageView imageView5 = findViewById(R.id.mini5);
        Picasso.get().load(imageUrl5).fit().into(imageView5);
    }
}