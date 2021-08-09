package com.example.belgorodtravelguide.Model.Entertainments.Move;

import com.example.belgorodtravelguide.R;
import com.example.belgorodtravelguide.View.Entertainments.InterfaceEntertaiments;

public class MoveName implements InterfaceEntertaiments.MoveName {
    static String[] head = new String[]{"Кинотеатр Победа","Кинотеатр Русич","Кинотеатр Радуга"};
    static int[] idImage = new int[]{R.drawable.entertainments_movie_1,R.drawable.entertainments_movie_2,R.drawable.entertainments_movie_3};


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