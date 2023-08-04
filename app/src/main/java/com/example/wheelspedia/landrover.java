package com.example.wheelspedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class landrover extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landrover);

        //image_1
        String imageUrl1 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Land-Rover/Discovery-Sport/7575/1676881553844/front-left-side-47.jpg?tr=w-456";
        ImageView imageView1 = findViewById(R.id.lr1);
        Picasso.get().load(imageUrl1).fit().into(imageView1);

        //image_2
        String imageUrl2 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Land-Rover/Range-Rover-Evoque/9010/1676543851808/front-left-side-47.jpg?tr=w-456";
        ImageView imageView2 = findViewById(R.id.lr2);
        Picasso.get().load(imageUrl2).fit().into(imageView2);

        //image_3
        String imageUrl3 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Land-Rover/Discovery/8514/1646805311941/front-left-side-47.jpg?tr=w-456";
        ImageView imageView3 = findViewById(R.id.lr3);
        Picasso.get().load(imageUrl3).fit().into(imageView3);

        //image_4
        String imageUrl4 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Land-Rover/Range-Rover-Velar/8456/1623994273592/front-left-side-47.jpg?tr=w-456";
        ImageView imageView4 = findViewById(R.id.lr4);
        Picasso.get().load(imageUrl4).fit().into(imageView4);

        //image_5
        String imageUrl5 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Land-Rover/Defender/9065/Land-Rover-Defender-2.0-90-HSE/1686138012912/front-left-side-47.jpg?tr=w-456";
        ImageView imageView5 = findViewById(R.id.lr5);
        Picasso.get().load(imageUrl5).fit().into(imageView5);

        //image_6
        String imageUrl6 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Land-Rover/Range-Rover-Sport/9115/1653022703223/front-left-side-47.jpg?tr=w-456";
        ImageView imageView6 = findViewById(R.id.lr6);
        Picasso.get().load(imageUrl6).fit().into(imageView6);

        //image_7
        String imageUrl7 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Land-Rover/Range-Rover/9018/1676541159356/front-left-side-47.jpg?tr=w-456";
        ImageView imageView7 = findViewById(R.id.lr7);
        Picasso.get().load(imageUrl7).fit().into(imageView7);

    }
}