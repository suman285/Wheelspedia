package com.example.wheelspedia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class jeep extends AppCompatActivity {
    CardView mycardview1;
    CardView mycardview2;
    CardView mycardview3;
    CardView mycardview4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeep);

        String imageUrl1 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/47051/compass-exterior-right-front-three-quarter-73.jpeg?isig=0&q=75&wm=1";
        String imageUrl2 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/47139/meridian-exterior-right-front-three-quarter-5.jpeg?isig=0&q=75&wm=1";
        String imageUrl3 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/54437/2021-wrangler-exterior-right-front-three-quarter.jpeg?q=75&wm=1";
        String imageUrl4 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/132711/grand-cherokee-exterior-right-front-three-quarter.jpeg?isig=0&q=75&wm=1";

        ImageView imageView1 = findViewById(R.id.compass);
        Picasso.get().load(imageUrl1).into(imageView1);

        ImageView imageView2 = findViewById(R.id.meridian);
        Picasso.get().load(imageUrl2).into(imageView2);

        ImageView imageView3 = findViewById(R.id.wrangler);
        Picasso.get().load(imageUrl3).into(imageView3);

        ImageView imageView4 = findViewById(R.id.grandcherokee);
        Picasso.get().load(imageUrl4).into(imageView4);

        mycardview1 = (CardView) findViewById(R.id.compass_click);
        mycardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(jeep.this, compass.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview2 = (CardView) findViewById(R.id.meridian_click);
        mycardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(jeep.this, meridian.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview3 = (CardView) findViewById(R.id.wrangler_click);
        mycardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(jeep.this, wrangler.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview4 = (CardView) findViewById(R.id.grandcherokee_click);
        mycardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(jeep.this, grandCherokee.class);
                startActivity(intentLoadnewactivity1);
            }
        });
    }
}