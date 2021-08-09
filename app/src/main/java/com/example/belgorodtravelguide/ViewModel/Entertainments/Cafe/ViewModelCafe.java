package com.example.belgorodtravelguide.ViewModel.Entertainments.Cafe;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.belgorodtravelguide.Model.Entertainments.Cafe.CafeDataModel;
import com.example.belgorodtravelguide.Model.Entertainments.EntertainmentsDataModel;
import com.example.belgorodtravelguide.View.Entertainments.EntertainmentsActivity.Cafe.CafeActivity;
import com.example.belgorodtravelguide.View.Entertainments.EntertainmentsFragment;
import com.example.belgorodtravelguide.View.Entertainments.InterfaceEntertaiments;
import com.example.belgorodtravelguide.View.Entertainments.Pager.PagerFragment1;
import com.example.belgorodtravelguide.View.Entertainments.Pager.PagerFragment2;
import com.example.belgorodtravelguide.View.Entertainments.Pager.PagerFragment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class ViewModelCafe implements InterfaceEntertaiments.ViewModelCafe{
    private CafeActivity view;
    private InterfaceEntertaiments.CafeName cafeName = new com.example.belgorodtravelguide.Model.Entertainments.Cafe.CafeName();

    public ViewModelCafe(com.example.belgorodtravelguide.View.Entertainments.EntertainmentsActivity.Cafe.CafeActivity view) {
        this.view = view;
    }

    public ArrayList<CafeDataModel> newItemRecyclerView (){
        ArrayList<CafeDataModel> dataholder;
        dataholder = new ArrayList<>();
        for (int i = 0; i< cafeName.getImageCount(); i++){
            dataholder.add(new CafeDataModel(cafeName.getImage(i), cafeName.getHead(i)));
        }
        return dataholder;
    }


}
