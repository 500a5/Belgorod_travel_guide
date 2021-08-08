package com.example.belgorodtravelguide.View.Entertainments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.belgorodtravelguide.ViewModel.Entertainments.Park.ParkAdapter;
import com.example.belgorodtravelguide.Model.Entertainments.Park.ParkDataModel;
import com.example.belgorodtravelguide.R;

import java.util.ArrayList;

public class ParkActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<ParkDataModel> dataholder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_park);
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getParent()));

        dataholder = new ArrayList<>();

        ParkDataModel ob1 = new ParkDataModel(R.drawable.entertainments_park_1, "Парк Ленина");
        dataholder.add(ob1);

        ParkDataModel ob2 = new ParkDataModel(R.drawable.entertainments_park_2, "Парк Дружбы");
        dataholder.add(ob2);


        ParkDataModel ob3 = new ParkDataModel(R.drawable.entertainments_park_3, "Парк Победы");
        dataholder.add(ob3);

        recyclerView.setAdapter(new ParkAdapter(dataholder, getParent()));

    }

}