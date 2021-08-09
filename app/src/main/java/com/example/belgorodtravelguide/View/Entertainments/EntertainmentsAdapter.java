package com.example.belgorodtravelguide.View.Entertainments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.belgorodtravelguide.Model.Entertainments.EntertainmentsDataModel;
import com.example.belgorodtravelguide.R;

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
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.entertainments_item,parent,false);
        return new ViewhHolder(view);
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
        public ViewhHolder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.img1);
            header=itemView.findViewById(R.id.t1);
        }
    }


}
