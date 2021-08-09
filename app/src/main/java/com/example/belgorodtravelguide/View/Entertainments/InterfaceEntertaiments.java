package com.example.belgorodtravelguide.View.Entertainments;

import android.content.Context;

import com.example.belgorodtravelguide.Model.Entertainments.EntertainmentsDataModel;
import com.example.belgorodtravelguide.Model.News.NewsDataModel;

import java.util.ArrayList;

public interface InterfaceEntertaiments {
    interface ViewModelEntertaiments {
        ArrayList<EntertainmentsDataModel> newItemRecyclerView();
    }
    interface EntertainmentsName {
        String getAdress(int pos);
        String getHead(int pos);
        int getImage(int pos);
        int getImageCount();
    }

}
