//package com.example.tapp2;
//
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//
//import androidx.fragment.app.Fragment;
//import androidx.recyclerview.widget.RecyclerView;
//import androidx.recyclerview.widget.StaggeredGridLayoutManager;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Fragment1 extends Fragment {
//
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        View v = inflater.inflate(R.layout.activity_recycler_3, null);
//
//
//
//        RecyclerView staggeredRv = (RecyclerView) v.findViewById(R.id.staggered_rv);
//        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
//        staggeredRv.setLayoutManager(manager);
//
//        List<row> lst = new ArrayList<>();
//
//        StaggeredRecyclerAdapter adapter = new StaggeredRecyclerAdapter(lst);
//
//        staggeredRv.setAdapter(adapter);
//
//
//
//        return v;
//    }
//
//
//}
