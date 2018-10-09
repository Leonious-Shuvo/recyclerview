package com.example.shubratodev.recyclerviewwithgridview.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.shubratodev.recyclerviewwithgridview.R;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHoleder> {

    private Context context;
    private int images[];
    private String names[];

    public MyAdapter(Context context, int[] images, String[] names) {
        this.context = context;
        this.images = images;
        this.names = names;
    }

    @NonNull
    @Override
    public MyHoleder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_layout,null);
        MyHoleder myHoleder = new MyHoleder(layout);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHoleder holder, int position) {

        holder.img.setImageResource(images[position]);
        holder.txt.setText(names[position]);

    }

    @Override
    public int getItemCount() {
        return names.length;
    }

    public  static  class MyHoleder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView txt;
        public MyHoleder(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.prothomaloi);
            txt = itemView.findViewById(R.id.prothomalot);

        }
    }

}
