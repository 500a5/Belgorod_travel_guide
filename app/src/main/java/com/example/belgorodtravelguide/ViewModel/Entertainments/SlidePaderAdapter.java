package com.example.belgorodtravelguide.ViewModel.Entertainments;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.belgorodtravelguide.View.Entertainments.PagerFragment1;
import com.example.belgorodtravelguide.View.Entertainments.PagerFragment2;
import com.example.belgorodtravelguide.View.Entertainments.PagerFragment3;

import java.util.List;

public class SlidePaderAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragmentList;


    public SlidePaderAdapter(FragmentManager fm, List<Fragment> fragmentList) {
        super(fm);
        this.fragmentList=fragmentList;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
       return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
