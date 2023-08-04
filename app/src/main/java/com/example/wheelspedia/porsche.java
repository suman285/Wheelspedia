package com.example.wheelspedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class porsche extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_porsche);

        //image_1
        String imageUrl1 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Porsche/Macan/8687/1677661032684/front-left-side-47.jpg?tr=w-456";
        ImageView imageView1 = findViewById(R.id.porsche1);
        Picasso.get().load(imageUrl1).fit().into(imageView1);

        //image_2
        String imageUrl2 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Porsche/Cayenne-2024/9903/Porsche-Cayenne-2024-/1681882894783/front-left-side-47.jpg?tr=w-456";
        ImageView imageView2 = findViewById(R.id.porsche2);
        Picasso.get().load(imageUrl2).fit().into(imageView2);

        //image_3
        String imageUrl3 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Porsche/718/5631/1677650880931/front-left-side-47.jpg?tr=w-456";
        ImageView imageView3 = findViewById(R.id.porsche3);
        Picasso.get().load(imageUrl3).fit().into(imageView3);

        //image_4
        String imageUrl4 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Porsche/Cayenne-Coupe/9931/1682515216486/front-left-side-47.jpg?tr=w-456";
        ImageView imageView4 = findViewById(R.id.porsche4);
        Picasso.get().load(imageUrl4).fit().into(imageView4);

        //image_5
        String imageUrl5 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Porsche/Taycan/7041/1636711367887/front-left-side-47.jpg?tr=w-456";
        ImageView imageView5 = findViewById(R.id.porsche5);
        Picasso.get().load(imageUrl5).fit().into(imageView5);

        //image_6
        String imageUrl6 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Porsche/Panamera/8329/1623301989193/front-left-side-47.jpg?imwidth=420&impolicy=resize";
        ImageView imageView6 = findViewById(R.id.porsche6);
        Picasso.get().load(imageUrl6).fit().into(imageView6);

        //image_7
        String imageUrl7 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Porsche/911/7652/1677566789939/front-left-side-47.jpg?tr=w-456";
        ImageView imageView7 = findViewById(R.id.porsche7);
        Picasso.get().load(imageUrl7).fit().into(imageView7);

        //image_8
        String imageUrl8 = "https://cdni.autocarindia.com/Utils/ImageResizer.ashx?n=https://cms.haymarketindia.net/model/uploads/modelimages/Porsche-Taycan-Cross-Turismo-230920221154.jpg&w=730&h=484&q=75&c=1";
        ImageView imageView8 = findViewById(R.id.porsche8);
        Picasso.get().load(imageUrl8).fit().into(imageView8);


    }
}