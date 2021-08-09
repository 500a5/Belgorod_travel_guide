package com.example.belgorodtravelguide.Model.Entertainments.Park;

import com.example.belgorodtravelguide.R;
import com.example.belgorodtravelguide.View.Entertainments.InterfaceEntertaiments;

public class ParkName implements InterfaceEntertaiments.ParkName {
    static String[] head = new String[]{"Парк Ленина","Парк Дружбы","Парк Победы"};
    static int[] idImage = new int[]{R.drawable.entertainments_park_1,R.drawable.entertainments_park_2,R.drawable.entertainments_park_3};


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