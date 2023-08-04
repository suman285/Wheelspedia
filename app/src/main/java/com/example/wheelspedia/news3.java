package com.example.wheelspedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class news3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news3);

        //news3 photo
        String imageUrl25 = "https://cdni.autocarindia.com/utils/imageresizer.ashx?n=http://img.haymarketsac.in/autocarpro/68004b0e-8b8f-46ec-8c70-59e79e77b911_new-maruti-collage-for-auto-expo.jpg";
        ImageView imageView25 = findViewById(R.id.news3);
        Picasso.get().load(imageUrl25).fit().centerCrop().into(imageView25);
    }
}