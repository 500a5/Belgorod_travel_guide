package com.example.belgorodtravelguide.View.Entertainments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.belgorodtravelguide.Model.Entertainments.ShopingCenter.ShopingCenterAdapter;
import com.example.belgorodtravelguide.Model.Entertainments.ShopingCenter.ShopingCenterDataModel;
import com.example.belgorodtravelguide.Model.Entertainments.Teatre.TeatreAdapter;
import com.example.belgorodtravelguide.Model.Entertainments.Teatre.TeatreDataModel;
import com.example.belgorodtravelguide.R;

import java.util.ArrayList;

public class TheaterActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<TeatreDataModel> dataholder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theater);
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getParent()));

        dataholder = new ArrayList<>();

        TeatreDataModel ob1 = new TeatreDataModel(R.drawable.entertainments_theatre_1, "Театр Кукол");
        dataholder.add(ob1);


        TeatreDataModel ob2 = new TeatreDataModel(R.drawable.entertainments_theatre_2, "Театр Им. Щепкина");
        dataholder.add(ob2);


        recyclerView.setAdapter(new TeatreAdapter(dataholder, getParent()));

    }
}