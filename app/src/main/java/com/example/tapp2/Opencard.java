package com.example.tapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Opencard extends AppCompatActivity {

    ImageView card;
    int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opencard);


        card=findViewById(R.id.img_open);

        image=getIntent().getIntExtra("img", 0);
        card.setImageResource(image);
    }
}
