package com.example.wheelspedia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;



public class mahindra extends AppCompatActivity {
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
        setContentView(R.layout.activity_mahindra);

        ImageView imageViewm1 = findViewById(R.id.kuv100nxt);
        String imageUrl1 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/21497/kuv100-nxt-exterior-right-front-three-quarter-64047.jpeg";
        Picasso.get().load(imageUrl1).into(imageViewm1);

        ImageView imageViewm2 = findViewById(R.id.xuv300);
        String imageUrl2 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/26918/xuv300-exterior-right-front-three-quarter-148706.jpeg";
        Picasso.get().load(imageUrl2).into(imageViewm2);

        ImageView imageViewm3 = findViewById(R.id.boleroneo);
        String imageUrl3 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/131181/bolero-neo-exterior-right-front-three-quarter.jpeg";
        Picasso.get().load(imageUrl3).into(imageViewm3);

        ImageView imageViewm4 = findViewById(R.id.bolero);
        String imageUrl4 = "https://imgd.aeplcdn.com/476x268/n/cw/ec/131179/bolero-exterior-left-front-three-quarter.jpeg";
        Picasso.get().load(imageUrl4).into(imageViewm4);

        ImageView imageViewm5 = findViewById(R.id.thar);
        String imageUrl5 = "https://imgd.aeplcdn.com/370x208/n/cw/ec/40087/thar-exterior-right-front-three-quarter-32.jpeg";
        Picasso.get().load(imageUrl5).into(imageViewm5);


        ImageView imageViewm7 = findViewById(R.id.scorpio);
        String imageUrl7 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/128413/scorpio-exterior-right-front-three-quarter-46.jpeg";
        Picasso.get().load(imageUrl7).into(imageViewm7);

        ImageView imageViewm8 = findViewById(R.id.scorpion);
        String imageUrl8 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/40432/scorpio-n-exterior-right-front-three-quarter-15.jpeg";
        Picasso.get().load(imageUrl8).into(imageViewm8);

        ImageView imageViewm9 = findViewById(R.id.marazzo);
        String imageUrl9 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/49114/marazzo-exterior-right-front-three-quarter-5.jpeg";
        Picasso.get().load(imageUrl9).into(imageViewm9);

        ImageView imageViewm10 = findViewById(R.id.xuv700);
        String imageUrl10 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/42355/xuv700-exterior-right-front-three-quarter.jpeg";
        Picasso.get().load(imageUrl10).into(imageViewm10);

        ImageView imageViewm11 = findViewById(R.id.xuv400);
        String imageUrl11 = "https://imgd.aeplcdn.com/1056x594/n/cw/ec/45278/xuv400-exterior-right-front-three-quarter-4.jpeg?isig=0&q=75&wm=1";
        Picasso.get().load(imageUrl11).into(imageViewm11);

        mycardview1 = (CardView) findViewById(R.id.kuv100nxt_click);
        mycardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(mahindra.this, kuv100Nxt.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        mycardview2 = (CardView) findViewById(R.id.xuv300_click);
        mycardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(mahindra.this, xuv300.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        mycardview2 = (CardView) findViewById(R.id.boleroneo_click);
        mycardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(mahindra.this, boleroNeo.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        mycardview3 = (CardView) findViewById(R.id.bolero_click);
        mycardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(mahindra.this, bolero.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        mycardview4 = (CardView) findViewById(R.id.thar_click);
        mycardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(mahindra.this, thar.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        mycardview5 = (CardView) findViewById(R.id.scorpio_click);
        mycardview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(mahindra.this, scorpio.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        mycardview6 = (CardView) findViewById(R.id.scorpion_click);
        mycardview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(mahindra.this, scorpioN.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        mycardview6 = (CardView) findViewById(R.id.marazzo_click);
        mycardview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(mahindra.this, marazzo.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        mycardview6 = (CardView) findViewById(R.id.xuv700_click);
        mycardview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(mahindra.this, xuv700.class);
                startActivity(intentLoadnewactivity1);
            }
        });



    }
}