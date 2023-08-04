package com.example.wheelspedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class virtus extends AppCompatActivity {
    ImageSlider imageSlider;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_virtus);

        imageSlider = findViewById(R.id.alto800_slider);
        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel("https://stimg.cardekho.com/images/carexteriorimages/930x620/Volkswagen/Virtus/10624/1689938817194/front-left-side-47.jpg?imwidth=890&impolicy=resize", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://stimg.cardekho.com/images/carexteriorimages/930x620/Volkswagen/Virtus/10624/1689938817194/front-view-118.jpg?imwidth=890&impolicy=resize", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://stimg.cardekho.com/images/carexteriorimages/930x620/Volkswagen/Virtus/10624/1689938817194/exterior-image-164.jpg?imwidth=890&impolicy=resize", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://stimg.cardekho.com/images/carexteriorimages/930x620/Volkswagen/Virtus/10624/1689938817194/exterior-image-165.jpg?imwidth=890&impolicy=resize", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://stimg.cardekho.com/images/carexteriorimages/930x620/Volkswagen/Virtus/10624/1689938817194/exterior-image-167.jpg?imwidth=890&impolicy=resize", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://stimg.cardekho.com/images/carexteriorimages/930x620/Volkswagen/Virtus/10624/1689938817194/exterior-image-168.jpg?imwidth=890&impolicy=resize", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://stimg.cardekho.com/images/carexteriorimages/930x620/Volkswagen/Virtus/10624/1689938817194/exterior-image-169.jpg?imwidth=890&impolicy=resize", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://stimg.cardekho.com/images/carexteriorimages/930x620/Volkswagen/Virtus/10624/1689938817194/exterior-image-170.jpg?imwidth=890&impolicy=resize", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://stimg.cardekho.com/images/carinteriorimages/930x620/Volkswagen/Virtus/10265/1686304625646/dashboard-59.jpg?imwidth=890&impolicy=resize", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://stimg.cardekho.com/images/carinteriorimages/930x620/Volkswagen/Virtus/10265/1686304625646/steering-wheel-54.jpg?imwidth=890&impolicy=resize", ScaleTypes.FIT));
       imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        String imageUrl1 = "https://www.tyremarket.com/tyremantra/wp-content/uploads/2017/05/Engine-Warning-Light-1.jpg";
        ImageView imageView1 = findViewById(R.id.engine);
        Picasso.get().load(imageUrl1).fit().centerCrop().into(imageView1);

        String imageUrl2 = "https://png.pngtree.com/png-vector/20220617/ourmid/pngtree-lightning-logo-template-vector-icon-illustration-design-png-image_5118455.png";
        ImageView imageView2 = findViewById(R.id.bhp);
        Picasso.get().load(imageUrl2).fit().centerCrop().into(imageView2);

        String imageUrl3 = "https://cdn1.vectorstock.com/i/1000x1000/59/10/car-transmission-black-symbol-vector-30135910.jpg";
        ImageView imageView3 = findViewById(R.id.Transmission);
        Picasso.get().load(imageUrl3).fit().centerCrop().into(imageView3);

        String imageUrl4 = "https://hips.hearstapps.com/hmg-prod/images/car-chassis-isolated-on-white-with-clipping-path-royalty-free-image-1585328614.jpg";
        ImageView imageView4 = findViewById(R.id.Mileage);
        Picasso.get().load(imageUrl4).fit().centerCrop().into(imageView4);

        String imageUrl5 = "https://static.vecteezy.com/system/resources/thumbnails/007/820/631/small/fuel-icon-logo-design-template-vector.jpg";
        ImageView imageView5 = findViewById(R.id.Fuel);
        Picasso.get().load(imageUrl5).fit().centerCrop().into(imageView5);

        String imageUrl9 = "https://uxwing.com/wp-content/themes/uxwing/download/transportation-automotive/car-trunk-icon.png";
        ImageView imageView9 = findViewById(R.id.bootspace);
        Picasso.get().load(imageUrl9).fit().centerCrop().into(imageView9);

        String imageUrl6 ="https://stimg.cardekho.com/images/expert-review/volkswagen-virtus/1646913264115/221X147/Volkswagen-Virtus-0.jpg";
        ImageView imageView6 = findViewById(R.id.sof1);
        Picasso.get().load(imageUrl6).fit().centerCrop().into(imageView6);

        String imageUrl7 = "https://stimg.cardekho.com/images/expert-review/volkswagen-virtus/1646913412929/221X147/Volkswagen-Virtus-0.jpg";
        ImageView imageView7 = findViewById(R.id.sof2);
        Picasso.get().load(imageUrl7).fit().centerCrop().into(imageView7);

        String imageUrl8 = "https://stimg.cardekho.com/images/expert-review/volkswagen-virtus/1646913444465/221X147/Volkswagen-Virtus-0.jpg";
        ImageView imageView8 = findViewById(R.id.sof3);
        Picasso.get().load(imageUrl8).fit().centerCrop().into(imageView8);
    }
}