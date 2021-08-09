package com.example.belgorodtravelguide.Model.Shop;

import com.example.belgorodtravelguide.R;
import com.example.belgorodtravelguide.View.News.InterfaceNews;
import com.example.belgorodtravelguide.View.Shop.InterfaceShop;

public class ShopName implements InterfaceShop.ShopName {
    static int[] prise = new int[]{600,300,1500,600,300,1500};
    static String[] body = new String[]{"Мяч","Скакалка","Гантель","Мяч","Скакалка","Гантель"};
    static int[] idImage = new  int[]{R.drawable.ball,R.drawable.skipping_rope,R.drawable.dumbbells,R.drawable.ball,R.drawable.skipping_rope,R.drawable.dumbbells};


    public int getPrise(int pos){
        return prise[pos];
    }

    public String getBody(int pos){
        return body[pos];
    }

    public int getImage(int pos){
        return idImage[pos];
    }
    public int getImageCount() {
        return idImage.length;
    }


    public int getPriseCount(){return  prise.length;}

    public int getBodyCount(){return  body.length;}


}
