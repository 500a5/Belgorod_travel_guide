package com.example.belgorodtravelguide.View.News;

import android.content.Context;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.belgorodtravelguide.R;
import com.example.belgorodtravelguide.ViewModel.News.ViewModelNews;
import com.example.belgorodtravelguide.databinding.FragmentNewsBinding;


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

        FragmentNewsBinding binding =  DataBindingUtil.inflate(inflater, R.layout.fragment_news, container, false);
        View view = binding.getRoot();

        recyclerView = binding.recyclerview;
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL));

        recyclerView.setAdapter(new NewsAdapter(viewModelNews.newItemRecyclerView (), getActivity(), viewModelNews));

        return view;
    }



}