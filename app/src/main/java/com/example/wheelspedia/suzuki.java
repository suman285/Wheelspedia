package com.example.wheelspedia;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import androidx.cardview.widget.CardView;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.example.wheelspedia.databinding.ActivitySuzukiBinding;
import com.squareup.picasso.Picasso;

public class suzuki extends AppCompatActivity {
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
    CardView mycardview13;
    CardView mycardview14;
    CardView mycardview15;
    CardView mycardview16;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suzuki);

        String imageUrl1 = "https://imgd.aeplcdn.com/1056x594/cw/ec/39013/Maruti-Suzuki-Alto-Right-Front-Three-Quarter-154833.jpg?wm=1&q=75";
        String imageUrl2 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/127563/new-alto-exterior-right-front-three-quarter.jpeg?isig=0&q=75&wm=1";
        String imageUrl3 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/126463/s-presso-exterior-right-front-three-quarter.jpeg?isig=0&q=75&wm=1";
        String imageUrl4 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/135523/eeco-exterior-right-front-three-quarter.jpeg?isig=0&q=75&wm=1";
        String imageUrl5 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/53695/new-gen-celerio-exterior-right-front-three-quarter-2.jpeg?isig=0&q=75&wm=1";
        String imageUrl6 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/112947/wagon-r-2022-exterior-right-front-three-quarter.jpeg?isig=0&q=75&wm=1";
        String imageUrl7 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/142921/ignis-exterior-right-front-three-quarter.jpeg?isig=0&q=75&wm=1";
        String imageUrl8 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/54399/exterior-right-front-three-quarter-10.jpeg?q=75&wm=1";
        String imageUrl9 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/45691/marutisuzuki-dzire-right-front-three-quarter8.jpeg?q=75&wm=1";
        String imageUrl10 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/102663/baleno-exterior-right-front-three-quarter-2.jpeg?isig=0&q=75&wm=1";
        String imageUrl11 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/130591/fronx-exterior-right-front-three-quarter-4.jpeg?isig=0&q=75&wm=1";
        String imageUrl12 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/107543/vitara-brezza-2022-exterior-right-front-three-quarter.jpeg?isig=0&q=75&wm=1";
        String imageUrl13 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/115777/2022-ertiga-exterior-right-front-three-quarter-3.jpeg?isig=0&q=75&wm=1";
        String imageUrl14 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/48542/ciaz-exterior-right-front-three-quarter-2.jpeg?q=75&wm=1";
        String imageUrl15 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/123185/grand-vitara-exterior-right-front-three-quarter-2.jpeg?isig=0&q=75&wm=1";
        String imageUrl16 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/115601/2022-xl6-exterior-right-front-three-quarter-4.jpeg?isig=0&q=75&wm=1";

        ImageView imageView1 = findViewById(R.id.alto800);
        Picasso.get().load(imageUrl1).into(imageView1);

        ImageView imageView2 = findViewById(R.id.altok10);
        Picasso.get().load(imageUrl2).into(imageView2);

        ImageView imageView3 = findViewById(R.id.spresso);
        Picasso.get().load(imageUrl3).into(imageView3);

        ImageView imageView4 = findViewById(R.id.Eeco);
        Picasso.get().load(imageUrl4).into(imageView4);

        ImageView imageView5 = findViewById(R.id.celerio);
        Picasso.get().load(imageUrl5).into(imageView5);

        ImageView imageView6 = findViewById(R.id.wagonr);
        Picasso.get().load(imageUrl6).into(imageView6);

        ImageView imageView7 = findViewById(R.id.ignis);
        Picasso.get().load(imageUrl7).into(imageView7);

        ImageView imageView8 = findViewById(R.id.swift);
        Picasso.get().load(imageUrl8).into(imageView8);

        ImageView imageView9 = findViewById(R.id.dzire);
        Picasso.get().load(imageUrl9).into(imageView9);

        ImageView imageView10 = findViewById(R.id.baleno);
        Picasso.get().load(imageUrl10).into(imageView10);

        ImageView imageView11 = findViewById(R.id.fronx);
        Picasso.get().load(imageUrl11).into(imageView11);

        ImageView imageView12 = findViewById(R.id.brezza);
        Picasso.get().load(imageUrl12).into(imageView12);

        ImageView imageView13 = findViewById(R.id.ertiga);
        Picasso.get().load(imageUrl13).into(imageView13);

        ImageView imageView14 = findViewById(R.id.ciaz);
        Picasso.get().load(imageUrl14).into(imageView14);

        ImageView imageView15 = findViewById(R.id.grandvitara);
        Picasso.get().load(imageUrl15).into(imageView15);

        ImageView imageView16 = findViewById(R.id.xl6);
        Picasso.get().load(imageUrl16).into(imageView16);

        mycardview1 = (CardView) findViewById(R.id.alto800_click);
        mycardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(suzuki.this, alto800.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview2 = (CardView) findViewById(R.id.altok10_click);
        mycardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(suzuki.this, altok10.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview3 = (CardView) findViewById(R.id.spresso_click);
        mycardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(suzuki.this, s_presso.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview4 = (CardView) findViewById(R.id.Eeco_click);
        mycardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(suzuki.this, eeco.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview5 = (CardView) findViewById(R.id.wagonr_click);
        mycardview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(suzuki.this, wagonr.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview6 = (CardView) findViewById(R.id.ignis_click);
        mycardview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(suzuki.this, ignis.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview7 = (CardView) findViewById(R.id.celerio_click);
        mycardview7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(suzuki.this, celerio.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview8 = (CardView) findViewById(R.id.swift_click);
        mycardview8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(suzuki.this, swift.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview9 = (CardView) findViewById(R.id.dzire_click);
        mycardview9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(suzuki.this, dzire.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview10 = (CardView) findViewById(R.id.baleno_click);
        mycardview10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(suzuki.this, baleno.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview11 = (CardView) findViewById(R.id.fronx_click);
        mycardview11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(suzuki.this, fronx.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview12 = (CardView) findViewById(R.id.brezza_click);
        mycardview12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(suzuki.this, brezza.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview13 = (CardView) findViewById(R.id.ertiga_click);
        mycardview13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(suzuki.this, ertiga.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview14 = (CardView) findViewById(R.id.ciaz_click);
        mycardview14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(suzuki.this, ciaz.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview15 = (CardView) findViewById(R.id.grandvitara_click);
        mycardview15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(suzuki.this, grandvitara.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview16 = (CardView) findViewById(R.id.xl6_click);
        mycardview16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(suzuki.this, xl6.class);
                startActivity(intentLoadnewactivity1);
            }
        });




    }
}