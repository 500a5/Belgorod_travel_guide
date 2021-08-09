package com.example.belgorodtravelguide.ViewModel.Entertainments.Teatre;

import com.example.belgorodtravelguide.Model.Entertainments.ShoppingCenter.ShoppingCenterDataModel;
import com.example.belgorodtravelguide.Model.Entertainments.Theater.TheaterDataModel;
import com.example.belgorodtravelguide.View.Entertainments.EntertainmentsActivity.ShoppingCenter.ShoppingCenterActivity;
import com.example.belgorodtravelguide.View.Entertainments.EntertainmentsActivity.Teatre.TheaterActivity;
import com.example.belgorodtravelguide.View.Entertainments.InterfaceEntertaiments;

import java.util.ArrayList;

public class ViewModelTheater implements InterfaceEntertaiments.ViewModelTheater{
    private TheaterActivity view;
    private InterfaceEntertaiments.TheaterName theaterName = new com.example.belgorodtravelguide.Model.Entertainments.Theater.TheaterName();

    public ViewModelTheater(TheaterActivity view) {
        this.view = view;
    }

    public ArrayList<TheaterDataModel> newItemRecyclerView (){
        ArrayList<TheaterDataModel> dataholder;
        dataholder = new ArrayList<>();
        for (int i = 0; i< theaterName.getImageCount(); i++){
            dataholder.add(new TheaterDataModel(theaterName.getImage(i), theaterName.getHead(i)));
        }
        return dataholder;
    }


}
