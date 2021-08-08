package com.example.belgorodtravelguide.ViewModel.Shop;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.belgorodtravelguide.Model.Shop.ShopDataModel;
import com.example.belgorodtravelguide.R;
import com.example.belgorodtravelguide.View.MainActivity;

import java.util.ArrayList;

public class ShopAdapter extends RecyclerView.Adapter<ShopAdapter.ViewhHolder> {


    ArrayList<ShopDataModel> dataholder;
    private  Context context;
    public ShopAdapter(ArrayList<ShopDataModel> dataholder, Context context) {
        this.dataholder = dataholder;
        this.context=context;
    }

    @NonNull

    @Override
    public ViewhHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.shop_sport_item,parent,false);
        return new ViewhHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewhHolder holder, int position) {
        holder.img.setImageResource(dataholder.get(position).getImage());
        holder.body.setText(dataholder.get(position).getBody());
    }


    @Override
    public int getItemCount() {
        return dataholder.size();
    }

    class ViewhHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView prise, body;
        Button button, pointbutton;
        public ViewhHolder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.img1);
            prise=itemView.findViewById(R.id.t1);
            body=itemView.findViewById(R.id.t2);
            button=itemView.findViewById(R.id.button);

            pointbutton = itemView.findViewById(R.id.summpoint);


            itemView.findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int pos = getAdapterPosition();  // check if item still exists
                    if(pos != RecyclerView.NO_POSITION){
                        ShopDataModel clickedDataItem = dataholder.get(pos);
                        int prise = clickedDataItem.getPrise();
                        if (prise<= MainActivity.getpoint()){
                            MainActivity.setpoint(prise);

                        }
                        Toast.makeText(view.getContext(), "You clicked " + clickedDataItem.getPrise(), Toast.LENGTH_SHORT).show();
                    Log.d("deb", "ff" +pos+"fff" );

                    }
                }
            });
        }
    }

}