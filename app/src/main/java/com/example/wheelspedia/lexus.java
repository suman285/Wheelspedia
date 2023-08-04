package com.example.wheelspedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class lexus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lexus);

        //image_1
        String imageUrl1 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Lexus/ES/9399/1665652746848/front-left-side-47.jpg?tr=w-456";
        ImageView imageView1 = findViewById(R.id.lexus1);
        Picasso.get().load(imageUrl1).fit().into(imageView1);

        //image_2
        String imageUrl2 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Lexus/NX/8887/1646816229708/front-left-side-47.jpg?tr=w-456";
        ImageView imageView2 = findViewById(R.id.lexus2);
        Picasso.get().load(imageUrl2).fit().into(imageView2);

        //image_3
        String imageUrl3 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Lexus/RX/9915/1681980756186/front-left-side-47.jpg?tr=w-456";
        ImageView imageView3 = findViewById(R.id.lexus3);
        Picasso.get().load(imageUrl3).fit().into(imageView3);

        //image_4
        String imageUrl4 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Lexus/LS/4924/1622802604706/front-left-side-47.jpg?tr=w-456";
        ImageView imageView4 = findViewById(R.id.lexus4);
        Picasso.get().load(imageUrl4).fit().into(imageView4);

        //image_5
        String imageUrl5 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Lexus/LC-500h/7043/1676886702173/front-left-side-47.jpg?tr=w-456";
        ImageView imageView5 = findViewById(R.id.lexus5);
        Picasso.get().load(imageUrl5).fit().into(imageView5);

        //image_6
        String imageUrl6 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Lexus/LX/8657/1671778873338/front-left-side-47.jpg?tr=w-456";
        ImageView imageView6 = findViewById(R.id.lexus6);
        Picasso.get().load(imageUrl6).fit().into(imageView6);
    }
}