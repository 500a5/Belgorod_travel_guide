package com.example.belgorodtravelguide.View.News;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.belgorodtravelguide.Model.News.NewsAdapter;
import com.example.belgorodtravelguide.Model.News.NewsDataModel;
import com.example.belgorodtravelguide.R;

import java.util.ArrayList;


public class NewsFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<NewsDataModel> dataholder;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_news, container, false);
        recyclerView = view.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        dataholder = new ArrayList<>();

        NewsDataModel ob1 = new NewsDataModel(R.drawable.q, "head","Body  Body   Body   Body    Body     Body" );
        dataholder.add(ob1);

        NewsDataModel ob2 = new NewsDataModel(R.drawable.q2, "head","Body  Body   Body   Body    Body     Body" );
        dataholder.add(ob2);

        NewsDataModel ob3 = new NewsDataModel(R.drawable.q, "head","Body  Body   Body   Body    Body     Body" );
        dataholder.add(ob3);

        NewsDataModel ob4 = new NewsDataModel(R.drawable.q2, "head","Body  Body   Body   Body    Body     Body" );
        dataholder.add(ob4);

        NewsDataModel ob5 = new NewsDataModel(R.drawable.q, "head","Body  Body   Body   Body    Body     Body" );
        dataholder.add(ob5);

        NewsDataModel ob6=  new NewsDataModel(R.drawable.q, "head","Body  Body   Body   Body    Body     Body" );
        dataholder.add(ob6);

        NewsDataModel ob7 = new NewsDataModel(R.drawable.q2, "head","Body  Body   Body   Body    Body     Body" );
        dataholder.add(ob7);
        Context context=getActivity();
        recyclerView.setAdapter(new NewsAdapter(dataholder, context));

        return view;
    }
}