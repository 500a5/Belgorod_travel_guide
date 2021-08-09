package com.example.belgorodtravelguide.Model.Entertainments.Cafe;

import com.example.belgorodtravelguide.R;
import com.example.belgorodtravelguide.View.Entertainments.InterfaceEntertaiments;

public class CafeName implements InterfaceEntertaiments.CafeName {
    static String[] head = new String[]{"Кафе Вкусное", "Кафе Домашнее", "Кафе Аппетитное"};
    static int[] idImage = new int[]{R.drawable.entertainments_cafe_1,R.drawable.entertainments_cafe_2,R.drawable.entertainments_cafe_3};


    public String getHead(int pos) {
        return head[pos];
    }

    public int getImage(int pos) {
        return idImage[pos];
    }

    public int getImageCount() {
        return idImage.length;
    }

    public int getHeadCount() {
        return head.length;
    }
}