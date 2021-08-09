package com.example.belgorodtravelguide.View.Entertainments.EntertainmentsActivity.Park;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.example.belgorodtravelguide.View.Entertainments.EntertainmentsActivity.Park.ParkAdapter;
import com.example.belgorodtravelguide.Model.Entertainments.Park.ParkDataModel;
import com.example.belgorodtravelguide.R;
import com.example.belgorodtravelguide.ViewModel.Entertainments.Move.ViewModelMove;
import com.example.belgorodtravelguide.ViewModel.Entertainments.Park.ViewModelPark;

import java.util.ArrayList;

public class ParkActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    private ViewModelPark viewModelPark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_park);

        viewModelPark = new ViewModelPark(this);

        recyclerView = findViewById(R.id.recyclerview);

        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL));

        recyclerView.setAdapter(new ParkAdapter(viewModelPark.newItemRecyclerView(), getParent()));

    }

}