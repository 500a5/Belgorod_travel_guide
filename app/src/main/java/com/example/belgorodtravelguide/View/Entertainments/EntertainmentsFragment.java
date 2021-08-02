package com.example.belgorodtravelguide.View.Entertainments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.belgorodtravelguide.R;
import com.example.belgorodtravelguide.Model.Entertainments.SlidePaderAdapter;

import java.util.ArrayList;
import java.util.List;


public class EntertainmentsFragment extends Fragment {

    private ViewPager pager;
    private PagerAdapter pagerAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


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
        pager.setCurrentItem(1);
        return inflater.inflate(R.layout.fragment_entertainments, container, false);
    }

}