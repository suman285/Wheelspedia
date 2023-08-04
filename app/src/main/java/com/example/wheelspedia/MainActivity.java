package com.example.wheelspedia;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.squareup.picasso.Picasso;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


import java.util.ArrayList;
import java.util.List;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageButton myImagebutton1;
    ImageButton myImagebutton2;
    ImageButton myImagebutton3;
    ImageButton myImagebutton4;
    ImageButton myImagebutton5;
    ImageButton myImagebutton6;
    TextView myTextview6;
    CardView mycardview1;
    CardView mycardview2;
    CardView mycardview3;
    CardView mycardview4;
    CardView mycardview5;
    LinearLayout myll7;
    LinearLayout myll8;
    TextView myt1;
    private ImageSlider imageSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String imageUrl1 = "https://logo.com/image-cdn/images/kts928pd/production/e5574a303c09c8853b5e0304a71dbac032c6e5b0-336x316.png?w=1080&q=72";
        ImageButton imageView1 = findViewById(R.id.carbutton);
        Picasso.get().load(imageUrl1).fit().centerCrop().into(imageView1);

        String imageUrl2 = "https://www.shutterstock.com/shutterstock/photos/786832597/display_1500/stock-vector-vector-of-car-car-news-logo-symbol-or-icon-786832597.jpg";
        ImageButton imageView2 = findViewById(R.id.newsbutton);
        Picasso.get().load(imageUrl2).fit().centerCrop().into(imageView2);

        //just launched_1 photo
        String imageUrl3 = "https://cdni.autocarindia.com/utils/imageresizer.ashx?n=https://cms.haymarketindia.net/model/uploads/modelimages/Maruti-Suzuki-Invicto-130620231808.jpg";
        ImageView imageView3 = findViewById(R.id.justlaunched_1);
        Picasso.get().load(imageUrl3).fit().centerCrop().into(imageView3);

        //just launched_2 photo
        String imageUrl4 = "https://stimg.cardekho.com/images/carexteriorimages/930x620/Skoda/Kushaq/9815/1681724041593/front-left-side-47.jpg";
        ImageView imageView4 = findViewById(R.id.justlaunched_2);
        Picasso.get().load(imageUrl4).fit().centerCrop().into(imageView4);

        //just launched_3 photo
        String imageUrl5 = "https://imgd.aeplcdn.com/0x0/n/cw/ec/101055/virtus-exterior-right-front-three-quarter.jpeg?isig=0";
        ImageView imageView5 = findViewById(R.id.justlaunched_3);
        Picasso.get().load(imageUrl5).fit().centerCrop().into(imageView5);

        //just launched_4 photo
        String imageUrl6 = "https://www.topgear.com/sites/default/files/2021/10/2021-07-14_Image_21C0502-001.jpg";
        ImageView imageView6 = findViewById(R.id.justlaunched_4);
        Picasso.get().load(imageUrl6).fit().centerCrop().into(imageView6);

        //upcoming_1 photo
        String imageUrl7 = "https://imgd.aeplcdn.com/664x374/n/cw/ec/144851/exter-exterior-right-front-three-quarter-4.jpeg?isig=0&q=75";
        ImageView imageView7 = findViewById(R.id.upcoming_1);
        Picasso.get().load(imageUrl7).fit().centerCrop().into(imageView7);

        //upcoming_2 photo
        String imageUrl8 = "https://imgd.aeplcdn.com/664x374/n/cw/ec/150611/c40-recharge-exterior-left-front-three-quarter.jpeg?isig=0&q=75";
        ImageView imageView8 = findViewById(R.id.upcoming_2);
        Picasso.get().load(imageUrl8).fit().centerCrop().into(imageView8);

        //upcoming_3 photo
        String imageUrl9 = "https://imgd.aeplcdn.com/664x374/n/cw/ec/135051/seltos-facelift-exterior-front-view.jpeg?isig=0&q=75";
        ImageView imageView9 = findViewById(R.id.upcoming_3);
        Picasso.get().load(imageUrl9).fit().centerCrop().into(imageView9);

        //upcoming_4 photo
        String imageUrl10 = "https://imgd.aeplcdn.com/664x374/n/cw/ec/138947/new-carnival-exterior-right-front-three-quarter.jpeg?isig=0&q=75";
        ImageView imageView10 = findViewById(R.id.upcoming_4);
        Picasso.get().load(imageUrl10).fit().centerCrop().into(imageView10);

        //upcoming_5 photo
        String imageUrl11 = "https://imgd.aeplcdn.com/664x374/n/cw/ec/150705/2023-glc-exterior-right-front-three-quarter-6.jpeg?isig=0&q=75";
        ImageView imageView11 = findViewById(R.id.upcoming_5);
        Picasso.get().load(imageUrl11).fit().centerCrop().into(imageView11);

        //upcoming_6 photo
        String imageUrl12 = "https://imgd.aeplcdn.com/664x374/n/cw/ec/142515/elevate-exterior-left-front-three-quarter-4.jpeg?isig=0&q=75";
        ImageView imageView12 = findViewById(R.id.upcoming_6);
        Picasso.get().load(imageUrl12).fit().centerCrop().into(imageView12);

        //upcoming_7 photo
        String imageUrl13 = "https://imgd.aeplcdn.com/664x374/n/cw/ec/133165/x-trail-exterior-right-front-three-quarter-5.jpeg?isig=0&q=75";
        ImageView imageView13 = findViewById(R.id.upcoming_7);
        Picasso.get().load(imageUrl13).fit().centerCrop().into(imageView13);

        //upcoming_8 photo
        String imageUrl14 = "https://static.toiimg.com/photo/msid-95077747/95077747.jpg";
        ImageView imageView14 = findViewById(R.id.upcoming_8);
        Picasso.get().load(imageUrl14).fit().centerCrop().into(imageView14);

        //popular_1 photo
        String imageUrl15 = "https://stimg.cardekho.com/images/carexteriorimages/930x620/Maruti/FRONX/9243/1673943130006/front-left-side-47.jpg";
        ImageView imageView15 = findViewById(R.id.popular_1);
        Picasso.get().load(imageUrl15).fit().centerCrop().into(imageView15);

        //popular_2 photo
        String imageUrl16 = "https://images.hindustantimes.com/auto/img/2022/09/03/1600x900/Scorpio_Classic_12_1662182794054_1662191658873_1662191658873.jpeg";
        ImageView imageView16 = findViewById(R.id.popular_2);
        Picasso.get().load(imageUrl16).fit().centerCrop().into(imageView16);

        //popular_3 photo
        String imageUrl17 = "https://cdni.autocarindia.com/Utils/ImageResizer.ashx?n=https://cdni.autocarindia.com/ExtraImages/20220630083818_Scorpio_1.jpg";
        ImageView imageView17 = findViewById(R.id.popular_3);
        Picasso.get().load(imageUrl17).fit().centerCrop().into(imageView17);

        //popular_4 photo
        String imageUrl18 = "https://imgd.aeplcdn.com/0x0/n/cw/ec/40087/thar-exterior-right-front-three-quarter-32.jpeg";
        ImageView imageView18 = findViewById(R.id.popular_4);
        Picasso.get().load(imageUrl18).fit().centerCrop().into(imageView18);

        //popular_5 photo
        String imageUrl19 = "https://cdni.autocarindia.com/ExtraImages/20230112034637_Harrier_front.jpg";
        ImageView imageView19 = findViewById(R.id.popular_5);
        Picasso.get().load(imageUrl19).fit().centerCrop().into(imageView19);

        //popular_6 photo
        String imageUrl20 = "https://nexaprod6.azureedge.net/-/media/feature/nexawebsitecarbrand/baleno/banner/articwhite.webp?modified=20220412044410";
        ImageView imageView20 = findViewById(R.id.popular_6);
        Picasso.get().load(imageUrl20).fit().centerCrop().into(imageView20);

        //popular_7 photo
        String imageUrl21 = "https://imgd.aeplcdn.com/664x374/n/cw/ec/41645/tata-nexon-right-front-three-quarter3.jpeg?q=75";
        ImageView imageView21 = findViewById(R.id.popular_7);
        Picasso.get().load(imageUrl21).fit().centerCrop().into(imageView21);

        //popular_8 photo
        String imageUrl22 = "https://imgd-ct.aeplcdn.com/664x415/n/cw/ec/42355/xuv700-exterior-front-view-2.jpeg?isig=0&q=75";
        ImageView imageView22 = findViewById(R.id.popular_8);
        Picasso.get().load(imageUrl22).fit().centerCrop().into(imageView22);

        //news1 photo
        String imageUrl23 = "https://cdni.autocarindia.com/Utils/ImageResizer.ashx?n=https://cdni.autocarindia.com/ExtraImages/20230711015032_hyundai_exter_ncap.jpg&w=700&q=90&c=1";
        ImageView imageView23 = findViewById(R.id.news1);
        Picasso.get().load(imageUrl23).fit().centerCrop().into(imageView23);

        //news2 photo
        String imageUrl24 = "https://cdn.vox-cdn.com/thumbor/mTGZ9Yaa9SIzrXlYgeGZjHkNyJ0=/0x0:4661x3122/1400x1400/filters:focal(2331x1561:2332x1562)/cdn.vox-cdn.com/uploads/chorus_asset/file/19352562/1170373908.jpg.jpg";
        ImageView imageView24 = findViewById(R.id.news2);
        Picasso.get().load(imageUrl24).fit().centerCrop().into(imageView24);

        //news3 photo
        String imageUrl25 = "https://cdni.autocarindia.com/utils/imageresizer.ashx?n=http://img.haymarketsac.in/autocarpro/68004b0e-8b8f-46ec-8c70-59e79e77b911_new-maruti-collage-for-auto-expo.jpg";
        ImageView imageView25 = findViewById(R.id.news3);
        Picasso.get().load(imageUrl25).fit().centerCrop().into(imageView25);

        //news4 photo
        String imageUrl26 = "https://www.hyundai.com/content/dam/hyundai/ww/en/images/find-a-car/pip/eco/ioniq5/full-pages/highlights/ioniq5-ne-highlight-kv-m.jpg";
        ImageView imageView26 = findViewById(R.id.news4);
        Picasso.get().load(imageUrl26).fit().centerCrop().into(imageView26);

        //news5 photo
        String imageUrl27 = "https://images.hindustantimes.com/auto/img/2022/03/20/1600x900/BMW_X5_xDrive_SPortX_Plus_1631527933460_1647776517858.jpg";
        ImageView imageView27 = findViewById(R.id.news5);
        Picasso.get().load(imageUrl27).fit().centerCrop().into(imageView27);








        imageSlider = findViewById(R.id.image_slider);
        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel("https://prog-ace-cdn.azureedge.net/-/media/project/mahindra/dotcom/mahindra/dark-theme-mahindra-images/thar_optimized/desktop/brand-page-banner-desktop_1920x829---copy-new.jpg?rev=7074046a9b124c33853be61e3ce52021&extension=webp", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://d308ljkq6e62o1.cloudfront.net/img/P2Hp70gkQamg01K8SXUU5A/raw/file.jfif", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://i0.wp.com/www.smartprix.com/bytes/wp-content/uploads/2022/06/mahindra-N.png?fit=1200%2C675&ssl=1", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://imgd.aeplcdn.com/0x0/n/xi8eova_1609361.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://www.financialexpress.com/wp-content/uploads/2022/10/Porsche-911-Carrera-T-price.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://www.bmw.in/content/dam/bmw/common/all-models/7-series/sedan/2022/highlights/bmw-7-series-sedan-gallery-design-01-1920.jpg.asset.1647969152556.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://imgd.aeplcdn.com/664x374/n/cw/ec/137767/fortuner-legender-exterior-right-front-three-quarter-4.png?isig=0&q=75&q=75", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://imgd.aeplcdn.com/664x374/n/cw/ec/53859/urus-performante-exterior-right-front-three-quarter-3.jpeg?isig=0&q=75&q=75", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://cars.tatamotors.com/images/safari/safari-adas-overview-m-banner.png", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://www.team-bhp.com/sites/default/files/pictures2023/2023-verna-showroom-1.jpeg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://imgd-ct.aeplcdn.com/664x415/n/cw/ec/94931/q7-right-front-three-quarter.jpeg?isig=0&q=75", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://stimg.cardekho.com/images/carexteriorimages/630x420/Mahindra/Scorpio-Classic/10764/1690268502010/front-left-side-47.jpg?imwidth=420&impolicy=resize", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://imgd-ct.aeplcdn.com/664x415/n/cw/ec/54399/swift-exterior-left-front-three-quarter.jpeg?q=75", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://static.toiimg.com/thumb/msid-79662831,width-1280,height-720,resizemode-4/.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://stimg.cardekho.com/images/carexteriorimages/930x620/Mercedes-Benz/AMG-G-63/9737/1679289361128/front-left-side-47.jpg", ScaleTypes.FIT));
        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        myImagebutton1 = (ImageButton) findViewById(R.id.carbutton);
        myImagebutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(MainActivity.this, CARS.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        myImagebutton2 = (ImageButton) findViewById(R.id.nav_carbutton_home);
        myImagebutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(MainActivity.this, CARS.class);
                startActivity(intentLoadnewactivity1);
            }
        });


        myImagebutton4 = (ImageButton) findViewById(R.id.newsbutton);
        myImagebutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(MainActivity.this, News.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        myImagebutton5 = (ImageButton) findViewById(R.id.nav_newsbutton_home);
        myImagebutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(MainActivity.this, News.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        myTextview6 = (TextView) findViewById(R.id.morenews);
        myTextview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(MainActivity.this, News.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        mycardview1 = (CardView) findViewById(R.id.home_news1);
        mycardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(MainActivity.this, news1.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview2 = (CardView) findViewById(R.id.home_news2);
        mycardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(MainActivity.this, news2.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview3 = (CardView) findViewById(R.id.home_news3);
        mycardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(MainActivity.this, news3.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview4 = (CardView) findViewById(R.id.home_news4);
        mycardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(MainActivity.this, news4.class);
                startActivity(intentLoadnewactivity1);
            }
        });

        mycardview5 = (CardView) findViewById(R.id.home_news5);
        mycardview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(MainActivity.this, news5.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        myImagebutton6 = (ImageButton) findViewById(R.id.home_emical);
        myImagebutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(MainActivity.this, emicalculator.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        myll7 = (LinearLayout) findViewById(R.id.h_p1);
        myll7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(MainActivity.this, fronx.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        myll7 = (LinearLayout) findViewById(R.id.h_p2);
        myll7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(MainActivity.this, scorpio.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        myll7 = (LinearLayout) findViewById(R.id.h_p3);
        myll7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(MainActivity.this, scorpioN.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        myll7 = (LinearLayout) findViewById(R.id.h_p4);
        myll7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(MainActivity.this, thar.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        myll7 = (LinearLayout) findViewById(R.id.h_p5);
        myll7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(MainActivity.this, harrier.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        myll8 = (LinearLayout) findViewById(R.id.h_p6);
        myll8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(MainActivity.this, baleno.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        myll8 = (LinearLayout) findViewById(R.id.h_p7);
        myll8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(MainActivity.this, nexon.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        myll8 = (LinearLayout) findViewById(R.id.h_p8);
        myll8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(MainActivity.this, xuv700.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        myll8 = (LinearLayout) findViewById(R.id.jl1);
        myll8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(MainActivity.this, invicto.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        myll8 = (LinearLayout) findViewById(R.id.jl2);
        myll8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(MainActivity.this, kushaq.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        myll8 = (LinearLayout) findViewById(R.id.jl3);
        myll8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(MainActivity.this, virtus.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        myll8 = (LinearLayout) findViewById(R.id.jl4);
        myll8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(MainActivity.this, AMGSL.class);
                startActivity(intentLoadnewactivity1);
            }
        });
        myt1 = (TextView) findViewById(R.id.h_p_more);
        myt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadnewactivity1= new Intent(MainActivity.this, CARS.class);
                startActivity(intentLoadnewactivity1);
            }
        });
    }


    @Override
    public void onBackPressed() {

        new AlertDialog.Builder(this)
                .setMessage("Are you sure want to exit?")
                .setCancelable(false)
                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }


}