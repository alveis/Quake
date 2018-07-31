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
        ArrayList<String> earthquake = new ArrayList<>();
        earthquake.add("San Francisco");
        earthquake.add("London");
        earthquake.add("Tokyo");
        earthquake.add("Mexico City");
        earthquake.add("Moscow");
        earthquake.add("Rio de Janeiro");
        earthquake.add("Paris");

        ListView earthquakeListView = (ListView) findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayList<>(this, android.R.layout.simple_list_item_1, earthquake);
        earthquakeListView.setAdapter(adapter);
    }
}
