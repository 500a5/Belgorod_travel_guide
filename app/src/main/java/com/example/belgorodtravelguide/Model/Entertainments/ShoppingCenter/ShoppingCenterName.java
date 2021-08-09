package com.example.belgorodtravelguide.Model.Entertainments.ShoppingCenter;

import com.example.belgorodtravelguide.R;
import com.example.belgorodtravelguide.View.Entertainments.InterfaceEntertaiments;

public class ShoppingCenterName implements InterfaceEntertaiments.ShoppingCenterName {
    static String[] head = new String[]{"Торговый центр СитиМолл","Торговый центр МегаГрин","Торговый центр Белгород"};
    static int[] idImage = new int[]{R.drawable.entertainments_tc_1,R.drawable.entertainments_tc_2,R.drawable.entertainments_tc_3};


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