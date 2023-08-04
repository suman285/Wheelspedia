package com.example.wheelspedia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Toyota extends AppCompatActivity {
    CardView mycardview1;
    CardView mycardview2;
    CardView mycardview3;
    CardView mycardview4;
    CardView mycardview5;
    CardView mycardview6;
    CardView mycardview7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toyota2);

        //image_1
        String imageUrl1 = "https://imgd.aeplcdn.com/227x128/n/cw/ec/112839/glanza-facelift-exterior-right-front-three-quarter.jpeg?isig=0&q=75";
        ImageView imageView1 = findViewById(R.id.toyota1);
        Picasso.get().load(imageUrl1).fit().centerCrop().into(imageView1);

        //image_2
        String imageUrl2 = "https://imgd.aeplcdn.com/227x128/n/cw/ec/124027/urban-cruiser-hyryder-exterior-right-front-three-quarter-3.jpeg?isig=0&q=75";
        ImageView imageView2 = findViewById(R.id.toyota2);
        Picasso.get().load(imageUrl2).fit().centerCrop().into(imageView2);

        //image_3
        String imageUrl3 = "https://imgd.aeplcdn.com/227x128/n/cw/ec/115025/innova-hycross-exterior-right-front-three-quarter-2.jpeg?isig=0&q=75";
        ImageView imageView3 = findViewById(R.id.toyota3);
        Picasso.get().load(imageUrl3).fit().centerCrop().into(imageView3);

        //image_4
        String imageUrl4 = "https://imgd.aeplcdn.com/227x128/n/cw/ec/140809/innova-crysta-exterior-right-front-three-quarter.png?isig=0&q=75";
        ImageView imageView4 = findViewById(R.id.toyota4);
        Picasso.get().load(imageUrl4).fit().centerCrop().into(imageView4);

        //image_5
        String imageUrl5 = "https://imgd.aeplcdn.com/227x128/n/cw/ec/109265/hilux-exterior-right-front-three-quarter.jpeg?isig=0&q=75";
        ImageView imageView5 = findViewById(R.id.toyota5);
        Picasso.get().load(imageUrl5).fit().centerCrop().into(imageView5);

        //image_6
        String imageUrl6 = "https://imgd.aeplcdn.com/227x128/n/cw/ec/44709/fortuner-exterior-right-front-three-quarter-19.jpeg?q=75";
        ImageView imageView6 = findViewById(R.id.toyota6);
        Picasso.get().load(imageUrl6).fit().centerCrop().into(imageView6);

        //image_7
        String imageUrl7 = "https://imgd.aeplcdn.com/227x128/n/cw/ec/137767/fortuner-legender-exterior-right-front-three-quarter-4.png?isig=0&q=75";
        ImageView imageView7 = findViewById(R.id.toyota7);
        Picasso.get().load(imageUrl7).fit().centerCrop().into(imageView7);

        //image_8
        String imageUrl8 = "https://imgd.aeplcdn.com/227x128/n/cw/ec/110233/2022-camry-exterior-right-front-three-quarter.jpeg?isig=0&q=75";
        ImageView imageView8 = findViewById(R.id.toyota8);
        Picasso.get().load(imageUrl8).fit().centerCrop().into(imageView8);

        //image_9
        String imageUrl9 = "https://imgd.aeplcdn.com/227x128/n/cw/ec/41217/toyota-vellfire-right-front-three-quarter5.jpeg?q=75";
        ImageView imageView9 = findViewById(R.id.toyota9);
        Picasso.get().load(imageUrl9).fit().centerCrop().into(imageView9);

        //image_10
        String imageUrl10 = "https://imgd.aeplcdn.com/227x128/n/cw/ec/139739/land-cruiser-exterior-right-front-three-quarter.jpeg?isig=0&q=75";
        ImageView imageView10 = findViewById(R.id.toyota10);
        Picasso.get().load(imageUrl10).fit().centerCrop().into(imageView10);

        mycardview1 = (CardView) findViewById(R.id.toyota1_click);
        mycardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(Toyota.this, glanza.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview2 = (CardView) findViewById(R.id.toyota2_click);
        mycardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(Toyota.this, uchyryder.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview3 = (CardView) findViewById(R.id.toyota3_click);
        mycardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(Toyota.this, ihycross.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview4 = (CardView) findViewById(R.id.toyota4_click);
        mycardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(Toyota.this, icrysta.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        mycardview4 = (CardView) findViewById(R.id.toyota5_click);
        mycardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(Toyota.this, hilux.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        mycardview4 = (CardView) findViewById(R.id.toyota6_click);
        mycardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(Toyota.this, fortuner.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        mycardview4 = (CardView) findViewById(R.id.toyota7_click);
        mycardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(Toyota.this, legender.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        mycardview4 = (CardView) findViewById(R.id.toyota8_click);
        mycardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(Toyota.this, camry.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        mycardview4 = (CardView) findViewById(R.id.toyota9_click);
        mycardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(Toyota.this, vellfire.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        mycardview4 = (CardView) findViewById(R.id.toyota10_click);
        mycardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(Toyota.this, landcruiser.class);
                startActivity(intentLoadnewactivity1);
            }
        });
    }
}