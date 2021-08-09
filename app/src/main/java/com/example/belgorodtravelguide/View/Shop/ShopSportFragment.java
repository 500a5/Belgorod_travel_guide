package com.example.belgorodtravelguide.View.Shop;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.belgorodtravelguide.Model.Shop.ShopDataModel;
import com.example.belgorodtravelguide.R;
import com.example.belgorodtravelguide.View.MainActivity;
import com.example.belgorodtravelguide.ViewModel.News.ViewModelNews;
import com.example.belgorodtravelguide.ViewModel.Shop.ViewModelShop;

import java.util.ArrayList;


public class ShopSportFragment extends Fragment {

    RecyclerView recyclerView;
    TextView point;
    Button summpoint;
    private ViewModelShop viewModelShop;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModelShop = new ViewModelShop(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_shop_sport, container, false);

        point = view.findViewById(R.id.point);
        point.setText(Integer.toString(MainActivity.getpoint()));


        view.findViewById(R.id.summpoint).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.sumpoint();
                point.setText(Integer.toString(MainActivity.getpoint()));
                onResume();
            }
        });




        recyclerView = view.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        recyclerView.setAdapter(new ShopAdapter(viewModelShop.newItemRecyclerView(), getActivity(),viewModelShop,this));


        return view;
    }

}