package com.example.bucketlistapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BucketListRecyclerViewAdapter extends RecyclerView.Adapter<BucketListRecyclerViewAdapter.MyViewHolder> {
    Context context;
    ArrayList<BucketList> bucketLists;

    public BucketListRecyclerViewAdapter(Context context, ArrayList<BucketList> bucketLists) {
        this.context = context;
        this.bucketLists = bucketLists;
    }

    @NonNull
    @Override
    public BucketListRecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate the layout and give the look to each of our rows. <don't understand still>
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_view_row, parent, false);
        return new BucketListRecyclerViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BucketListRecyclerViewAdapter.MyViewHolder holder, int position) {
        // As the item comes back on the view again, value reassigning happens based on position
        // of the item in the list.
        holder.name.setText(bucketLists.get(position).getName());
        holder.description.setText(bucketLists.get(position).getDescription());
        holder.image.setImageResource(bucketLists.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        // how many items we have in total.
        return bucketLists.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // grabbing all the view in the recycler view row (or the item we populate) and assigning
        // values to these views will be done here.
        // start here.
        ImageView image;
        TextView name;
        TextView description;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.recylcer_view_image);
            name = itemView.findViewById(R.id.recycler_view_name);
            description = itemView.findViewById(R.id.recycler_view_description);
        }
    }
}
