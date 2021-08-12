package com.example.belgorodtravelguide.View.Entertainments.EntertainmentsActivity.Move;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.example.belgorodtravelguide.View.Entertainments.EntertainmentsActivity.Move.MoveAdapter;
import com.example.belgorodtravelguide.Model.Entertainments.Move.MoveDataModel;
import com.example.belgorodtravelguide.R;
import com.example.belgorodtravelguide.ViewModel.Entertainments.Cafe.ViewModelCafe;
import com.example.belgorodtravelguide.ViewModel.Entertainments.Move.ViewModelMove;
import com.example.belgorodtravelguide.databinding.ActivityMoveBinding;

import java.util.ArrayList;

public class MoveActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<MoveDataModel> dataholder;
    private ViewModelMove viewModelMove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMoveBinding activityMoveBinding = DataBindingUtil.setContentView(this,R.layout.activity_move);

        viewModelMove = new ViewModelMove(this);

        recyclerView = activityMoveBinding.recyclerview;
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL));

        recyclerView.setAdapter(new MoveAdapter(viewModelMove.newItemRecyclerView(), getParent()));

    }

}