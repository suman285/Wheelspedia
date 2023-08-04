package com.example.wheelspedia;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import com.squareup.picasso.Picasso;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.cardview.widget.CardView;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.wheelspedia.databinding.ActivityHyundaiBinding;

public class hyundai extends AppCompatActivity {
    CardView mycardview1;
    CardView mycardview2;
    CardView mycardview3;
    CardView mycardview4;
    CardView mycardview5;
    CardView mycardview6;
    CardView mycardview7;
    CardView mycardview8;
    CardView mycardview9;
    CardView mycardview10;
    CardView mycardview11;
    CardView mycardview12;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_hyundai);

        String imageUrl1 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/136183/grand-i10-nios-facelift-exterior-right-front-three-quarter-2.jpeg?isig=0&q=75&wm=1";
        String imageUrl2 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/139133/aura-2023-exterior-right-front-three-quarter.jpeg?isig=0&q=75&wm=1";
        String imageUrl3 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/40530/i20-exterior-right-front-three-quarter-5.jpeg?q=75&wm=1";
        String imageUrl4 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/141113/venue-exterior-right-front-three-quarter.jpeg?isig=0&q=75&wm=1";
        String imageUrl5 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/100121/i20-n-line-exterior-right-front-three-quarter-12.jpeg?isig=0&q=75&wm=1";
        String imageUrl6 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/141115/creta-exterior-right-front-three-quarter.jpeg?isig=0&q=75&wm=1";
        String imageUrl7 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/121943/verna-facelift-exterior-right-front-three-quarter.jpeg?isig=0&q=75&wm=1";
        String imageUrl8 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/142677/venue-n-line-exterior-right-front-three-quarter.jpeg?isig=0&q=75&wm=1";
        String imageUrl9 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/142523/alcazar-exterior-right-front-three-quarter.jpeg?isig=0&q=75&wm=1";
        String imageUrl10 = "https://imgd.aeplcdn.com/1056x594/cw/ec/29580/Hyundai-Kona-Electric-Right-Front-Three-Quarter-162185.jpg?wm=1&q=75";
        String imageUrl11 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/106821/new-tucson-exterior-right-front-three-quarter-5.jpeg?isig=0&q=75&wm=1";
        String imageUrl12 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/110289/ioniq-5-exterior-right-front-three-quarter-4.jpeg?isig=0&q=75&wm=1";

        ImageView imageView1 = findViewById(R.id.grandi10nios);
        Picasso.get().load(imageUrl1).into(imageView1);

        ImageView imageView2 = findViewById(R.id.aura);
        Picasso.get().load(imageUrl2).into(imageView2);

        ImageView imageView3 = findViewById(R.id.i20);
        Picasso.get().load(imageUrl3).into(imageView3);

        ImageView imageView4 = findViewById(R.id.venue);
        Picasso.get().load(imageUrl4).into(imageView4);

        ImageView imageView5 = findViewById(R.id.i20nline);
        Picasso.get().load(imageUrl5).into(imageView5);

        ImageView imageView6 = findViewById(R.id.creta);
        Picasso.get().load(imageUrl6).into(imageView6);

        ImageView imageView7 = findViewById(R.id.verna);
        Picasso.get().load(imageUrl7).into(imageView7);

        ImageView imageView8 = findViewById(R.id.venuenline);
        Picasso.get().load(imageUrl8).into(imageView8);

        ImageView imageView9 = findViewById(R.id.alcazar);
        Picasso.get().load(imageUrl9).into(imageView9);

        ImageView imageView10 = findViewById(R.id.konaelectric);
        Picasso.get().load(imageUrl10).into(imageView10);

        ImageView imageView11 = findViewById(R.id.tucson);
        Picasso.get().load(imageUrl11).into(imageView11);

        ImageView imageView12 = findViewById(R.id.ioniq5);
        Picasso.get().load(imageUrl12).into(imageView12);

        mycardview1 = (CardView) findViewById(R.id.grandi10nios_click);
        mycardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(hyundai.this, grandi10nios.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        mycardview2 = (CardView) findViewById(R.id.aura_click);
        mycardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(hyundai.this, aura.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        mycardview3 = (CardView) findViewById(R.id.i20_click);
        mycardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(hyundai.this, i20.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        mycardview4 = (CardView) findViewById(R.id.venue_click);
        mycardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(hyundai.this, venue.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        mycardview5 = (CardView) findViewById(R.id.i20nline_click);
        mycardview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(hyundai.this, i20Nline.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        mycardview6 = (CardView) findViewById(R.id.creta_click);
        mycardview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(hyundai.this, creta.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        mycardview7 = (CardView) findViewById(R.id.verna_click);
        mycardview7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(hyundai.this, Verna.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        mycardview8 = (CardView) findViewById(R.id.venuenline_click);
        mycardview8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(hyundai.this, venueNline.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        mycardview9 = (CardView) findViewById(R.id.alcazar_click);
        mycardview9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(hyundai.this, Alcazar.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        mycardview10 = (CardView) findViewById(R.id.konaelectric_click);
        mycardview10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(hyundai.this, kona.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        mycardview11 = (CardView) findViewById(R.id.tucson_click);
        mycardview11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(hyundai.this, tucson.class);
                startActivity(intentLoadnewactivity1);
            }
        });












    }
    }