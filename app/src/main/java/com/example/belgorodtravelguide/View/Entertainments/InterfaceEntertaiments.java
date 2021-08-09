package com.example.belgorodtravelguide.View.Entertainments;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.belgorodtravelguide.Model.Entertainments.Cafe.CafeDataModel;
import com.example.belgorodtravelguide.Model.Entertainments.EntertainmentsDataModel;
import com.example.belgorodtravelguide.Model.Entertainments.Move.MoveDataModel;
import com.example.belgorodtravelguide.Model.Entertainments.Park.ParkDataModel;
import com.example.belgorodtravelguide.Model.Entertainments.ShoppingCenter.ShoppingCenterDataModel;
import com.example.belgorodtravelguide.Model.Entertainments.Theater.TheaterDataModel;

import java.util.ArrayList;
import java.util.List;

public interface InterfaceEntertaiments {
    interface ViewModelEntertaiments {
        ArrayList<EntertainmentsDataModel> newItemRecyclerView();
        void gooNewActivity(Context context, int pos);
        List<Fragment> newListFragment();
        void pagerTimer(ViewPager pager);
    }

    interface EntertainmentsName {
        Class getClass(int pos);
        String getHead(int pos);
        int getImage(int pos);
        int getImageCount();
        int getClassCount();
        int getHeadCount();
    }

    interface CafeName {
        String getHead(int pos);
        int getImage(int pos);
        int getImageCount();
        int getHeadCount();
    }

    interface ViewModelCafe{
        ArrayList<CafeDataModel> newItemRecyclerView();
    }

    interface MoveName {
        String getHead(int pos);
        int getImage(int pos);
        int getImageCount();
        int getHeadCount();
    }

    interface ViewModelMove{
        ArrayList<MoveDataModel> newItemRecyclerView();
    }

    interface ParkName {
        String getHead(int pos);
        int getImage(int pos);
        int getImageCount();
        int getHeadCount();
    }

    interface ViewModelPark{
        ArrayList<ParkDataModel> newItemRecyclerView();
    }

    interface ShoppingCenterName {
        String getHead(int pos);
        int getImage(int pos);
        int getImageCount();
        int getHeadCount();
    }

    interface ViewModelShoppingCenter{
        ArrayList<ShoppingCenterDataModel> newItemRecyclerView();
    }

    interface TheaterName {
        String getHead(int pos);
        int getImage(int pos);
        int getImageCount();
        int getHeadCount();
    }

    interface ViewModelTheater{
        ArrayList<TheaterDataModel> newItemRecyclerView();
    }
}
