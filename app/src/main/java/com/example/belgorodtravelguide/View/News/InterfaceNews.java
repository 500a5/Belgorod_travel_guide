package com.example.belgorodtravelguide.View.News;

import android.content.Context;

import com.example.belgorodtravelguide.Model.News.NewsDataModel;
import com.example.belgorodtravelguide.View.News.NewsFragment;

import java.util.ArrayList;

public interface InterfaceNews {

    interface ViewModelNews {
         ArrayList<NewsDataModel> newItemRecyclerView();
         void gooToSite(Context context);
    }
    interface NewsName {
        String getAdress(int pos);
        String getHead(int pos);
        String getBody(int pos);
        int getImage(int pos);
        int getImageCount();
        int getAdressCount();
        int getBodyCount();
        int getHeadCount();
    }

}
