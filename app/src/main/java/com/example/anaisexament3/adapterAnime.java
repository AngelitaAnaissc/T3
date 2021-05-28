package com.example.anaisexament3;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adapterAnime extends RecyclerView.Adapter<adapterAnime.viewHolder> {

    List<animeClass> list;
    int[] images;

    public adapterAnime(List<animeClass> list, int[] images) {
        this.list = list;
        this.images = images;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new viewHolder(
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_list, parent, false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull adapterAnime.viewHolder holder, int position) {

        animeClass model = list.get(position);
        holder.name.setText(model.getNombre());
        holder.description.setText(model.getDescrip());
        holder.image.setImageResource(images[position]);

        holder.startId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!model.getState()){
                    holder.startId.setImageResource(R.drawable.ic_baseline_star_rate_24);
                    model.setState(true);
                }else {
                    holder.startId.setImageResource(R.drawable.ic_baseline_star_outline_24);
                    model.setState(false);
                }
            }
        });
    }
    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }
    @Override
    public int getItemCount() {
        return list.size();
    }

     static class viewHolder extends RecyclerView.ViewHolder {

        ImageView image, startId;
        TextView name, description;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            startId = itemView.findViewById(R.id.startId);
            name = itemView.findViewById(R.id.name);
            description = itemView.findViewById(R.id.description);
        }
    }
}
