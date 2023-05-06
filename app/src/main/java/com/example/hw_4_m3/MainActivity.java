package com.example.hw_4_m3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.hw_4_m3.model.Flower;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements FlowerClick{
    private ArrayList<Flower> arrayList;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flowerList();
        initAdapter();
    }

    private void flowerList() {
        arrayList = new ArrayList<>();
        arrayList.add(new Flower("Roses", 250, "red", R.drawable.ic_roses));
        arrayList.add(new Flower("Tulips", 180, "green", R.drawable.ic_tulips));
        arrayList.add(new Flower("Pions", 400, "yellow", R.drawable.ic_pions));
        arrayList.add(new Flower("Violets", 180, "black", R.drawable.ic_violets));
    }

    private void initAdapter() {
        recyclerView = findViewById(R.id.recyclerView);
        FlowerAdapter flowerAdapter = new FlowerAdapter(arrayList, this);
        recyclerView.setAdapter(flowerAdapter);
    }

    @Override
    public void flowerClicked(Flower flower) {
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra("FlowerAdapter", flower);
        startActivity(intent);
    }
}