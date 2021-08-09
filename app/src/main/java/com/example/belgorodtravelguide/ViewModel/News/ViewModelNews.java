package com.example.belgorodtravelguide.ViewModel.News;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import com.example.belgorodtravelguide.Model.News.NewsDataModel;
import com.example.belgorodtravelguide.View.News.InterfaceNews;
import com.example.belgorodtravelguide.View.News.NewsFragment;

import java.util.ArrayList;

public class ViewModelNews implements InterfaceNews.ViewModelNews {

    private NewsFragment view;
    private InterfaceNews.NewsName newsName = new com.example.belgorodtravelguide.Model.News.NewsName();


    public ViewModelNews(com.example.belgorodtravelguide.View.News.NewsFragment view) {
        this.view = view;
    }

    public ArrayList<NewsDataModel> newItemRecyclerView (){
        ArrayList<NewsDataModel> dataholder;
        dataholder = new ArrayList<>();
        for (int i=0; i<newsName.getImageCount(); i++){
            dataholder.add(new NewsDataModel(newsName.getImage(i), newsName.getHead(i),newsName.getBody(i) ));
        }
        return dataholder;
    }
    public String getAdress(int pos){
        String  adress = newsName.getAdress(pos);
        return adress;
    }

    public void gooToSite(Context context){
        Uri address = Uri.parse(getAdress(0));
        Intent intent = new Intent(Intent.ACTION_VIEW, address);
        context.startActivity(intent);
    }
}
