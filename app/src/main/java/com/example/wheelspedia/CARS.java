package com.example.wheelspedia;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class CARS extends AppCompatActivity {
    ImageButton myImagebutton3;
    ImageButton myImagebutton4;
    ImageButton myImagebutton5;
    ImageButton myImagebutton6;
    ImageButton myImagebutton7;
    ImageButton myImagebutton8;
    ImageButton myImagebutton9;
    ImageButton myImagebutton10;
    ImageButton myImagebutton11;
    ImageButton myImagebutton12;
    ImageButton myImagebutton13;
    ImageButton myImagebutton14;
    ImageButton myImagebutton15;
    ImageButton myImagebutton16;
    ImageButton myImagebutton17;
    ImageButton myImagebutton18;
    ImageButton myImagebutton19;
    ImageButton myImagebutton20;
    ImageButton myImagebutton21;
    ImageButton myImagebutton22;
    ImageButton myImagebutton23;
    ImageButton myImagebutton24;
    ImageButton myImagebutton25;
    ImageButton myImagebutton26;
    ImageButton myImagebutton27;
    ImageButton myImagebutton28;
    ImageButton myImagebutton29;
    ImageButton myImagebutton30;
    ImageButton myImagebutton31;
    ImageButton myImagebutton32;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cars);

        //image_1
        String imageUrl1 = "https://imgd.aeplcdn.com/0X0/n/cw/ec/10/brands/logos/maruti-suzuki1647009823420.jpg?v=1647009823707&q=75";
        ImageButton imageView1 = findViewById(R.id.suzukibutton);
        Picasso.get().load(imageUrl1).fit().into(imageView1);

        //image_2
        String imageUrl2 = "https://imgd.aeplcdn.com/0X0/n/cw/ec/8/brands/logos/hyundai.jpg?v=1629973193722&q=75";
        ImageButton imageView2 = findViewById(R.id.hyundaibutton);
        Picasso.get().load(imageUrl2).fit().into(imageView2);

        //image_3
        String imageUrl3 = "https://imgd.aeplcdn.com/0X0/n/cw/ec/16/brands/logos/tata.jpg?v=1629973276336&q=75";
        ImageButton imageView3 = findViewById(R.id.tatabutton);
        Picasso.get().load(imageUrl3).fit().into(imageView3);

        //image_4
        String imageUrl4 = "https://imgd.aeplcdn.com/0X0/n/cw/ec/9/brands/logos/mahindra.jpg?v=1629973668273&q=75";
        ImageButton imageView4 = findViewById(R.id.mahindrabutton);
        Picasso.get().load(imageUrl4).fit().into(imageView4);

        //image_5
        String imageUrl5 = "https://imgd.aeplcdn.com/0X0/n/cw/ec/70/brands/logos/kia.jpg?v=1630057189593&q=75";
        ImageButton imageView5 = findViewById(R.id.kiabutton);
        Picasso.get().load(imageUrl5).fit().into(imageView5);

        //image_6
        String imageUrl6 = "https://imgd.aeplcdn.com/0X0/n/cw/ec/43/brands/logos/jeep.jpg?v=1631163646486&q=75";
        ImageButton imageView6 = findViewById(R.id.jeepbutton);
        Picasso.get().load(imageUrl6).fit().into(imageView6);

        //image_7
        String imageUrl7 = "https://imgd.aeplcdn.com/0X0/n/cw/ec/11/brands/logos/mercedes-benz.jpg?v=1629973270530&q=75";
        ImageButton imageView7 = findViewById(R.id.mercbutton);
        Picasso.get().load(imageUrl7).fit().into(imageView7);

        //image_8
        String imageUrl8 = "https://imgd.aeplcdn.com/0X0/n/cw/ec/17/brands/logos/toyota.jpg?v=1630055705330&q=75";
        ImageButton imageView8 = findViewById(R.id.toyotabutton);
        Picasso.get().load(imageUrl8).fit().into(imageView8);

        //image_9
        String imageUrl9 = "https://imgd.aeplcdn.com/0X0/n/cw/ec/72/brands/logos/mg.jpg?v=1631163895654&q=75";
        ImageButton imageView9 = findViewById(R.id.mgbutton);
        Picasso.get().load(imageUrl9).fit().into(imageView9);

        //image_10
        String imageUrl10 = "https://imgd.aeplcdn.com/0X0/n/cw/ec/18/brands/logos/audi.jpg?v=1630055874070&q=75";
        ImageButton imageView10 = findViewById(R.id.audibutton);
        Picasso.get().load(imageUrl10).fit().into(imageView10);

        //image_11
        String imageUrl11 = "https://imgd.aeplcdn.com/0X0/n/cw/ec/1/brands/logos/bmw.jpg?v=1629973130013&q=75";
        ImageButton imageView11 = findViewById(R.id.bmwbutton);
        Picasso.get().load(imageUrl11).fit().into(imageView11);

        //image_12
        String imageUrl12 = "https://imgd.aeplcdn.com/0X0/n/cw/ec/20/brands/logos/volkswagen.jpg?v=1630056096439&q=75";
        ImageButton imageView12 = findViewById(R.id.vwbutton);
        Picasso.get().load(imageUrl12).fit().into(imageView12);

        //image_13
        String imageUrl13 = "https://imgd.aeplcdn.com/0X0/n/cw/ec/15/brands/logos/skoda1681982956420.jpg?v=1681982956529&q=75";
        ImageButton imageView13 = findViewById(R.id.skodabutton);
        Picasso.get().load(imageUrl13).fit().into(imageView13);

        //image_14
        String imageUrl14 = "https://imgd.aeplcdn.com/0X0/n/cw/ec/23/brands/logos/land-rover1647236056893.jpg?v=1647236057234&q=75";
        ImageButton imageView14 = findViewById(R.id.landroverbutton);
        Picasso.get().load(imageUrl14).fit().into(imageView14);

        //image_15
        String imageUrl15 = "https://imgd.aeplcdn.com/0X0/n/cw/ec/44/brands/logos/jaguar.jpg?v=1631163525508&q=75";
        ImageButton imageView15 = findViewById(R.id.jaguarbutton);
        Picasso.get().load(imageUrl15).fit().into(imageView15);

        //image_16
        String imageUrl16 = "https://imgd.aeplcdn.com/0X0/cw/brands/logos/mini.png?v=10&q=75";
        ImageButton imageView16 = findViewById(R.id.minibutton);
        Picasso.get().load(imageUrl16).fit().into(imageView16);


        //image_17
        String imageUrl17 = "https://imgd.aeplcdn.com/0X0/n/cw/ec/21/brands/logos/nissan.jpg?v=1631163973143&q=75";
        ImageButton imageView17 = findViewById(R.id.nissanbutton);
        Picasso.get().load(imageUrl17).fit().into(imageView17);

        //image_18
        String imageUrl18 = "https://imgd.aeplcdn.com/0X0/n/cw/ec/45/brands/logos/renault.jpg?v=1630057266767&q=75";
        ImageButton imageView18 = findViewById(R.id.reanultbutton);
        Picasso.get().load(imageUrl18).fit().into(imageView18);

        //image_19
        String imageUrl19 = "https://imgd.aeplcdn.com/0X0/n/cw/ec/74/brands/logos/citroen1649763818937.jpg?v=1649763819072&q=75";
        ImageButton imageView19 = findViewById(R.id.citroenbutton);
        Picasso.get().load(imageUrl19).fit().into(imageView19);

        //image_20
        String imageUrl20 = "https://imgd.aeplcdn.com/0X0/cw/brands/logos/lexus.png?v=10&q=75";
        ImageButton imageView20 = findViewById(R.id.lexusbutton);
        Picasso.get().load(imageUrl20).fit().into(imageView20);

        //image_21
        String imageUrl21 = "https://imgd.aeplcdn.com/0X0/n/cw/ec/37/brands/logos/volvo.jpg?v=1641478299001&q=75";
        ImageButton imageView21 = findViewById(R.id.volvobutton);
        Picasso.get().load(imageUrl21).fit().into(imageView21);

        //image_22
        String imageUrl22 = "https://imgd.aeplcdn.com/0X0/n/cw/ec/25/brands/logos/rolls-royce.jpg?v=1631164135042&q=75";
        ImageButton imageView22 = findViewById(R.id.rrbutton);
        Picasso.get().load(imageUrl22).fit().into(imageView22);

        //image_23
        String imageUrl23 = "https://imgd.aeplcdn.com/0X0/n/cw/ec/19/brands/logos/porsche.jpg?v=1631164048727&q=75";
        ImageButton imageView23 = findViewById(R.id.porschebutton);
        Picasso.get().load(imageUrl23).fit().into(imageView23);

        //image_24
        String imageUrl24 = "https://imgd.aeplcdn.com/0X0/n/cw/ec/30/brands/logos/lamborghini.jpg?v=1631163814246&q=75";
        ImageButton imageView24 = findViewById(R.id.lambobuttonn);
        Picasso.get().load(imageUrl24).fit().into(imageView24);

        //image_25
        String imageUrl25 = "https://imgd.aeplcdn.com/0X0/cw/brands/logos/isuzu.png?v=10&q=75";
        ImageButton imageView25 = findViewById(R.id.isuzubutton);
        Picasso.get().load(imageUrl25).fit().into(imageView25);

        //image_26
        String imageUrl26 = "https://imgd.aeplcdn.com/0X0/cw/brands/logos/aston-martin.png?v=10&q=75";
        ImageButton imageView26 = findViewById(R.id.astnmrtnbutton);
        Picasso.get().load(imageUrl26).fit().into(imageView26);

        //image_27
        String imageUrl27 = "https://imgd.aeplcdn.com/0X0/n/gph63sa_1483779.jpg?q=75";
        ImageButton imageView27 = findViewById(R.id.msrtbutton);
        Picasso.get().load(imageUrl27).fit().into(imageView27);

        //image_28
        String imageUrl28 = "https://imgd.aeplcdn.com/0X0/n/cw/ec/111/brands/logos/byd1650348943682.jpg?v=1650348943775&q=75";
        ImageButton imageView28 = findViewById(R.id.bydbutton);
        Picasso.get().load(imageUrl28).fit().into(imageView28);



        myImagebutton3 = (ImageButton) findViewById(R.id.suzukibutton);
        myImagebutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(CARS.this, suzuki.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        myImagebutton4 = (ImageButton) findViewById(R.id.hyundaibutton);
        myImagebutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(CARS.this, hyundai.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        myImagebutton5 = (ImageButton) findViewById(R.id.tatabutton);
        myImagebutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(CARS.this, tata.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        myImagebutton6 = (ImageButton) findViewById(R.id.mahindrabutton);
        myImagebutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(CARS.this, mahindra.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        myImagebutton7 = (ImageButton) findViewById(R.id.kiabutton);
        myImagebutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(CARS.this, kia.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        myImagebutton8 = (ImageButton) findViewById(R.id.jeepbutton);
        myImagebutton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(CARS.this, jeep.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        myImagebutton9 = (ImageButton) findViewById(R.id.mercbutton);
        myImagebutton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(CARS.this, merc.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        myImagebutton11 = (ImageButton) findViewById(R.id.mgbutton);
        myImagebutton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(CARS.this, mg.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        myImagebutton12 = (ImageButton) findViewById(R.id.audibutton);
        myImagebutton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(CARS.this, audi.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        myImagebutton13 = (ImageButton) findViewById(R.id.bmwbutton);
        myImagebutton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(CARS.this, bmw.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        myImagebutton14 = (ImageButton) findViewById(R.id.vwbutton);
        myImagebutton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(CARS.this, vw.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        myImagebutton15 = (ImageButton) findViewById(R.id.skodabutton);
        myImagebutton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(CARS.this, skoda.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        myImagebutton16 = (ImageButton) findViewById(R.id.landroverbutton);
        myImagebutton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(CARS.this, landrover.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        myImagebutton17 = (ImageButton) findViewById(R.id.jaguarbutton);
        myImagebutton17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(CARS.this, jaguar.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        myImagebutton18 = (ImageButton) findViewById(R.id.minibutton);
        myImagebutton18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(CARS.this, mini.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        myImagebutton19 = (ImageButton) findViewById(R.id.nissanbutton);
        myImagebutton19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(CARS.this, nissan.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        myImagebutton20 = (ImageButton) findViewById(R.id.reanultbutton);
        myImagebutton20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(CARS.this, renault.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        myImagebutton21 = (ImageButton) findViewById(R.id.citroenbutton);
        myImagebutton21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(CARS.this, citroen.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        myImagebutton22 = (ImageButton) findViewById(R.id.lexusbutton);
        myImagebutton22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(CARS.this, lexus.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        myImagebutton23 = (ImageButton) findViewById(R.id.volvobutton);
        myImagebutton23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(CARS.this, volvo.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        myImagebutton24 = (ImageButton) findViewById(R.id.rrbutton);
        myImagebutton24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(CARS.this, rr.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        myImagebutton25 = (ImageButton) findViewById(R.id.porschebutton);
        myImagebutton25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(CARS.this, porsche.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        myImagebutton26 = (ImageButton) findViewById(R.id.lambobuttonn);
        myImagebutton26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(CARS.this, lambo.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        myImagebutton27 = (ImageButton) findViewById(R.id.isuzubutton);
        myImagebutton27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(CARS.this, isuzu.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        myImagebutton28 = (ImageButton) findViewById(R.id.astnmrtnbutton);
        myImagebutton28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(CARS.this, astnmrtn.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        myImagebutton29 = (ImageButton) findViewById(R.id.msrtbutton);
        myImagebutton29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(CARS.this, msrt.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        myImagebutton30 = (ImageButton) findViewById(R.id.bydbutton);
        myImagebutton30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(CARS.this, byd.class);
                startActivity(intentLoadnewactivity1);
            }
        });


        myImagebutton10 = (ImageButton) findViewById(R.id.toyotabutton);
        myImagebutton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(CARS.this, Toyota.class);
                startActivity(intentLoadnewactivity1);
            }
        });
    }

}