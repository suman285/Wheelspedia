package com.example.wheelspedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class news1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news1);

        //news1 photo
        String imageUrl23 = "https://cdni.autocarindia.com/Utils/ImageResizer.ashx?n=https://cdni.autocarindia.com/ExtraImages/20230711015032_hyundai_exter_ncap.jpg&w=700&q=90&c=1";
        ImageView imageView23 = findViewById(R.id.news1);
        Picasso.get().load(imageUrl23).fit().centerCrop().into(imageView23);
    }
}