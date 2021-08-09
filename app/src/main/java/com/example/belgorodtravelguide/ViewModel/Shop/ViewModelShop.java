package com.example.belgorodtravelguide.ViewModel.Shop;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.belgorodtravelguide.Model.Shop.ShopDataModel;
import com.example.belgorodtravelguide.View.MainActivity;
import com.example.belgorodtravelguide.View.Shop.InterfaceShop;
import com.example.belgorodtravelguide.View.Shop.ShopSportFragment;

import java.util.ArrayList;

public class ViewModelShop implements InterfaceShop.ViewModelShop {

    public ShopSportFragment view;
    public MainActivity mainActivity;
    private InterfaceShop.ShopName shopName = new com.example.belgorodtravelguide.Model.Shop.ShopName();


    public ViewModelShop(ShopSportFragment view) {
        this.view = view;
    }

    public ArrayList<ShopDataModel> newItemRecyclerView (){
        ArrayList<ShopDataModel> dataholder;
        dataholder = new ArrayList<>();
        for (int i=0; i<shopName.getImageCount(); i++){
            dataholder.add(new ShopDataModel(shopName.getImage(i), shopName.getPrise(i),shopName.getBody(i) ));
        }
        return dataholder;
    }

    public void buySpotrItem(int pos, ArrayList<ShopDataModel> dataholder) {

        if (pos != RecyclerView.NO_POSITION) {
            ShopDataModel clickedDataItem = dataholder.get(pos);
            int prise = clickedDataItem.getPrise();
            if (prise <= MainActivity.getpoint()) {
                MainActivity.setpoint(prise);
            }
        }
    }
}
