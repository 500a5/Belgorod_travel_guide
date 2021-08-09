package com.example.belgorodtravelguide.View.Entertainments.EntertainmentsActivity.ShopingCenter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.example.belgorodtravelguide.View.Entertainments.EntertainmentsActivity.ShopingCenter.ShopingCenterAdapter;
import com.example.belgorodtravelguide.Model.Entertainments.ShopingCenter.ShopingCenterDataModel;
import com.example.belgorodtravelguide.R;

import java.util.ArrayList;

public class ShoppingCenterActivity extends AppCompatActivity {

        RecyclerView recyclerView;
        ArrayList<ShopingCenterDataModel> dataholder;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_shopping_center);
            recyclerView = findViewById(R.id.recyclerview);
            recyclerView.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL));

            dataholder = new ArrayList<>();

            ShopingCenterDataModel ob1 = new ShopingCenterDataModel(R.drawable.entertainments_tc_1, "Торговый центр СитиМолл");
            dataholder.add(ob1);


            ShopingCenterDataModel ob2 = new ShopingCenterDataModel(R.drawable.entertainments_tc_2, "Торговый центр МегаГрин");
            dataholder.add(ob2);


            ShopingCenterDataModel ob3 = new ShopingCenterDataModel(R.drawable.entertainments_tc_3, "Торговый центр Белгород");
            dataholder.add(ob3);

            recyclerView.setAdapter(new ShopingCenterAdapter(dataholder, getParent()));

        }

}