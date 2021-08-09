package com.example.belgorodtravelguide.View.Entertainments;

import android.content.Context;
import android.os.Bundle;

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
        List<Fragment> list = new ArrayList<>();
        list.add(new PagerFragment1());
        list.add(new PagerFragment2());
        list.add(new PagerFragment3());


        View view =  inflater.inflate(R.layout.fragment_entertainments, container, false);
        pager = (ViewPager) view.findViewById(R.id.pager);
        pagerAdapter = new SlidePaderAdapter(getChildFragmentManager(),list);
        pager.setAdapter(pagerAdapter);

        final int[] currentPage = {0};
        Timer timer;
        final long DELAY_MS = 2000;//delay in milliseconds before task is to be executed
        final long PERIOD_MS = 2000; // time in milliseconds between successive task executions.

        /*After setting the adapter use the timer */
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage[0] == list.size()) {
                    currentPage[0] = 0;
                }
                pager.setCurrentItem(currentPage[0]++, true);
            }
        };

        timer = new Timer(); // This will create a new Thread
        timer.schedule(new TimerTask() { // task to be scheduled
            @Override
            public void run() {
                handler.post(Update);
            }
        }, DELAY_MS, PERIOD_MS);



        recyclerView = view.findViewById(R.id.rec);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL));

        Context context=getActivity();
        recyclerView.setAdapter(new EntertainmentsAdapter(viewModelEntertainments.newItemRecyclerView(), context));


        return view;
    }


}