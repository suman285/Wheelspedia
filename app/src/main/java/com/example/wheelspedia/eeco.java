package com.example.wheelspedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class eeco extends AppCompatActivity {
    ImageSlider imageSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eeco);

        imageSlider = findViewById(R.id.alto800_slider);
        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel("https://stimg.cardekho.com/images/carexteriorimages/360x240/Maruti/Maruti-Eeco/1556194449915/047.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://images.91wheels.com//assets/c_images/gallery/maruti/eeco/maruti-eeco-10-1598098247.jpg?width=420&q=60?w=1080&q=60", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://cdni.autocarindia.com/Utils/ImageResizer.ashx?n=https://cdni.autocarindia.com/Galleries/20190401123002_EE_Int4.jpg&w=772&h=511&q=75&c=1", ScaleTypes.FIT));
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

        String imageUrl6 ="https://stimg.cardekho.com/images/expert-review/maruti-eeco/1687776954342/221X147/Maruti-Eeco-0.jpg";
        ImageView imageView6 = findViewById(R.id.sof1);
        Picasso.get().load(imageUrl6).fit().centerCrop().into(imageView6);

        String imageUrl7 = "https://stimg.cardekho.com/images/expert-review/maruti-eeco/1687777041876/221X147/Maruti-Eeco-0.jpg";
        ImageView imageView7 = findViewById(R.id.sof2);
        Picasso.get().load(imageUrl7).fit().centerCrop().into(imageView7);

        String imageUrl8 = "https://stimg.cardekho.com/images/expert-review/maruti-eeco/1687777067565/221X147/Maruti-Eeco-0.jpg";
        ImageView imageView8 = findViewById(R.id.sof3);
        Picasso.get().load(imageUrl8).fit().centerCrop().into(imageView8);
    }
}