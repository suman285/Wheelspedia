package com.example.wheelspedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class thar extends AppCompatActivity {
    ImageSlider imageSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thar);

        imageSlider = findViewById(R.id.alto800_slider);
        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel("https://stimg.cardekho.com/images/carexteriorimages/930x620/Mahindra/Thar/8076/1601635839903/front-left-side-47.jpg?imwidth=890&impolicy=resize", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://stimg.cardekho.com/images/carexteriorimages/930x620/Mahindra/Thar/8076/1601635839903/side-view-(left)-90.jpg?imwidth=890&impolicy=resize", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://stimg.cardekho.com/images/carexteriorimages/930x620/Mahindra/Thar/8076/1601635839903/rear-left-view-121.jpg?imwidth=890&impolicy=resize", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://stimg.cardekho.com/images/carexteriorimages/930x620/Mahindra/Thar/8076/1601635839903/front-view-118.jpg?imwidth=890&impolicy=resize", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://stimg.cardekho.com/images/carexteriorimages/930x620/Mahindra/Thar/8076/1601635839903/rear-view-119.jpg?imwidth=890&impolicy=resize", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://stimg.cardekho.com/images/carexteriorimages/930x620/Mahindra/Thar/8076/1601635839903/3d-model-163.jpg?imwidth=890&impolicy=resize", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://stimg.cardekho.com/images/carexteriorimages/930x620/Mahindra/Thar/8076/1601635839903/exterior-image-170.jpg?imwidth=890&impolicy=resize", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://stimg.cardekho.com/images/carexteriorimages/930x620/Mahindra/Thar/8076/1601635839903/exterior-image-179.jpg?imwidth=890&impolicy=resize", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://stimg.cardekho.com/images/carinteriorimages/930x620/Mahindra/Thar/8073/1609235771322/dashboard-59.jpg?imwidth=890&impolicy=resize", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://stimg.cardekho.com/images/carinteriorimages/930x620/Mahindra/Thar/8073/1609235771322/instrument-cluster-62.jpg?imwidth=890&impolicy=resize", ScaleTypes.FIT));

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

        String imageUrl6 ="https://stimg.cardekho.com/images/expert-review/mahindra-thar/1597651480791/221X147/Mahindra-Thar-0.jpg";
        ImageView imageView6 = findViewById(R.id.sof1);
        Picasso.get().load(imageUrl6).fit().centerCrop().into(imageView6);

        String imageUrl7 = "https://stimg.cardekho.com/images/expert-review/mahindra-thar/1597651572469/221X147/Mahindra-Thar-0.jpg";
        ImageView imageView7 = findViewById(R.id.sof2);
        Picasso.get().load(imageUrl7).fit().centerCrop().into(imageView7);

        String imageUrl8 = "https://stimg.cardekho.com/images/expert-review/mahindra-thar/1597651547070/221X147/Mahindra-Thar-0.jpg";
        ImageView imageView8 = findViewById(R.id.sof3);
        Picasso.get().load(imageUrl8).fit().centerCrop().into(imageView8);

    }
}