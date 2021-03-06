package com.example.belgorodtravelguide.View.Entertainments.EntertainmentsActivity.ShoppingCenter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.example.belgorodtravelguide.Model.Entertainments.ShoppingCenter.ShoppingCenterDataModel;
import com.example.belgorodtravelguide.R;
import com.example.belgorodtravelguide.ViewModel.Entertainments.ShopingCentre.ViewModelShoppingCenter;
import com.example.belgorodtravelguide.databinding.ActivityShoppingCenterBinding;

import java.util.ArrayList;

public class ShoppingCenterActivity extends AppCompatActivity {

        private ViewModelShoppingCenter viewModelShoppingCenter;
        RecyclerView recyclerView;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            ActivityShoppingCenterBinding activityShoppingCenterBinding = DataBindingUtil.setContentView(this,R.layout.activity_shopping_center);

            viewModelShoppingCenter = new ViewModelShoppingCenter(this);

            recyclerView = activityShoppingCenterBinding.recyclerview;
            recyclerView.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL));

            recyclerView.setAdapter(new ShoppingCenterAdapter(viewModelShoppingCenter.newItemRecyclerView(), getParent()));

        }

}