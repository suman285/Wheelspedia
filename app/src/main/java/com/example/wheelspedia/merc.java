package com.example.wheelspedia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class merc extends AppCompatActivity {
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
        setContentView(R.layout.activity_merc);

        //image_1
        String imageUrl1 = "https://imgd.aeplcdn.com/664x374/n/cw/ec/149525/a-class-limousine-exterior-right-front-three-quarter-2.jpeg?isig=0&q=75";
        ImageView imageView1 = findViewById(R.id.merc1);
        Picasso.get().load(imageUrl1).fit().centerCrop().into(imageView1);

        //image_2
        String imageUrl2 = "https://imgd.aeplcdn.com/664x374/n/cw/ec/44784/gla-exterior-right-front-three-quarter.jpeg?q=75";
        ImageView imageView2 = findViewById(R.id.merc2);
        Picasso.get().load(imageUrl2).fit().centerCrop().into(imageView2);

        //image_3
        String imageUrl3 = "https://imgd.aeplcdn.com/664x374/n/cw/ec/94041/amg-a35-exterior-right-front-three-quarter-5.jpeg?isig=0&q=75";
        ImageView imageView3 = findViewById(R.id.merc3);
        Picasso.get().load(imageUrl3).fit().centerCrop().into(imageView3);

        //image_4
        String imageUrl4 = "https://imgd.aeplcdn.com/664x374/n/cw/ec/116201/new-c-class-exterior-right-front-three-quarter-2.jpeg?isig=0&q=75";
        ImageView imageView4 = findViewById(R.id.merc4);
        Picasso.get().load(imageUrl4).fit().centerCrop().into(imageView4);

        //image_5
        String imageUrl5 = "https://imgd.aeplcdn.com/664x374/n/cw/ec/43718/glc-exterior-right-front-three-quarter-3.jpeg?q=75";
        ImageView imageView5 = findViewById(R.id.merc5);
        Picasso.get().load(imageUrl5).fit().centerCrop().into(imageView5);

        //image_6
        String imageUrl6 = "https://imgd.aeplcdn.com/664x374/n/cw/ec/94279/amg-gla35-exterior-right-front-three-quarter.jpeg?q=75";
        ImageView imageView6 = findViewById(R.id.merc6);
        Picasso.get().load(imageUrl6).fit().centerCrop().into(imageView6);

        //image_7
        String imageUrl7 = "https://imgd.aeplcdn.com/664x374/n/cw/ec/134297/glb-exterior-right-front-three-quarter-2.jpeg?isig=0&q=75";
        ImageView imageView7 = findViewById(R.id.merc7);
        Picasso.get().load(imageUrl7).fit().centerCrop().into(imageView7);

        //image_8
        String imageUrl8 = "https://imgd.aeplcdn.com/664x374/n/cw/ec/45477/mercedesbenz-glc-coupe-right-front-three-quarter1.jpeg?q=75";
        ImageView imageView8 = findViewById(R.id.merc8);
        Picasso.get().load(imageUrl8).fit().centerCrop().into(imageView8);

        //image_9
        String imageUrl9 = "https://imgd.aeplcdn.com/664x374/n/cw/ec/108055/exterior-right-front-three-quarter.jpeg?isig=0&q=75";
        ImageView imageView9 = findViewById(R.id.merc9);
        Picasso.get().load(imageUrl9).fit().centerCrop().into(imageView9);

        //image_10
        String imageUrl10 = "https://imgd.aeplcdn.com/664x374/n/cw/ec/47336/e-class-exterior-right-front-three-quarter.jpeg?q=75";
        ImageView imageView10 = findViewById(R.id.merc10);
        Picasso.get().load(imageUrl10).fit().centerCrop().into(imageView10);

        //image_11
        String imageUrl11 = "https://imgd.aeplcdn.com/664x374/n/cw/ec/149523/amg-a45-s-exterior-right-front-three-quarter-3.jpeg?isig=0&q=75";
        ImageView imageView11 = findViewById(R.id.merc11);
        Picasso.get().load(imageUrl11).fit().centerCrop().into(imageView11);

        //image_12
        String imageUrl12 = "https://imgd.aeplcdn.com/664x374/n/cw/ec/51673/mercedesbenz-amg-glc-43-coupe-right-front-three-quarter4.jpeg?wm=1&q=75";
        ImageView imageView12 = findViewById(R.id.merc12);
        Picasso.get().load(imageUrl12).fit().centerCrop().into(imageView12);

        //image_13
        String imageUrl13 = "https://imgd.aeplcdn.com/664x374/cw/ec/36137/MercedesBenz-GLE-New-Exterior-169843.jpg?wm=0&q=75";
        ImageView imageView13 = findViewById(R.id.merc13);
        Picasso.get().load(imageUrl13).fit().centerCrop().into(imageView13);

        //image_14
        String imageUrl14 = "https://imgd.aeplcdn.com/227x128/n/cw/ec/44579/eqc-exterior-right-front-three-quarter.jpeg?q=75";
        ImageView imageView14 = findViewById(R.id.merc14);
        Picasso.get().load(imageUrl14).fit().centerCrop().into(imageView14);

        //image_15
        String imageUrl15 = "https://imgd.aeplcdn.com/227x128/n/cw/ec/98397/amg-e53-exterior-right-front-three-quarter-2.jpeg?q=75";
        ImageView imageView15 = findViewById(R.id.merc15);
        Picasso.get().load(imageUrl15).fit().centerCrop().into(imageView15);

        //image_16
        String imageUrl16 = "https://imgd.aeplcdn.com/227x128/n/cw/ec/45390/gls-exterior-right-front-three-quarter-2.jpeg?q=75";
        ImageView imageView16 = findViewById(R.id.merc16);
        Picasso.get().load(imageUrl16).fit().centerCrop().into(imageView16);

        //image_17
        String imageUrl17 = "https://imgd.aeplcdn.com/227x128/n/cw/ec/137541/amg-e53-cabriolet-exterior-right-front-three-quarter-8.jpeg?isig=0&q=75";
        ImageView imageView17 = findViewById(R.id.merc17);
        Picasso.get().load(imageUrl17).fit().centerCrop().into(imageView17);

        //image_18
        String imageUrl18 = "https://imgd.aeplcdn.com/227x128/n/cw/ec/131249/eqs-580-4matic-exterior-right-front-three-quarter-2.jpeg?isig=0&q=75";
        ImageView imageView18 = findViewById(R.id.merc18);
        Picasso.get().load(imageUrl18).fit().centerCrop().into(imageView18);

        //image_19
        String imageUrl19 = "https://imgd.aeplcdn.com/227x128/n/cw/ec/48067/s-class-exterior-right-front-three-quarter-3.jpeg?q=75";
        ImageView imageView19 = findViewById(R.id.merc19);
        Picasso.get().load(imageUrl19).fit().centerCrop().into(imageView19);

        //image_20
        String imageUrl20 = "https://imgd.aeplcdn.com/227x128/n/cw/ec/51617/amg-gle-coupe-exterior-right-front-three-quarter-4.jpeg?isig=0&q=75";
        ImageView imageView20 = findViewById(R.id.merc20);
        Picasso.get().load(imageUrl20).fit().centerCrop().into(imageView20);

        //image_21
        String imageUrl21 = "https://imgd.aeplcdn.com/227x128/n/cw/ec/150621/g-class-exterior-right-front-three-quarter-2.jpeg?isig=0&q=75";
        ImageView imageView21 = findViewById(R.id.merc21);
        Picasso.get().load(imageUrl21).fit().centerCrop().into(imageView21);



        //image_23
        String imageUrl23 = "https://imgd.aeplcdn.com/227x128/n/cw/ec/58165/eqs-exterior-right-front-three-quarter.jpeg?isig=0&q=75";
        ImageView imageView23 = findViewById(R.id.merc23);
        Picasso.get().load(imageUrl23).fit().centerCrop().into(imageView23);

        //image_24
        String imageUrl24 = "https://imgd.aeplcdn.com/227x128/n/cw/ec/115149/maybach-s-class-exterior-right-front-three-quarter.jpeg?isig=0&q=75";
        ImageView imageView24 = findViewById(R.id.merc24);
        Picasso.get().load(imageUrl24).fit().centerCrop().into(imageView24);

        //image_25
        String imageUrl25 = "https://imgd.aeplcdn.com/227x128/n/cw/ec/45126/mercedesbenz-amg-gt-4-door-coupe-right-side0.jpeg?q=75";
        ImageView imageView25 = findViewById(R.id.merc25);
        Picasso.get().load(imageUrl25).fit().centerCrop().into(imageView25);

        mycardview1 = (CardView) findViewById(R.id.merc1_click);
        mycardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(merc.this, aclassli.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview2 = (CardView) findViewById(R.id.merc2_click);
        mycardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(merc.this, gla.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview3 = (CardView) findViewById(R.id.merc3_click);
        mycardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(merc.this, AMGa35.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview4 = (CardView) findViewById(R.id.merc4_click);
        mycardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(merc.this, Cclass.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview5 = (CardView) findViewById(R.id.merc5_click);
        mycardview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(merc.this, glc.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview6 = (CardView) findViewById(R.id.merc6_click);
        mycardview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(merc.this, amgGLA35.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview7 = (CardView) findViewById(R.id.merc7_click);
        mycardview7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(merc.this, Glb.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview8 = (CardView) findViewById(R.id.merc8_click);
        mycardview8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(merc.this, Glccoupe.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview9 = (CardView) findViewById(R.id.merc9_click);
        mycardview9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(merc.this, eqb.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        mycardview9 = (CardView) findViewById(R.id.merc10_click);
        mycardview9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(merc.this, eclass.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview10 = (CardView) findViewById(R.id.merc11_click);
        mycardview10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(merc.this, amgA45s.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview11 = (CardView) findViewById(R.id.merc12_click);
        mycardview11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(merc.this, amgGLC43.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview12 = (CardView) findViewById(R.id.merc13_click);
        mycardview12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(merc.this, gle.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview12 = (CardView) findViewById(R.id.merc14_click);
        mycardview12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(merc.this, EQC.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview12 = (CardView) findViewById(R.id.merc15_click);
        mycardview12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(merc.this, amg_e53.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview12 = (CardView) findViewById(R.id.merc16_click);
        mycardview12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(merc.this, gls.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview12 = (CardView) findViewById(R.id.merc17_click);
        mycardview12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(merc.this, amge53_cabriolet.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview12 = (CardView) findViewById(R.id.merc18_click);
        mycardview12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(merc.this, EQS.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview12 = (CardView) findViewById(R.id.merc19_click);
        mycardview12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(merc.this, sclass.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview12 = (CardView) findViewById(R.id.merc20_click);
        mycardview12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(merc.this, amggle53_coupe.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview12 = (CardView) findViewById(R.id.merc21_click);
        mycardview12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(merc.this, gclass.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview12 = (CardView) findViewById(R.id.merc23_click);
        mycardview12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(merc.this, AMGEQS.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview12 = (CardView) findViewById(R.id.merc24_click);
        mycardview12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(merc.this, mbsclass.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview12 = (CardView) findViewById(R.id.merc25_click);
        mycardview12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(merc.this, AMGGT63S.class);
                startActivity(intentLoadnewactivity1);
            }
        });

    }
}