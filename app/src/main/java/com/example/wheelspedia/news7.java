package com.example.wheelspedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class news7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news7);

        String imageUrl26 = "https://etimg.etb2bimg.com/thumb/msid-92233950,imgsize-111292,width-1200,height=765,overlay-etauto/lamborghini-showcases-aventador-lp-780-4-ultimae-roadster-in-india.jpg";
        ImageView imageView26 = findViewById(R.id.news7);
        Picasso.get().load(imageUrl26).fit().centerCrop().into(imageView26);
    }
}