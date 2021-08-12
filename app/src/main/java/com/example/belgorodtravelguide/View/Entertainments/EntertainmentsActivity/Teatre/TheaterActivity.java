package com.example.belgorodtravelguide.View.Entertainments.EntertainmentsActivity.Teatre;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.example.belgorodtravelguide.Model.Entertainments.Theater.TheaterDataModel;
import com.example.belgorodtravelguide.R;
import com.example.belgorodtravelguide.ViewModel.Entertainments.ShopingCentre.ViewModelShoppingCenter;
import com.example.belgorodtravelguide.ViewModel.Entertainments.Teatre.ViewModelTheater;
import com.example.belgorodtravelguide.databinding.ActivityTheaterBinding;

import java.util.ArrayList;

public class TheaterActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    private ViewModelTheater viewModelTheater;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityTheaterBinding activityTheaterBinding = DataBindingUtil.setContentView(this,R.layout.activity_theater);

        viewModelTheater = new ViewModelTheater(this);
        recyclerView = activityTheaterBinding.recyclerview;
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL));

        recyclerView.setAdapter(new TheaterAdapter(viewModelTheater.newItemRecyclerView(), getParent()));

    }
}