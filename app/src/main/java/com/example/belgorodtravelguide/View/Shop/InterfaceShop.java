package com.example.belgorodtravelguide.View.Shop;

import android.content.Context;

import com.example.belgorodtravelguide.Model.Shop.ShopDataModel;

import java.util.ArrayList;

public interface InterfaceShop {

    interface ViewModelShop {
         ArrayList<ShopDataModel> newItemRecyclerView();
         void buySpotrItem(int pos, ArrayList<ShopDataModel> dataholder);
    }
    interface ShopName {
        int getPrise(int pos);
        int getImage(int pos);
        int getImageCount();
        int getPriseCount();
        int getBodyCount();
        String getBody(int pos);

    }

}
