package com.example.wheelspedia;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

import androidx.cardview.widget.CardView;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.wheelspedia.databinding.ActivityTataBinding;
import com.squareup.picasso.Picasso;

public class tata extends AppCompatActivity {
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
        setContentView(R.layout.activity_tata);

        String imageUrl1 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/39345/tiago-exterior-right-front-three-quarter-25.jpeg?isig=0&q=75&wm=1";
        String imageUrl2 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/39015/punch-exterior-right-front-three-quarter-2.jpeg?isig=0&q=75&wm=1";
        String imageUrl3 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/41160/tigor-exterior-right-front-three-quarter-3.png?isig=0&q=75&wm=1";
        String imageUrl4 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/32597/altroz-exterior-right-front-three-quarter-79.jpeg?isig=0&q=75&wm=1";
        String imageUrl5 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/99113/tiago-nrg-bs6-exterior-right-front-three-quarter.jpeg?isig=0&q=75&wm=1";
        String imageUrl6 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/41645/tata-nexon-right-front-three-quarter3.jpeg?q=75&wm=1";
        String imageUrl7 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/40453/tiago-ev-exterior-right-front-three-quarter-2.jpeg?isig=0&q=75&wm=1";
        String imageUrl8 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/135723/tigor-ev-exterior-right-front-three-quarter.jpeg?isig=0&q=75&wm=1";
        String imageUrl9 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/126681/nexon-ev-prime-exterior-right-front-three-quarter-2.jpeg?isig=0&q=75&wm=1";
        String imageUrl10 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/142739/harrier-exterior-right-front-three-quarter-2.jpeg?isig=0&q=75&wm=1";
        String imageUrl11 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/142865/safari-exterior-right-front-three-quarter-2.jpeg?isig=0&q=75&wm=1";
        String imageUrl12 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/121341/nexon-ev-max-exterior-right-front-three-quarter-7.jpeg?isig=0&q=75&wm=1";

        ImageView imageView1 = findViewById(R.id.tiago);
        Picasso.get().load(imageUrl1).into(imageView1);

        ImageView imageView2 = findViewById(R.id.punch);
        Picasso.get().load(imageUrl2).into(imageView2);

        ImageView imageView3 = findViewById(R.id.tigor);
        Picasso.get().load(imageUrl3).into(imageView3);

        ImageView imageView4 = findViewById(R.id.altroz);
        Picasso.get().load(imageUrl4).into(imageView4);

        ImageView imageView5 = findViewById(R.id.tiagonrz);
        Picasso.get().load(imageUrl5).into(imageView5);

        ImageView imageView6 = findViewById(R.id.nexon);
        Picasso.get().load(imageUrl6).into(imageView6);

        ImageView imageView7 = findViewById(R.id.tiagoev);
        Picasso.get().load(imageUrl7).into(imageView7);

        ImageView imageView8 = findViewById(R.id.tigorev);
        Picasso.get().load(imageUrl8).into(imageView8);

        ImageView imageView9 = findViewById(R.id.nexonevprime);
        Picasso.get().load(imageUrl9).into(imageView9);

        ImageView imageView10 = findViewById(R.id.harrier);
        Picasso.get().load(imageUrl10).into(imageView10);

        ImageView imageView11 = findViewById(R.id.safari);
        Picasso.get().load(imageUrl11).into(imageView11);

        ImageView imageView12 = findViewById(R.id.nexonevmax);
        Picasso.get().load(imageUrl12).into(imageView12);

        mycardview1 = (CardView) findViewById(R.id.tiago_click);
        mycardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(tata.this, tiago.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        mycardview2 = (CardView) findViewById(R.id.punch_click);
        mycardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(tata.this, punch.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        mycardview3 = (CardView) findViewById(R.id.tigor_click);
        mycardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(tata.this, tigor.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        mycardview4 = (CardView) findViewById(R.id.altroz_click);
        mycardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(tata.this, altroz.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        mycardview5 = (CardView) findViewById(R.id.tiagonrz_click);
        mycardview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(tata.this, tiagoNRZ.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        mycardview6 = (CardView) findViewById(R.id.nexon_click);
        mycardview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(tata.this, nexon.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        mycardview7 = (CardView) findViewById(R.id.harrier_click);
        mycardview7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(tata.this, harrier.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        mycardview7 = (CardView) findViewById(R.id.safari_click);
        mycardview7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(tata.this, safari.class);
                startActivity(intentLoadnewactivity1);
            }
        });


    }
}