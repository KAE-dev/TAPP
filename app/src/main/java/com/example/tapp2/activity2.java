package com.example.tapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.r0adkll.slidr.Slidr;
import com.r0adkll.slidr.model.SlidrInterface;

public class activity2 extends AppCompatActivity {

    private SlidrInterface slidrInterface;

    private ImageButton vectorback;
    private ImageButton enter;

    private EditText name, password, emale;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);

        //-----------Swipe -----------//
        slidrInterface = Slidr.attach(this);


        //-----------ImageButton arrow -----------//
        vectorback = (ImageButton) findViewById(R.id.vector_back);
        vectorback.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View view) {
                                              openShot1();
                                          }
                                      }
        );


        //-----------EditText name -----------//
        name = findViewById(R.id.name);

        //-----------EditText name -----------//
        password = findViewById(R.id.password);

        //-----------EditText name -----------//
        emale = findViewById(R.id.emaletext);

        //-----------ImageButton "sing in" -----------//
        enter = (ImageButton) findViewById(R.id.ButtonSI);
        enter.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         final String Name = name.getText().toString();
                                         final String Password = password.getText().toString();
                                         final String Emale = emale.getText().toString();
                                         if (Name.isEmpty() || Password.isEmpty() || Emale.isEmpty()) {

                                             showMassageDialog("Fill all fields, IDIOT");
                                         }
                                         else {
                                             openShot3();
                                         }
                                     }
                                 }
        );


    }

    //-----------Method Toast -----------//
    private void showMassageDialog(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }

    //-----------Method Open activityMain -----------//
    public void openShot1() {
        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent1);
    }

    //-----------Method Button Open activity_recycler_3 -----------//
    public void openShot3() {
        Intent intent2 = new Intent(this, RecyclerActivity_3.class);
        startActivity(intent2);
    }


}



