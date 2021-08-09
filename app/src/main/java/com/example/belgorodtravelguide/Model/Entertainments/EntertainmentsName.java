package com.example.belgorodtravelguide.Model.Entertainments;

import com.example.belgorodtravelguide.R;
import com.example.belgorodtravelguide.View.Entertainments.InterfaceEntertaiments;

public class EntertainmentsName implements InterfaceEntertaiments.EntertainmentsName {
    static String[] adress = new String[]{"https://www.google.ru/", "https://www.google.ru/", "https://www.google.ru/", "https://www.google.ru/", "https://www.google.ru/"};
    static String[] head = new String[]{"Кинотеатры", "Кафе", "Торговые центры", "Парки", "Театры"};
    static int[] idImage = new int[]{R.drawable.ic_baseline_local_movies_24, R.drawable.ic_baseline_local_cafe_24, R.drawable.ic_baseline_shopping_bag_24, R.drawable.ic_baseline_park_24, R.drawable.ic_entertainments};

    public String getAdress(int pos) {
        return adress[pos];
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

    public int getAdressCount() {
        return adress.length;
    }

    public int getHeadCount() {
        return head.length;
    }
}