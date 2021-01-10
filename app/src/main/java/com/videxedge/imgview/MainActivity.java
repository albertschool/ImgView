package com.videxedge.imgview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView iV;
    int twoimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iV = (ImageView) findViewById(R.id.iV);

        twoimg = R.drawable.two;
    }

    public void showimg(View view) {
        iV.setImageResource(R.drawable.two);
    }
}