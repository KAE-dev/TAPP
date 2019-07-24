package com.example.tapp2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.annotation.TargetApi;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity_3 extends AppCompatActivity {

   View mView;

    private FloatingActionButton floatingActionButton;

    private RecyclerView staggeredRv;
    private StaggeredRecyclerAdapter adapter;
    private StaggeredGridLayoutManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_3);



        //--------------FloatingButton----------//
        floatingActionButton = (FloatingActionButton) findViewById(R.id.floatingActionButton2);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View view) {
                                                        openShot5();
                                                    }
                                                }
        );


        staggeredRv = findViewById(R.id.staggered_rv);
        manager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        staggeredRv.setLayoutManager(manager);
        // ------ array list of images-------//
        List<row> lst = new ArrayList<>();
        lst.add(new row(R.drawable.i1));
        lst.add(new row(R.drawable.i2));
        lst.add(new row(R.drawable.i3));
        lst.add(new row(R.drawable.i4));
        lst.add(new row(R.drawable.i5));
        lst.add(new row(R.drawable.i6));
        lst.add(new row(R.drawable.i7));
        lst.add(new row(R.drawable.i8));
        lst.add(new row(R.drawable.i9));
        lst.add(new row(R.drawable.i10));
        lst.add(new row(R.drawable.i11));
        lst.add(new row(R.drawable.i12));
        lst.add(new row(R.drawable.i4));
        lst.add(new row(R.drawable.i11));
        lst.add(new row(R.drawable.i13));
        lst.add(new row(R.drawable.i14));
        lst.add(new row(R.drawable.i15));
        lst.add(new row(R.drawable.i12));
        lst.add(new row(R.drawable.i4));
        lst.add(new row(R.drawable.i11));
        lst.add(new row(R.drawable.i13));
        lst.add(new row(R.drawable.i1));
        lst.add(new row(R.drawable.i2));
        lst.add(new row(R.drawable.i3));
        lst.add(new row(R.drawable.i4));
        lst.add(new row(R.drawable.i5));
        lst.add(new row(R.drawable.i6));
        lst.add(new row(R.drawable.i7));
        lst.add(new row(R.drawable.i1));
        lst.add(new row(R.drawable.i2));
        lst.add(new row(R.drawable.i3));
        lst.add(new row(R.drawable.i4));
        lst.add(new row(R.drawable.i5));
        lst.add(new row(R.drawable.i6));
        lst.add(new row(R.drawable.i7));
        lst.add(new row(R.drawable.i8));
        lst.add(new row(R.drawable.i9));
        lst.add(new row(R.drawable.i10));
        lst.add(new row(R.drawable.i11));
        lst.add(new row(R.drawable.i12));
        lst.add(new row(R.drawable.i4));
        lst.add(new row(R.drawable.i11));
        lst.add(new row(R.drawable.i13));
        lst.add(new row(R.drawable.i14));
        lst.add(new row(R.drawable.i15));
        lst.add(new row(R.drawable.i12));
        lst.add(new row(R.drawable.i4));
        lst.add(new row(R.drawable.i11));
        lst.add(new row(R.drawable.i13));
        lst.add(new row(R.drawable.i1));
        lst.add(new row(R.drawable.i2));
        lst.add(new row(R.drawable.i3));
        lst.add(new row(R.drawable.i4));
        lst.add(new row(R.drawable.i5));
        lst.add(new row(R.drawable.i6));
        lst.add(new row(R.drawable.i7));


        adapter = new StaggeredRecyclerAdapter(this, lst);
        staggeredRv.setAdapter(adapter);


    }

    //--------------FloatingButton----------//
    public void openShot5() {
        Intent intent5 = new Intent();
        intent5.setAction(Intent.ACTION_VIEW);
        intent5.addCategory(Intent.CATEGORY_BROWSABLE);
        intent5.setData(Uri.parse("https://github.com/ObivanKenobiDark?tab=repositories"));
        startActivity(intent5);
    }



}
