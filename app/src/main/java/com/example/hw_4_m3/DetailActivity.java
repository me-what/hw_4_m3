package com.example.hw_4_m3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hw_4_m3.model.Flower;

public class DetailActivity extends AppCompatActivity {
    private ImageView image;
    private TextView name, color, sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        detailUI();
        getOrSetObject();
    }

    private void detailUI() {
        image = findViewById(R.id.image);
        name = findViewById(R.id.name);
        color = findViewById(R.id.color);
        sum = findViewById(R.id.sum);
    }

    private void getOrSetObject() {
        Flower flower = (Flower) getIntent().getSerializableExtra("FlowerAdapter");
        image.setImageResource(flower.getImage());
        name.setText(flower.getName());
        color.setText(String.valueOf(flower.getSum()));
        sum.setText(flower.getColor());
    }
}