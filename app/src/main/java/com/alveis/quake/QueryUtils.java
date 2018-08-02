package com.alveis.quake;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class QueryUtils {
    public static final String SAMPLE_JSON_RESPONSE = "{}";

    private    QueryUtils(){

    }
    public static ArrayList<EarthQuake> extractEarthquakes(){
        ArrayList<EarthQuake> earthQuakes = new ArrayList<>();
        try {
            JSONObject baseJSONResponse = new JSONObject(SAMPLE_JSON_RESPONSE);
            JSONArray earthquakeArray = baseJSONResponse.getJSONArray("features");
            for (int i = 0; i < earthquakeArray.length(); i++){
                JSONObject currentEarthquake = earthquakeArray.getJSONObject(i);
                JSONObject properties = currentEarthquake.getJSONObject("properties");
                String mag = properties.getString("mag");
                String location = properties.getString("place");
                String time = properties.getString("time");

                //create a new earthquake object from the strings
                EarthQuake earthQuake = new EarthQuake(mag, location, time);
                earthQuakes.add(earthQuake);
            }
        }catch (JSONException e){
            Log.e("QueryUtils", "problem parsing the earthquake json", e);
        }
        return earthQuakes;
    }
}
