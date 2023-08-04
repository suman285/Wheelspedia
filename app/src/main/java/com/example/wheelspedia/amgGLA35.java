package com.example.wheelspedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class amgGLA35 extends AppCompatActivity {
    ImageSlider imageSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amg_gla35);

        imageSlider = findViewById(R.id.alto800_slider);
        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel("https://stimg.cardekho.com/images/carexteriorimages/930x620/Mercedes-Benz/AMG-GLA-35/8567/1629869515694/front-left-side-47.jpg?imwidth=890&impolicy=resize", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://stimg.cardekho.com/images/carexteriorimages/930x620/Mercedes-Benz/AMG-GLA-35/8567/1629869515694/rear-left-view-121.jpg?imwidth=890&impolicy=resize", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://stimg.cardekho.com/images/carexteriorimages/930x620/Mercedes-Benz/AMG-GLA-35/8567/1629869515694/grille-97.jpg?imwidth=890&impolicy=resize", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://stimg.cardekho.com/images/carexteriorimages/930x620/Mercedes-Benz/AMG-GLA-35/8567/1629869515694/taillight-44.jpg?imwidth=890&impolicy=resize", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://stimg.cardekho.com/images/carinteriorimages/930x620/Mercedes-Benz/AMG-GLA-35/8567/1629869645463/dashboard-59.jpg?imwidth=890&impolicy=resize", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://stimg.cardekho.com/images/carinteriorimages/930x620/Mercedes-Benz/AMG-GLA-35/8567/1629869645463/steering-wheel-54.jpg?imwidth=890&impolicy=resize", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://stimg.cardekho.com/images/carinteriorimages/930x620/Mercedes-Benz/AMG-GLA-35/8567/1629869645463/door-view-of-driver-seat-51.jpg?imwidth=890&impolicy=resize", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://stimg.cardekho.com/images/carinteriorimages/930x620/Mercedes-Benz/AMG-GLA-35/8567/1629869645463/ambient-lighting-view-181.jpg?imwidth=890&impolicy=resize", ScaleTypes.FIT));


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

        String imageUrl4 = "https://media.istockphoto.com/id/1183169820/vector/speedometer-icon-vector-isolated-design-element-speed-indicator-sign-internet-speed-car.jpg?s=612x612&w=0&k=20&c=Mdcgwp43-5ZQZRmdwzn5-tw0oXq-T9yDJA7Y_Qhv8VI=";
        ImageView imageView4 = findViewById(R.id.Mileage);
        Picasso.get().load(imageUrl4).fit().centerCrop().into(imageView4);

        String imageUrl5 = "https://static.vecteezy.com/system/resources/thumbnails/007/820/631/small/fuel-icon-logo-design-template-vector.jpg";
        ImageView imageView5 = findViewById(R.id.Fuel);
        Picasso.get().load(imageUrl5).fit().centerCrop().into(imageView5);

        String imageUrl9 = "https://uxwing.com/wp-content/themes/uxwing/download/transportation-automotive/car-trunk-icon.png";
        ImageView imageView9 = findViewById(R.id.bootspace);
        Picasso.get().load(imageUrl9).fit().centerCrop().into(imageView9);


    }
}