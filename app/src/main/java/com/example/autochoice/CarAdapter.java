package com.example.autochoice;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.CarViewHolder> {
    private List<Car> carList;
    private Context context;

    public CarAdapter(List<Car> carList, Context context) {
        this.carList = carList;
        this.context = context;
    }

    @Override
    public CarViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_car, parent, false);
        return new CarViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CarViewHolder holder, int position) {
        Car car = carList.get(position);
        holder.nameTextView.setText(car.getName());
        holder.shortDescriptionTextView.setText(car.getShortDescription());
        holder.imageView.setImageResource(car.getImageResourceId());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, CarDetailActivity.class);
            intent.putExtra("car_name", car.getName());
            intent.putExtra("car_details", car.getDetails());
            intent.putExtra("car_image", car.getImageResourceId());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return carList.size();
    }

    static class CarViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView;
        TextView shortDescriptionTextView;
        ImageView imageView;

        CarViewHolder(View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.car_name);
            shortDescriptionTextView = itemView.findViewById(R.id.car_short_description);
            imageView = itemView.findViewById(R.id.car_image);
        }
    }
}