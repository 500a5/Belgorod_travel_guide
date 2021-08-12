package com.example.belgorodtravelguide.View.News;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.belgorodtravelguide.Model.News.NewsDataModel;
import com.example.belgorodtravelguide.R;
import com.example.belgorodtravelguide.databinding.FragmentNewsBinding;
import com.example.belgorodtravelguide.databinding.NewsItemBinding;

import java.util.ArrayList;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewhHolder>  {


    ArrayList<NewsDataModel> dataholder;
    private  Context context;
    private InterfaceNews.ViewModelNews viewModelNews;

    public NewsAdapter(ArrayList<NewsDataModel> dataholder, Context context, InterfaceNews.ViewModelNews viewModelNews) {
        this.dataholder = dataholder;
        this.context=context;
        this.viewModelNews=viewModelNews;
    }

    @NonNull

    @Override
    public ViewhHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        NewsItemBinding binding=  DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.news_item, parent, false);
        View view = binding.getRoot();
        return new ViewhHolder(view, binding);
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
        public ViewhHolder(@NonNull View itemView ,NewsItemBinding binding) {
            super(itemView);
            img=binding.img1;
            header=binding.t1;
            body=binding.t2;

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                   viewModelNews.gooToSite(context);
                }

            });
        }
    }


}
