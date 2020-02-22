package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class AnimalArrayAdapter extends ArrayAdapter<Animal> {
    private Context context;
    private int resource;

    public AnimalArrayAdapter(@NonNull Context context, int resource, @NonNull List<Animal> objects) {
        super(context, resource, objects);

        this.context = context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // collect data
        String image = getItem(position).getImage();
        String name = getItem(position).getName();
        String details = getItem(position).getDetails();

        // get context using layout-inflater
        LayoutInflater inflater = LayoutInflater.from(this.context);
        convertView = inflater.inflate(this.resource, parent, false);

        // find view
        ImageView animalImage = convertView.findViewById(R.id.animal_img_id);
        TextView animalName = convertView.findViewById(R.id.animal_txt_title_id);
        TextView animaldetails = convertView.findViewById(R.id.animal_txt_details_id);

        // set data
        int imageId = animalImage.getContext().getResources().getIdentifier(image, "drawable", context.getPackageName());
        animalImage.setImageResource(imageId);

        animalName.setText(name);
        animaldetails.setText(details);

        return convertView;
    }
}
