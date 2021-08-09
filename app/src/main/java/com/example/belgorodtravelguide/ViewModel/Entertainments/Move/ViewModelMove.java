package com.example.belgorodtravelguide.ViewModel.Entertainments.Move;

import com.example.belgorodtravelguide.Model.Entertainments.Cafe.CafeDataModel;
import com.example.belgorodtravelguide.Model.Entertainments.Move.MoveDataModel;
import com.example.belgorodtravelguide.View.Entertainments.EntertainmentsActivity.Cafe.CafeActivity;
import com.example.belgorodtravelguide.View.Entertainments.EntertainmentsActivity.Move.MoveActivity;
import com.example.belgorodtravelguide.View.Entertainments.InterfaceEntertaiments;

import java.util.ArrayList;

public class ViewModelMove implements InterfaceEntertaiments.ViewModelMove{
    private MoveActivity view;
    private InterfaceEntertaiments.MoveName moveName = new com.example.belgorodtravelguide.Model.Entertainments.Move.MoveName();

    public ViewModelMove(MoveActivity view) {
        this.view = view;
    }

    public ArrayList<MoveDataModel> newItemRecyclerView (){
        ArrayList<MoveDataModel> dataholder;
        dataholder = new ArrayList<>();
        for (int i = 0; i< moveName.getImageCount(); i++){
            dataholder.add(new MoveDataModel(moveName.getImage(i), moveName.getHead(i)));
        }
        return dataholder;
    }


}
