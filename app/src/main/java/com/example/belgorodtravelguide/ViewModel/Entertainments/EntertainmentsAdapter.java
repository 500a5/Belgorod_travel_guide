package com.example.belgorodtravelguide.ViewModel.Entertainments;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.belgorodtravelguide.Model.Entertainments.EntertainmentsDataModel;
import com.example.belgorodtravelguide.R;
import com.example.belgorodtravelguide.View.Entertainments.CafeActivity;
import com.example.belgorodtravelguide.View.Entertainments.MoveActivity;
import com.example.belgorodtravelguide.View.Entertainments.ParkActivity;
import com.example.belgorodtravelguide.View.Entertainments.ShoppingCenterActivity;
import com.example.belgorodtravelguide.View.Entertainments.TheaterActivity;

import java.util.ArrayList;

public class EntertainmentsAdapter extends RecyclerView.Adapter<EntertainmentsAdapter.ViewhHolder> {


    ArrayList<EntertainmentsDataModel> dataholder;
    private  Context context;

    public EntertainmentsAdapter(ArrayList<EntertainmentsDataModel> dataholder, Context context) {
        this.dataholder = dataholder;
        this.context=context;
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
                Intent intent;
                switch (position){
                    case 0:
                        intent = new Intent(context, MoveActivity.class);
                        context.startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(context, CafeActivity.class);
                        context.startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(context, ShoppingCenterActivity.class);
                        context.startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(context, ParkActivity.class);
                        context.startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(context, TheaterActivity.class);
                        context.startActivity(intent);
                        break;

                }

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
