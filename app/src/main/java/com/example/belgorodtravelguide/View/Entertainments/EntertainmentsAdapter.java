package com.example.belgorodtravelguide.View.Entertainments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.belgorodtravelguide.Model.Entertainments.EntertainmentsDataModel;
import com.example.belgorodtravelguide.R;
import com.example.belgorodtravelguide.databinding.EntertainmentsItemBinding;
import com.example.belgorodtravelguide.databinding.NewsItemBinding;

import java.util.ArrayList;

public class EntertainmentsAdapter extends RecyclerView.Adapter<EntertainmentsAdapter.ViewhHolder> {


    ArrayList<EntertainmentsDataModel> dataholder;
    private  Context context;
    private InterfaceEntertaiments.ViewModelEntertaiments viewModelEntertaiments;

    public EntertainmentsAdapter(ArrayList<EntertainmentsDataModel> dataholder, Context context,InterfaceEntertaiments.ViewModelEntertaiments viewModelEntertaiments) {
        this.dataholder = dataholder;
        this.context=context;
        this.viewModelEntertaiments=viewModelEntertaiments;
    }

    @NonNull

    @Override
    public ViewhHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        EntertainmentsItemBinding binding =  DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.entertainments_item, parent, false);
        View view = binding.getRoot();
        return new ViewhHolder(view, binding);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewhHolder holder, int position) {
        holder.img.setImageResource(dataholder.get(position).getImage());
        holder.header.setText(dataholder.get(position).getHeader());

       holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewModelEntertaiments.gooNewActivity(context,position);
            }

        });

    }


    @Override
    public int getItemCount() {
        return dataholder.size();
    }

    class ViewhHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView header;
        public ViewhHolder(@NonNull View itemView, EntertainmentsItemBinding binding) {
            super(itemView);
            img=binding.img1;
            header=binding.t1;
        }
    }


}
