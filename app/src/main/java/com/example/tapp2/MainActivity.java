package com.example.tapp2;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private ImageButton reg;
    private ImageButton logIn;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //-----------ImageButton sing up -----------//
        reg = (ImageButton) findViewById(R.id.singin);
        reg.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       openShot2();
                                   }
                               }
        );

        //-----------ImageButton log in -----------//
        logIn = (ImageButton) findViewById(R.id.log_in);
        logIn.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         openShot3();
                                     }
                                 }
        );

    }

    //-----------Method open e-male registration -----------//
    public void openShot2() {
        Intent intent = new Intent(this, activity2.class);
        startActivity(intent);
    }

    //-----------Method open pict -----------//
    public void openShot3() {
        Intent intent = new Intent(this, RecyclerActivity_3.class);
        startActivity(intent);
    }

}


