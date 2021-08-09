package com.example.belgorodtravelguide.ViewModel.Entertainments.ShopingCentre;

import com.example.belgorodtravelguide.Model.Entertainments.Move.MoveDataModel;
import com.example.belgorodtravelguide.Model.Entertainments.ShoppingCenter.ShoppingCenterDataModel;
import com.example.belgorodtravelguide.View.Entertainments.EntertainmentsActivity.Move.MoveActivity;
import com.example.belgorodtravelguide.View.Entertainments.EntertainmentsActivity.ShoppingCenter.ShoppingCenterActivity;
import com.example.belgorodtravelguide.View.Entertainments.InterfaceEntertaiments;

import java.util.ArrayList;

public class ViewModelShoppingCenter implements InterfaceEntertaiments.ViewModelShoppingCenter{
    private ShoppingCenterActivity view;
    private InterfaceEntertaiments.ShoppingCenterName shoppingCenterName = new com.example.belgorodtravelguide.Model.Entertainments.ShoppingCenter.ShoppingCenterName();

    public ViewModelShoppingCenter(ShoppingCenterActivity view) {
        this.view = view;
    }

    public ArrayList<ShoppingCenterDataModel> newItemRecyclerView (){
        ArrayList<ShoppingCenterDataModel> dataholder;
        dataholder = new ArrayList<>();
        for (int i = 0; i< shoppingCenterName.getImageCount(); i++){
            dataholder.add(new ShoppingCenterDataModel(shoppingCenterName.getImage(i), shoppingCenterName.getHead(i)));
        }
        return dataholder;
    }


}
