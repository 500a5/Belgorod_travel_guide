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

import com.example.belgorodtravelguide.ViewModel.Shop.ShopAdapter;
import com.example.belgorodtravelguide.Model.Shop.ShopDataModel;
import com.example.belgorodtravelguide.R;
import com.example.belgorodtravelguide.View.MainActivity;

import java.util.ArrayList;


public class ShopSportFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<ShopDataModel> dataholder;
    TextView point;
    Button summpoint;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
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

        dataholder = new ArrayList<>();

        ShopDataModel ob1 = new ShopDataModel(R.drawable.ball, 600,"Мяч" );
        dataholder.add(ob1);

        ShopDataModel ob2 = new ShopDataModel(R.drawable.skipping_rope, 300,"Скакалка" );
        dataholder.add(ob2);

        ShopDataModel ob3 = new ShopDataModel(R.drawable.dumbbells, 1500,"Гантель" );
        dataholder.add(ob3);

        ShopDataModel ob4 = new ShopDataModel(R.drawable.skipping_rope, 300,"Скакалка" );
        dataholder.add(ob4);

        ShopDataModel ob5 = new ShopDataModel(R.drawable.ball, 600,"Мяч" );
        dataholder.add(ob5);

        ShopDataModel ob6=  new ShopDataModel(R.drawable.dumbbells, 1500,"Гантель" );
        dataholder.add(ob6);

        ShopDataModel ob7 = new ShopDataModel(R.drawable.ball, 600,"Мяч" );
        dataholder.add(ob7);
        Context context=getActivity();
        recyclerView.setAdapter(new ShopAdapter(dataholder, context));



        return view;
    }

}