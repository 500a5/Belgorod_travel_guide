package com.example.belgorodtravelguide.View.Entertainments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.belgorodtravelguide.R;

public class PagerFragment2 extends Fragment {


    @Nullable
    @Override
        public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.page_2,container,false);
            return rootView;

    }
}
