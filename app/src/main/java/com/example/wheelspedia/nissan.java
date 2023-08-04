package com.example.wheelspedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class nissan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nissan);

        //image_1
        String imageUrl1 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/Nissan/Magnite/8127/1608191740345/front-left-side-47.jpg?tr=w-456";
        ImageView imageView1 = findViewById(R.id.nissan1);
        Picasso.get().load(imageUrl1).fit().into(imageView1);

    }
}