package com.example.belgorodtravelguide.View.Entertainments.EntertainmentsActivity.Park;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.belgorodtravelguide.Model.Entertainments.Park.ParkDataModel;
import com.example.belgorodtravelguide.R;

import java.util.ArrayList;

public class ParkAdapter extends RecyclerView.Adapter<ParkAdapter.ViewhHolder> {


    ArrayList<ParkDataModel> dataholder;
    private  Context context;

    public ParkAdapter(ArrayList<ParkDataModel> dataholder, Context context) {
        this.dataholder = dataholder;
        this.context=context;
    }

    @NonNull

    @Override
    public ViewhHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.object_entertainments_item,parent,false);
        return new ViewhHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewhHolder holder, int position) {
        holder.img.setImageResource(dataholder.get(position).getImage());
        holder.header.setText(dataholder.get(position).getHeader());

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
