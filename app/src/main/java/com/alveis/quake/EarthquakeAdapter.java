package com.alveis.quake;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

public class EarthquakeAdapter extends ArrayAdapter<EarthQuake>{

    public EarthquakeAdapter(Context context, List<EarthQuake> earthQuakes){
        super(context, 0, earthQuakes);
    }

//    @Override
//    public View getView(int position, View convertView, ViewGroup parent){
//        View listItemView = convertView;
//        if (listItemView == null){
//            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.e)
//        }
//    }
}
