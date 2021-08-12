package com.example.belgorodtravelguide.View.Entertainments.EntertainmentsActivity.ShoppingCenter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.belgorodtravelguide.Model.Entertainments.ShoppingCenter.ShoppingCenterDataModel;
import com.example.belgorodtravelguide.R;
import com.example.belgorodtravelguide.databinding.ObjectEntertainmentsItemBinding;

import java.util.ArrayList;

public class ShoppingCenterAdapter extends RecyclerView.Adapter<ShoppingCenterAdapter.ViewhHolder> {


    ArrayList<ShoppingCenterDataModel> dataholder;
    private  Context context;

    public ShoppingCenterAdapter(ArrayList<ShoppingCenterDataModel> dataholder, Context context) {
        this.dataholder = dataholder;
        this.context=context;
    }

    @NonNull

    @Override
    public ViewhHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        ObjectEntertainmentsItemBinding binding =  DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.object_entertainments_item, parent, false);
        View view = binding.getRoot();
        return new ViewhHolder(view,binding);
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
        public ViewhHolder(@NonNull View itemView, ObjectEntertainmentsItemBinding binding) {
            super(itemView);
            img=binding.img1;
            header=binding.t1;

        }
    }


}
