package com.example.fade;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import javax.xml.datatype.Duration;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    @SuppressLint({"UseCompatLoadingForDrawables", "ShowToast"})

    public void fade(final View view){



       /* String status=imageView.getDrawable().toString();
        String loc=getResources().getDrawable(R.drawable.image1).toString();
        Toast.makeText(getApplicationContext(),loc, Toast.LENGTH_SHORT ).show();*/

        imageView.animate().translationX(1000).alpha(0).setDuration(0);
        //imageView.animate().translationX(1000);  // moved to full-left
        imageView.setImageResource(R.drawable.image2);
        imageView.animate().translationX(0).setDuration(1000);     // move back to location
        
        //imageView.setImageDrawable(getResources().getDrawable(R.drawable.image2));


//        if(imageView.getDrawable()==getResources().getDrawable(R.drawable.image1)) {
//
//            imageView.setImageDrawable(getResources().getDrawable(R.drawable.image2));
//            imageView.animate().alpha(1).setDuration(2000);
//            imageView.animate().translationX(1000);
//        }  else{
//            imageView.animate().translationX(1000);
//            imageView.animate().alpha(0).setDuration(2000);
//            imageView.setImageDrawable(getResources().getDrawable(R.drawable.image1));


    }

    @SuppressLint("ShowToast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.imageView);

    }
}