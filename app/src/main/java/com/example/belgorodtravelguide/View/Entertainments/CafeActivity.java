package com.example.belgorodtravelguide.View.Entertainments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.belgorodtravelguide.ViewModel.Entertainments.Cafe.CafeAdapter;
import com.example.belgorodtravelguide.Model.Entertainments.Cafe.CafeDataModel;
import com.example.belgorodtravelguide.R;

import java.util.ArrayList;

public class CafeActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<CafeDataModel> dataholder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe);
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getParent()));

        dataholder = new ArrayList<>();

        CafeDataModel ob1 = new CafeDataModel(R.drawable.entertainments_cafe_1, "Кафе Вкусное");
        dataholder.add(ob1);

        CafeDataModel ob2 = new CafeDataModel(R.drawable.entertainments_cafe_2, "Кафе Домашнее");
        dataholder.add(ob2);

        CafeDataModel ob3 = new CafeDataModel(R.drawable.entertainments_cafe_3, "Кафе Аппетитное");
        dataholder.add(ob3);

        recyclerView.setAdapter(new CafeAdapter(dataholder, getParent()));

    }

}