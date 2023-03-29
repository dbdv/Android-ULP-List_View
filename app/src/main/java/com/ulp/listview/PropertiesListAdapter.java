package com.ulp.listview;

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

import models.Property;

public class PropertiesListAdapter extends ArrayAdapter<Property> {

    private Context context;
    private List<Property> properties;
    private LayoutInflater inflator;


    public PropertiesListAdapter(@NonNull Context context, int resource, @NonNull List<Property> properties, LayoutInflater inflator) {
        super(context, resource, properties);
        this.context = context;
        this.properties = properties;
        this.inflator = inflator;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View itemView = convertView;

        if(itemView == null) itemView = inflator.inflate(R.layout.item_card, parent, false);

        Property property = properties.get(position);

        ((ImageView) itemView.findViewById(R.id.propImg)).setImageResource(property.getPhoto());
        ((TextView) itemView.findViewById(R.id.propAddress)).setText(property.getAddress());
        ((TextView) itemView.findViewById(R.id.propPrice)).setText("$ "+property.getPrice());

        return itemView;
    }
}
