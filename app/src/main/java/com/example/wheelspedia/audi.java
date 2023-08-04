package com.example.wheelspedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class audi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audi);

        //image_1
        String imageUrl1 = "https://imgd.aeplcdn.com/664x374/n/cw/ec/51909/a4-exterior-right-front-three-quarter-2.jpeg?q=75";
        ImageView imageView1 = findViewById(R.id.audi1);
        Picasso.get().load(imageUrl1).fit().centerCrop().into(imageView1);

        //image_2
        String imageUrl2 = "https://imgd.aeplcdn.com/664x374/n/cw/ec/28379/q3-exterior-right-front-three-quarter-93448.jpeg?isig=0&q=75";
        ImageView imageView2 = findViewById(R.id.audi2);
        Picasso.get().load(imageUrl2).fit().centerCrop().into(imageView2);

        //image_3
        String imageUrl3 = "https://imgd.aeplcdn.com/664x374/n/cw/ec/141373/q3-sportback-exterior-right-front-three-quarter.jpeg?isig=0&q=75";
        ImageView imageView3 = findViewById(R.id.audi3);
        Picasso.get().load(imageUrl3).fit().centerCrop().into(imageView3);

        //image_4
        String imageUrl4 = "https://imgd.aeplcdn.com/664x374/n/cw/ec/39472/a6-exterior-right-front-three-quarter.jpeg?q=75";
        ImageView imageView4 = findViewById(R.id.audi4);
        Picasso.get().load(imageUrl4).fit().centerCrop().into(imageView4);

        //image_5
        String imageUrl5 = "https://imgd.aeplcdn.com/664x374/n/cw/ec/53591/q5-facelift-exterior-right-front-three-quarter-3.jpeg?isig=0&q=75";
        ImageView imageView5 = findViewById(R.id.audi5);
        Picasso.get().load(imageUrl5).fit().centerCrop().into(imageView5);

        //image_6
        String imageUrl6 = "https://imgd.aeplcdn.com/664x374/n/cw/ec/51378/s5-sportback-exterior-right-front-three-quarter-5.jpeg?q=75";
        ImageView imageView6 = findViewById(R.id.audi6);
        Picasso.get().load(imageUrl6).fit().centerCrop().into(imageView6);

        //image_7
        String imageUrl7 = "https://imgd.aeplcdn.com/664x374/n/cw/ec/22803/audi-q7-facelift-right-front-three-quarter4.jpeg?q=75";
        ImageView imageView7 = findViewById(R.id.audi7);
        Picasso.get().load(imageUrl7).fit().centerCrop().into(imageView7);

        //image_8
        String imageUrl8 = "https://imgd.aeplcdn.com/664x374/n/cw/ec/39048/e-tron-exterior-right-front-three-quarter-2.jpeg?isig=0&q=75";
        ImageView imageView8 = findViewById(R.id.audi8);
        Picasso.get().load(imageUrl8).fit().centerCrop().into(imageView8);

        //image_9
        String imageUrl9 = "https://imgd.aeplcdn.com/664x374/n/cw/ec/34470/audi-q8-front-view4.jpeg?q=75";
        ImageView imageView9 = findViewById(R.id.audi9);
        Picasso.get().load(imageUrl9).fit().centerCrop().into(imageView9);

        //image_10
        String imageUrl10 = "https://imgd.aeplcdn.com/664x374/n/cw/ec/100073/rs5-exterior-right-front-three-quarter-2.jpeg?isig=0&q=75";
        ImageView imageView10 = findViewById(R.id.audi10);
        Picasso.get().load(imageUrl10).fit().centerCrop().into(imageView10);

        //image_11
        String imageUrl11 = "https://imgd.aeplcdn.com/664x374/n/cw/ec/39045/e-tron-sportback-exterior-right-front-three-quarter-2.jpeg?isig=0&q=75";
        ImageView imageView11 = findViewById(R.id.audi11);
        Picasso.get().load(imageUrl11).fit().centerCrop().into(imageView11);

        //image_12
        String imageUrl12 = "https://imgd.aeplcdn.com/664x374/n/cw/ec/124141/a8-l-2022-exterior-right-front-three-quarter-2.jpeg?isig=0&q=75";
        ImageView imageView12 = findViewById(R.id.audi12);
        Picasso.get().load(imageUrl12).fit().centerCrop().into(imageView12);

        //image_13
        String imageUrl13 = "https://imgd.aeplcdn.com/664x374/n/cw/ec/47073/e-tron-gt-exterior-right-front-three-quarter-2.jpeg?isig=0&q=75";
        ImageView imageView13 = findViewById(R.id.audi13);
        Picasso.get().load(imageUrl13).fit().centerCrop().into(imageView13);

        //image_14
        String imageUrl14 = "https://imgd.aeplcdn.com/664x374/n/cw/ec/49294/rs-q8-exterior-right-front-three-quarter-5.jpeg?q=75";
        ImageView imageView14 = findViewById(R.id.audi14);
        Picasso.get().load(imageUrl14).fit().centerCrop().into(imageView14);
    }
}