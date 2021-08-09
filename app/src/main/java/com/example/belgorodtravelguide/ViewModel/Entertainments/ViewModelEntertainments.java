package com.example.belgorodtravelguide.ViewModel.Entertainments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.belgorodtravelguide.Model.Entertainments.EntertainmentsDataModel;
import com.example.belgorodtravelguide.Model.Entertainments.EntertainmentsName;
import com.example.belgorodtravelguide.Model.News.NewsDataModel;
import com.example.belgorodtravelguide.View.Entertainments.EntertainmentsActivity.Move.MoveActivity;
import com.example.belgorodtravelguide.View.Entertainments.EntertainmentsFragment;
import com.example.belgorodtravelguide.View.Entertainments.InterfaceEntertaiments;
import com.example.belgorodtravelguide.View.Entertainments.Pager.PagerFragment1;
import com.example.belgorodtravelguide.View.Entertainments.Pager.PagerFragment2;
import com.example.belgorodtravelguide.View.Entertainments.Pager.PagerFragment3;
import com.example.belgorodtravelguide.View.News.InterfaceNews;
import com.example.belgorodtravelguide.View.News.NewsFragment;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class ViewModelEntertainments implements InterfaceEntertaiments.ViewModelEntertaiments {
    private EntertainmentsFragment view;
    private InterfaceEntertaiments.EntertainmentsName entertainmentsName = new com.example.belgorodtravelguide.Model.Entertainments.EntertainmentsName();

    public ViewModelEntertainments(com.example.belgorodtravelguide.View.Entertainments.EntertainmentsFragment view) {
        this.view = view;
    }

    public ArrayList<EntertainmentsDataModel> newItemRecyclerView (){
        ArrayList<EntertainmentsDataModel> dataholder;
        dataholder = new ArrayList<>();
        for (int i = 0; i< entertainmentsName.getImageCount(); i++){
            dataholder.add(new EntertainmentsDataModel(entertainmentsName.getImage(i), entertainmentsName.getHead(i)));
        }
        return dataholder;
    }

    public Class getClass(int pos){
        Class adress = entertainmentsName.getClass(pos);
        return adress;
    }

    public void gooNewActivity(Context context, int pos){
        Intent intent;
        intent = new Intent(context, getClass(pos));
        context.startActivity(intent);
    }

    public List<Fragment> newListFragment(){
        List<Fragment> list = new ArrayList<>();
        list.add(new PagerFragment1());
        list.add(new PagerFragment2());
        list.add(new PagerFragment3());
        return list;
    }

    public void pagerTimer(ViewPager pager){
        final int[] currentPage = {0};
        Timer timer;
        final long DELAY_MS = 2000;//delay in milliseconds before task is to be executed
        final long PERIOD_MS = 2000; // time in milliseconds between successive task executions.

        /*After setting the adapter use the timer */
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage[0] == newListFragment().size()) {
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
    }


}
