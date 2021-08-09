package com.example.belgorodtravelguide.ViewModel.Entertainments.Park;

import com.example.belgorodtravelguide.Model.Entertainments.Move.MoveDataModel;
import com.example.belgorodtravelguide.Model.Entertainments.Park.ParkDataModel;
import com.example.belgorodtravelguide.View.Entertainments.EntertainmentsActivity.Move.MoveActivity;
import com.example.belgorodtravelguide.View.Entertainments.EntertainmentsActivity.Park.ParkActivity;
import com.example.belgorodtravelguide.View.Entertainments.InterfaceEntertaiments;

import java.util.ArrayList;

public class ViewModelPark implements InterfaceEntertaiments.ViewModelPark{
    private ParkActivity view;
    private InterfaceEntertaiments.ParkName parkName = new com.example.belgorodtravelguide.Model.Entertainments.Park.ParkName();

    public ViewModelPark(ParkActivity view) {
        this.view = view;
    }

    public ArrayList<ParkDataModel> newItemRecyclerView (){
        ArrayList<ParkDataModel> dataholder;
        dataholder = new ArrayList<>();
        for (int i = 0; i< parkName.getImageCount(); i++){
            dataholder.add(new ParkDataModel(parkName.getImage(i), parkName.getHead(i)));
        }
        return dataholder;
    }


}
