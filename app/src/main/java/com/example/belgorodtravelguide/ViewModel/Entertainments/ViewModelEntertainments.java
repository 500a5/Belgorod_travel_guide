package com.example.belgorodtravelguide.ViewModel.Entertainments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import com.example.belgorodtravelguide.Model.Entertainments.EntertainmentsDataModel;
import com.example.belgorodtravelguide.Model.Entertainments.EntertainmentsName;
import com.example.belgorodtravelguide.Model.News.NewsDataModel;
import com.example.belgorodtravelguide.View.Entertainments.EntertainmentsFragment;
import com.example.belgorodtravelguide.View.Entertainments.InterfaceEntertaiments;
import com.example.belgorodtravelguide.View.News.InterfaceNews;
import com.example.belgorodtravelguide.View.News.NewsFragment;

import java.util.ArrayList;

public class ViewModelEntertainments implements InterfaceEntertaiments.ViewModelEntertaiments {
    private EntertainmentsFragment view;
    private InterfaceEntertaiments.EntertainmentsName entertainmentsName = new com.example.belgorodtravelguide.Model.Entertainments.EntertainmentsName();

    public ViewModelEntertainments(com.example.belgorodtravelguide.View.Entertainments.EntertainmentsFragment view) {
        this.view = view;
    }

    public ArrayList<EntertainmentsDataModel> newItemRecyclerView (){
        ArrayList<EntertainmentsDataModel> dataholder;
        dataholder = new ArrayList<>();
        for (int i = 0; i< entertainmentsName.getImageCount(); i++){
            dataholder.add(new EntertainmentsDataModel(entertainmentsName.getImage(i), entertainmentsName.getHead(i)));
        }
        return dataholder;
    }
/*
    public String getAdress(int pos){
        String  adress = newsName.getAdress(pos);
        return adress;
    }

    public void gooToSite(Context context){
        Uri address = Uri.parse(getAdress(0));
        Intent intent = new Intent(Intent.ACTION_VIEW, address);
        context.startActivity(intent);
    }

 */

}
