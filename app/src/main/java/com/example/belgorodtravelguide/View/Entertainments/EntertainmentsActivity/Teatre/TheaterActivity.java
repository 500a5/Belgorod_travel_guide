package com.example.belgorodtravelguide.View.Entertainments.EntertainmentsActivity.Teatre;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.example.belgorodtravelguide.View.Entertainments.EntertainmentsActivity.Teatre.TeatreAdapter;
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
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL));

        dataholder = new ArrayList<>();

        TeatreDataModel ob1 = new TeatreDataModel(R.drawable.entertainments_theatre_1, "Театр Кукол");
        dataholder.add(ob1);


        TeatreDataModel ob2 = new TeatreDataModel(R.drawable.entertainments_theatre_2, "Театр Им. Щепкина");
        dataholder.add(ob2);


        recyclerView.setAdapter(new TeatreAdapter(dataholder, getParent()));

    }
}