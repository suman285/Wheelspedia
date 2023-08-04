package com.example.wheelspedia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.squareup.picasso.Picasso;

public class kia extends AppCompatActivity {
    CardView mycardview1;
    CardView mycardview2;
    CardView mycardview3;
    CardView mycardview4;


    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_kia);

        String imageUrl1 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/144185/sonet-exterior-right-front-three-quarter-2.jpeg?isig=0&q=75&wm=1";
        String imageUrl2 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/144163/carens-exterior-right-front-three-quarter.jpeg?isig=0&q=75&wm=1";
        String imageUrl3 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/144159/seltos-exterior-right-front-three-quarter.jpeg?isig=0&q=75&wm=1";
        String imageUrl4 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/41205/carnival-exterior-right-front-three-quarter-55.jpeg?isig=0&q=75&wm=1";
        String imageUrl5 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/114971/ev6-exterior-right-front-three-quarter-3.jpeg?isig=0&q=75&wm=1";

        ImageView imageView1 = findViewById(R.id.sonet);
        Picasso.get().load(imageUrl1).into(imageView1);

        ImageView imageView2 = findViewById(R.id.seltos);
        Picasso.get().load(imageUrl3).into(imageView2);

        ImageView imageView3 = findViewById(R.id.carens);
        Picasso.get().load(imageUrl2).into(imageView3);

        ImageView imageView4 = findViewById(R.id.carnival);
        Picasso.get().load(imageUrl4).into(imageView4);

        ImageView imageView5 = findViewById(R.id.ev6);
        Picasso.get().load(imageUrl5).into(imageView5);

        mycardview1 = (CardView) findViewById(R.id.sonet_click);
        mycardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(kia.this, sonet.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview2 = (CardView) findViewById(R.id.seltos_click);
        mycardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(kia.this, seltos.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview3 = (CardView) findViewById(R.id.carens_click);
        mycardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(kia.this, carens.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview4 = (CardView) findViewById(R.id.carnival_click);
        mycardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(kia.this, carnival.class);
                startActivity(intentLoadnewactivity1);
            }
        });



    }
    }