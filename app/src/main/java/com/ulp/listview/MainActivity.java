package com.ulp.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import models.Property;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Property> properties = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        createList();
    }

    private void initialize(){
        properties.add(new Property("San Luis, colón 533", Double.parseDouble("145677"), R.drawable.prop_1));
        properties.add(new Property("La Punta, Los Molinos 1453", Double.parseDouble("6766"), R.drawable.prop_2));
        properties.add(new Property("Potrero de Los Funes, Carancho 456", Double.parseDouble("67766"), R.drawable.prop_3));
    }

    private void createList(){
        ArrayAdapter<Property> adapter = new PropertiesListAdapter(this, R.layout.item_card, properties, getLayoutInflater());
        ((ListView) findViewById(R.id.propListView)).setAdapter(adapter);
    }
}