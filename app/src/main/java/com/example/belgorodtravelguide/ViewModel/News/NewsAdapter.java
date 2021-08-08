package com.example.belgorodtravelguide.ViewModel.News;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.belgorodtravelguide.Model.News.NewsDataModel;
import com.example.belgorodtravelguide.R;

import java.util.ArrayList;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewhHolder> {


    ArrayList<NewsDataModel> dataholder;
    private  Context context;

    public NewsAdapter(ArrayList<NewsDataModel> dataholder, Context context) {
        this.dataholder = dataholder;
        this.context=context;
    }

    @NonNull

    @Override
    public ViewhHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.news_item,parent,false);
        return new ViewhHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewhHolder holder, int position) {
        holder.img.setImageResource(dataholder.get(position).getImage());
        holder.header.setText(dataholder.get(position).getHeader());
        holder.body.setText(dataholder.get(position).getBody());
    }


    @Override
    public int getItemCount() {
        return dataholder.size();
    }

    class ViewhHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView header, body;
        public ViewhHolder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.img1);
            header=itemView.findViewById(R.id.t1);
            body=itemView.findViewById(R.id.t2);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Uri address = Uri.parse("https://www.google.ru/");
                    Intent intent = new Intent(Intent.ACTION_VIEW, address);
                    context.startActivity(intent);
                }

            });
        }
    }


}
