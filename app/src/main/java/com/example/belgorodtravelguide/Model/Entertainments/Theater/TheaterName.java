package com.example.belgorodtravelguide.Model.Entertainments.Theater;

import com.example.belgorodtravelguide.R;
import com.example.belgorodtravelguide.View.Entertainments.InterfaceEntertaiments;

public class TheaterName implements InterfaceEntertaiments.TheaterName {
    static String[] head = new String[]{"Театр Кукол","Театр Им. Щепкина"};
    static int[] idImage = new int[]{R.drawable.entertainments_theatre_1,R.drawable.entertainments_theatre_2};


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