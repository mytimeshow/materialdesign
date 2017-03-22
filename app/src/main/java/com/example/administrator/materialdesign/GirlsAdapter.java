package com.example.administrator.materialdesign;

import android.content.Context;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by Administrator on 2017/3/22 0022.
 */

public class GirlsAdapter extends RecyclerView.Adapter<GirlsAdapter.ViewHolder>{
    private Context context;
    private List<Girls> girlsList;
    public GirlsAdapter(List<Girls> girlsList){
        this.girlsList=girlsList;
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView textView;
        private CardView cardView;
        public ViewHolder(View itemView) {
            super(itemView);
            cardView= (CardView) itemView.findViewById(R.id.cardview);
            imageView= (ImageView) itemView.findViewById(R.id.imageview);
            textView= (TextView) itemView.findViewById(R.id.tv_name);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(context==null){
            context=parent.getContext();
        }
        View view= LayoutInflater.from(context).inflate(R.layout.girls_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(GirlsAdapter.ViewHolder holder, int position) {
            Girls girls=girlsList.get(position);
            holder.textView.setText(girls.getName());
        Glide.with(context).load(girls.getImgid()).into(holder.imageView);
    }



    @Override
    public int getItemCount() {
        return girlsList.size();
    }
}
