package com.example.wheelspedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class news4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news4);

        //news4 photo
        String imageUrl26 = "https://www.hyundai.com/content/dam/hyundai/ww/en/images/find-a-car/pip/eco/ioniq5/full-pages/highlights/ioniq5-ne-highlight-kv-m.jpg";
        ImageView imageView26 = findViewById(R.id.news4);
        Picasso.get().load(imageUrl26).fit().centerCrop().into(imageView26);

    }
}