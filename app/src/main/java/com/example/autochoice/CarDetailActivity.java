package com.example.autochoice;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CarDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_detail);

        ImageView carImageView = findViewById(R.id.car_image);
        TextView nameTextView = findViewById(R.id.car_name);
        TextView detailsTextView = findViewById(R.id.car_details);

        String carName = getIntent().getStringExtra("car_name");
        String carDetails = getIntent().getStringExtra("car_details");
        int carImage = getIntent().getIntExtra("car_image", 0);

        nameTextView.setText(carName);
        detailsTextView.setText(carDetails);
        carImageView.setImageResource(carImage);
    }
}