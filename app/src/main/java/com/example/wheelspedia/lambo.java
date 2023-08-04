package com.example.wheelspedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class lambo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lambo);

        //image_1
        String imageUrl1 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Lamborghini/Huracan-EVO/6729/1678692048287/front-left-side-47.jpg?tr=w-456";
        ImageView imageView1 = findViewById(R.id.lambo1);
        Picasso.get().load(imageUrl1).fit().into(imageView1);

        //image_2
        String imageUrl2 = "https://imgd.aeplcdn.com/0x0/n/cw/ec/95475/huracan-evo-spyder-exterior-right-side-view.jpeg?isig=0";
        ImageView imageView2 = findViewById(R.id.lambo2);
        Picasso.get().load(imageUrl2).fit().into(imageView2);

        //image_3
        String imageUrl3 = "https://images.hindustantimes.com/auto/img/2022/04/13/1600x900/lamborghini-huracan-tecnica_1649826312983_1649826319004.jpg";
        ImageView imageView3 = findViewById(R.id.lambo3);
        Picasso.get().load(imageUrl3).fit().into(imageView3);

        //image_4
        String imageUrl4 = "https://cdni.autocarindia.com/Utils/ImageResizer.ashx?n=https://cdni.autocarindia.com/ExtraImages/20230324050608_1.jpg&w=700&q=90&c=1";
        ImageView imageView4 = findViewById(R.id.lambo4);
        Picasso.get().load(imageUrl4).fit().into(imageView4);

        //image_5
        String imageUrl5 = "https://imgd.aeplcdn.com/0x0/n/cw/ec/53859/urus-performante-exterior-right-front-three-quarter-3.jpeg?isig=0";
        ImageView imageView5 = findViewById(R.id.lambo5);
        Picasso.get().load(imageUrl5).fit().into(imageView5);

        //image_6
        String imageUrl6 = "https://imgd.aeplcdn.com/664x374/n/cw/ec/97705/huracan-sto-exterior-right-front-three-quarter-2.jpeg?q=75";
        ImageView imageView6 = findViewById(R.id.lambo6);
        Picasso.get().load(imageUrl6).fit().into(imageView6);
    }
}