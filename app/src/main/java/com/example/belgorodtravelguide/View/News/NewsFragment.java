package com.example.belgorodtravelguide.View.News;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.belgorodtravelguide.R;
import com.example.belgorodtravelguide.ViewModel.News.ViewModelNews;


public class NewsFragment extends Fragment  {

    RecyclerView recyclerView;
    private ViewModelNews viewModelNews;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModelNews = new ViewModelNews(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_news, container, false);
        recyclerView = view.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL));

        Context context=getActivity();
        recyclerView.setAdapter(new NewsAdapter(viewModelNews.newItemRecyclerView (), context, viewModelNews));

        return view;
    }



}