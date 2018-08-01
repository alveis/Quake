package com.alveis.quake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {
    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earthquake);

        //dummy earthquake locations
        ArrayList<EarthQuake> earthquakes = new ArrayList<>();
        earthquakes.add(new EarthQuake("7.2","San Francisco","february 2, 2016"));
        earthquakes.add(new EarthQuake("6.1","London", "july 20, 2015"));
        earthquakes.add(new EarthQuake("4.4","Tokyo", "may 1, 1970"));
        earthquakes.add(new EarthQuake("5.2", "Mexico City", "jun 12, 1960"));
        earthquakes.add(new EarthQuake("9.2", "Moscow", "aug 0, 1991"));
        earthquakes.add(new EarthQuake("9.1","Rio de Janeiro","Jan 1, 2011"));
        earthquakes.add(new EarthQuake("2.2","Paris","april 2, 2010"));

        ListView earthquakeListView = (ListView) findViewById(R.id.list);
        EarthquakeAdapter adapter = new EarthquakeAdapter(this,earthquakes);
        earthquakeListView.setAdapter(adapter);
    }
}
