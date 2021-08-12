package com.example.belgorodtravelguide.View.Entertainments;

import android.content.Context;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.belgorodtravelguide.View.Entertainments.Pager.PagerFragment1;
import com.example.belgorodtravelguide.View.Entertainments.Pager.PagerFragment2;
import com.example.belgorodtravelguide.View.Entertainments.Pager.PagerFragment3;
import com.example.belgorodtravelguide.Model.Entertainments.EntertainmentsDataModel;
import com.example.belgorodtravelguide.R;
import com.example.belgorodtravelguide.View.Entertainments.Pager.SlidePaderAdapter;
import com.example.belgorodtravelguide.ViewModel.Entertainments.ViewModelEntertainments;
import com.example.belgorodtravelguide.ViewModel.News.ViewModelNews;
import com.example.belgorodtravelguide.databinding.FragmentEntertainmentsBinding;
import com.example.belgorodtravelguide.databinding.FragmentNewsBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;


public class EntertainmentsFragment extends Fragment {

    RecyclerView recyclerView;
    private ViewPager pager;
    private PagerAdapter pagerAdapter;
    private ViewModelEntertainments viewModelEntertainments;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModelEntertainments = new ViewModelEntertainments(this);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        FragmentEntertainmentsBinding binding =  DataBindingUtil.inflate(inflater, R.layout.fragment_entertainments, container, false);
        View view = binding.getRoot();


        pager = binding.pager;
        pagerAdapter = new SlidePaderAdapter(getChildFragmentManager(),viewModelEntertainments.newListFragment());
        pager.setAdapter(pagerAdapter);

        viewModelEntertainments.pagerTimer(pager);

        recyclerView = binding.rec;
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL));

        recyclerView.setAdapter(new EntertainmentsAdapter(viewModelEntertainments.newItemRecyclerView(), getActivity(),viewModelEntertainments));

        return view;
    }


}