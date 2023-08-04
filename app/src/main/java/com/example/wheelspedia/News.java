package com.example.wheelspedia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class News extends AppCompatActivity {
    CardView mycardview1,mycardview2,mycardview3,mycardview4,mycardview5,mycardview6,mycardview7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        //news1 photo
        String imageUrl1 = "https://cdni.autocarindia.com/Utils/ImageResizer.ashx?n=https://cdni.autocarindia.com/ExtraImages/20230711015032_hyundai_exter_ncap.jpg&w=700&q=90&c=1";
        ImageView imageView1 = findViewById(R.id.news1);
        Picasso.get().load(imageUrl1).fit().centerCrop().into(imageView1);

        //news2 photo
        String imageUrl2 = "https://cdn.vox-cdn.com/thumbor/mTGZ9Yaa9SIzrXlYgeGZjHkNyJ0=/0x0:4661x3122/1400x1400/filters:focal(2331x1561:2332x1562)/cdn.vox-cdn.com/uploads/chorus_asset/file/19352562/1170373908.jpg.jpg";
        ImageView imageView2 = findViewById(R.id.news2);
        Picasso.get().load(imageUrl2).fit().centerCrop().into(imageView2);

        //news3 photo
        String imageUrl3 = "https://cdni.autocarindia.com/utils/imageresizer.ashx?n=http://img.haymarketsac.in/autocarpro/68004b0e-8b8f-46ec-8c70-59e79e77b911_new-maruti-collage-for-auto-expo.jpg";
        ImageView imageView3 = findViewById(R.id.news3);
        Picasso.get().load(imageUrl3).fit().centerCrop().into(imageView3);

        //news4 photo
        String imageUrl4 = "https://www.hyundai.com/content/dam/hyundai/ww/en/images/find-a-car/pip/eco/ioniq5/full-pages/highlights/ioniq5-ne-highlight-kv-m.jpg";
        ImageView imageView4 = findViewById(R.id.news4);
        Picasso.get().load(imageUrl4).fit().centerCrop().into(imageView4);

        //news5 photo
        String imageUrl5 = "https://images.hindustantimes.com/auto/img/2022/03/20/1600x900/BMW_X5_xDrive_SPortX_Plus_1631527933460_1647776517858.jpg";
        ImageView imageView5 = findViewById(R.id.news5);
        Picasso.get().load(imageUrl5).fit().centerCrop().into(imageView5);

        //news6 photo
        String imageUrl6 = "https://etimg.etb2bimg.com/photo/75327681.cms";
        ImageView imageView6 = findViewById(R.id.news6);
        Picasso.get().load(imageUrl6).fit().centerCrop().into(imageView6);

        //news7 photo
        String imageUrl7 = "https://etimg.etb2bimg.com/thumb/msid-92233950,imgsize-111292,width-1200,height=765,overlay-etauto/lamborghini-showcases-aventador-lp-780-4-ultimae-roadster-in-india.jpg";
        ImageView imageView7 = findViewById(R.id.news7);
        Picasso.get().load(imageUrl7).fit().centerCrop().into(imageView7);

        mycardview1 = (CardView) findViewById(R.id.autonews1);
        mycardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(News.this, news1.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview2 = (CardView) findViewById(R.id.autonews2);
        mycardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(News.this, news2.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview3 = (CardView) findViewById(R.id.autonews3);
        mycardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(News.this, news3.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview4 = (CardView) findViewById(R.id.autonews4);
        mycardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(News.this, news4.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview5 = (CardView) findViewById(R.id.autonews5);
        mycardview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(News.this, news5.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview6 = (CardView) findViewById(R.id.autonews6);
        mycardview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(News.this, news6.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview7 = (CardView) findViewById(R.id.autonews7);
        mycardview7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(News.this, news7.class);
                startActivity(intentLoadnewactivity1);
            }
        });
    }
}