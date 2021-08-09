package com.example.belgorodtravelguide.Model.Entertainments;

import com.example.belgorodtravelguide.R;
import com.example.belgorodtravelguide.View.Entertainments.EntertainmentsActivity.Cafe.CafeActivity;
import com.example.belgorodtravelguide.View.Entertainments.EntertainmentsActivity.Move.MoveActivity;
import com.example.belgorodtravelguide.View.Entertainments.EntertainmentsActivity.Park.ParkActivity;
import com.example.belgorodtravelguide.View.Entertainments.EntertainmentsActivity.ShoppingCenter.ShoppingCenterActivity;
import com.example.belgorodtravelguide.View.Entertainments.EntertainmentsActivity.Teatre.TheaterActivity;
import com.example.belgorodtravelguide.View.Entertainments.InterfaceEntertaiments;

public class EntertainmentsName implements InterfaceEntertaiments.EntertainmentsName {
    static Class<?>[] Class = new Class<?>[]{MoveActivity.class, CafeActivity.class, ShoppingCenterActivity.class, ParkActivity.class, TheaterActivity.class};
    static String[] head = new String[]{"Кинотеатры", "Кафе", "Торговые центры", "Парки", "Театры"};
    static int[] idImage = new int[]{R.drawable.ic_baseline_local_movies_24, R.drawable.ic_baseline_local_cafe_24, R.drawable.ic_baseline_shopping_bag_24, R.drawable.ic_baseline_park_24, R.drawable.ic_entertainments};

    public Class getClass(int pos) {
        return Class[pos];
    }

    public String getHead(int pos) {
        return head[pos];
    }

    public int getImage(int pos) {
        return idImage[pos];
    }

    public int getImageCount() {
        return idImage.length;
    }

    public int getClassCount() {
        return Class.length;
    }

    public int getHeadCount() {
        return head.length;
    }
}