package com.example.belgorodtravelguide.View.Entertainments.EntertainmentsActivity.Cafe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.example.belgorodtravelguide.View.Entertainments.EntertainmentsActivity.Cafe.CafeAdapter;
import com.example.belgorodtravelguide.Model.Entertainments.Cafe.CafeDataModel;
import com.example.belgorodtravelguide.R;
import com.example.belgorodtravelguide.ViewModel.Entertainments.Cafe.ViewModelCafe;
import com.example.belgorodtravelguide.ViewModel.Entertainments.ViewModelEntertainments;

import java.util.ArrayList;

public class CafeActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    private ViewModelCafe viewModelCafe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe);

        viewModelCafe = new ViewModelCafe(this);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL));

        recyclerView.setAdapter(new CafeAdapter(viewModelCafe.newItemRecyclerView(), getParent()));

    }

}