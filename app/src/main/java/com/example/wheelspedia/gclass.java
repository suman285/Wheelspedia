package com.example.wheelspedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class gclass extends AppCompatActivity {
    ImageSlider imageSlider;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gclass);

        imageSlider = findViewById(R.id.alto800_slider);
        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel("https://stimg.cardekho.com/images/carexteriorimages/930x620/Mercedes-Benz/G-Class/10258/1686226969224/exterior-image-166.jpg?imwidth=890&impolicy=resize", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://stimg.cardekho.com/images/carexteriorimages/930x620/Mercedes-Benz/G-Class/10258/1686226969224/rear-right-side-48.jpg?imwidth=890&impolicy=resize", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://stimg.cardekho.com/images/carinteriorimages/930x620/Mercedes-Benz/G-Class/10258/1686226905449/ac-controls-151.jpg?imwidth=890&impolicy=resize", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://stimg.cardekho.com/images/carinteriorimages/930x620/Mercedes-Benz/G-Class/10258/1686226905449/infotainment-system-main-menu-183.jpg?imwidth=890&impolicy=resize", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://static.autox.com/uploads/2020/03/19C0473-055-500x261.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://hips.hearstapps.com/hmg-prod/images/18c0089-025-source-1525445272.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://www.v3cars.com/media/model-imgs/1625573172-Mercedes-G-Class.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://media.ed.edmunds-media.com/mercedes-benz/g-class/2023/oem/2023_mercedes-benz_g-class_4dr-suv_amg-g-63_fq_oem_10_600.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://cdni.autocarindia.com/Utils/ImageResizer.ashx?n=https://cdni.autocarindia.com/ExtraImages/20171213045247_Merc-G-class-side-1.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://www.topgear.com/sites/default/files/2022/01/8-Mercedes-G-Class.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRVAXeMpLiezYuZJUChvSnqUouWI0s0AvKEwAPFztAe0m_gYXmhn00F6WOJPRX0K8wawzg&usqp=CAU", ScaleTypes.FIT));


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