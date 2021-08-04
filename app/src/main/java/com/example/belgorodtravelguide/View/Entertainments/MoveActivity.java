package com.example.belgorodtravelguide.View.Entertainments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.example.belgorodtravelguide.Model.Entertainments.Move.MoveAdapter;
import com.example.belgorodtravelguide.Model.Entertainments.Move.MoveDataModel;
import com.example.belgorodtravelguide.Model.News.NewsAdapter;
import com.example.belgorodtravelguide.Model.News.NewsDataModel;
import com.example.belgorodtravelguide.R;

import java.util.ArrayList;

public class MoveActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<MoveDataModel> dataholder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move);
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getParent()));

        dataholder = new ArrayList<>();

        MoveDataModel ob1 = new MoveDataModel(R.drawable.entertainments_movie_1, "Кинотеатр Победа");
        dataholder.add(ob1);

        MoveDataModel ob2 = new MoveDataModel(R.drawable.entertainments_movie_2, "Кинотеатр Русич");
        dataholder.add(ob2);

        MoveDataModel ob3 = new MoveDataModel(R.drawable.entertainments_movie_3, "Кинотеатр Радуга");
        dataholder.add(ob3);

        recyclerView.setAdapter(new MoveAdapter(dataholder, getParent()));

    }

}