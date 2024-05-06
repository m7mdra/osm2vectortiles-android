package com.roblabs.osm2vectortiles_android;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.mapbox.maps.MapView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a mapView
        MapView mapView = findViewById(R.id.mapview);
        mapView.getMapboxMap().loadStyle("asset://styles/geography-class-local.json");
    }


}
