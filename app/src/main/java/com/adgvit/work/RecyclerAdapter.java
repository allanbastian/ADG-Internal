package com.adgvit.work;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

/**
 * Created by Allan on 22-06-2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private LayoutInflater inflater;
    List<Item> data = Collections.emptyList();
    public RecyclerAdapter(Context context, List<Item> data) {
        inflater = LayoutInflater.from(context);
        this.data = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup container, int viewType) {
        View view = inflater.inflate(R.layout.row_layout, container, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Item current = data.get(position);
        holder.Day.setText(current.Day);
        holder.Date.setText(current.Date);
        holder.Work.setText(current.Work);
        holder.Name.setText(current.Name);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView Day, Date, Work, Name;
        public MyViewHolder(View itemView) {
            super(itemView);
            Day = (TextView) itemView.findViewById(R.id.day);
            Date = (TextView) itemView.findViewById(R.id.date);
            Work = (TextView) itemView.findViewById(R.id.work);
            Name = (TextView) itemView.findViewById(R.id.name);
        }
    }
}