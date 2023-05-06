package com.example.hw_4_m3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.hw_4_m3.model.Flower;

import java.util.ArrayList;

public class FlowerAdapter extends RecyclerView.Adapter<FlowerAdapter.FlowerViewHolder> {
    ArrayList<Flower> flowerArrayList;
    FlowerClick flowerClick;

    public FlowerAdapter(ArrayList<Flower> arrayList, FlowerClick flowerClick) {
        this.flowerArrayList = arrayList;
        this.flowerClick = flowerClick;
    }

    @NonNull
    @Override
    public FlowerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FlowerViewHolder(
                LayoutInflater.from(
                                parent.getContext())
                        .inflate(R.layout.item_flower, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull FlowerViewHolder holder, int position) {
        holder.onBind(flowerArrayList.get(position));
        holder.itemView.setOnClickListener(view -> {
            flowerClick.flowerClicked(flowerArrayList.get(position));
        });
    }

    @Override
    public int getItemCount() {
        return flowerArrayList.size();
    }

    public static class FlowerViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public FlowerViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void onBind(Flower flower) {
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
            imageView.setImageResource(flower.getImage());
            textView.setText(flower.getName());
        }
    }
}
