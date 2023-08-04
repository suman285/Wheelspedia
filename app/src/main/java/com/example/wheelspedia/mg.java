package com.example.wheelspedia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class mg extends AppCompatActivity {
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
        setContentView(R.layout.activity_mg);

        //image_1
        String imageUrl1 = "https://stimg.cardekho.com/images/carexteriorimages/630x420/MG/Comet-EV/9391/1682077644177/front-left-side-47.jpg?tr=w-456";
        ImageView imageView1 = findViewById(R.id.mg1);
        Picasso.get().load(imageUrl1).fit().centerCrop().into(imageView1);

        //image_2
        String imageUrl2 = "https://imgd.aeplcdn.com/227x128/n/cw/ec/51940/astor-exterior-right-front-three-quarter.jpeg?isig=0&q=75";
        ImageView imageView2 = findViewById(R.id.mg2);
        Picasso.get().load(imageUrl2).fit().centerCrop().into(imageView2);

        //image_3
        String imageUrl3 = "https://imgd.aeplcdn.com/227x128/n/cw/ec/130583/hector-facelift-exterior-right-front-three-quarter-3.jpeg?isig=0&q=75";
        ImageView imageView3 = findViewById(R.id.mg3);
        Picasso.get().load(imageUrl3).fit().centerCrop().into(imageView3);

        //image_4
        String imageUrl4 = "https://imgd.aeplcdn.com/227x128/n/cw/ec/139315/hector-plus-exterior-right-front-three-quarter.jpeg?isig=0&q=75";
        ImageView imageView4 = findViewById(R.id.mg4);
        Picasso.get().load(imageUrl4).fit().centerCrop().into(imageView4);

        //image_5
        String imageUrl5 = "https://imgd.aeplcdn.com/227x128/n/cw/ec/110437/zs-ev-facelift-exterior-right-front-three-quarter-3.jpeg?isig=0&q=75";
        ImageView imageView5 = findViewById(R.id.mg5);
        Picasso.get().load(imageUrl5).fit().centerCrop().into(imageView5);

        //image_6
        String imageUrl6 = "https://imgd.aeplcdn.com/227x128/n/cw/ec/129689/gloster-exterior-exhaust-pipes-2.jpeg?isig=0&q=75";
        ImageView imageView6 = findViewById(R.id.mg6);
        Picasso.get().load(imageUrl6).fit().centerCrop().into(imageView6);

        mycardview1 = (CardView) findViewById(R.id.mg2_click);
        mycardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(mg.this, astor.class);
                startActivity(intentLoadnewactivity1);
            }
        });
    }
}