package com.example.bucketlistapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PlacesActivity extends AppCompatActivity {

    ArrayList<BucketList> placesToGoBucketList = new ArrayList<>();
    int[] placesToGoImages = {R.drawable.banff_national_park_canada, R.drawable.disney_world,
    R.drawable.maldives_ari_atoll_resort, R.drawable.niagra_falls, R.drawable.palouse_washington,
    R.drawable.santorini_greece, R.drawable.skagit_valley_tulip_field, R.drawable.soneva_jani_maldives,
    R.drawable.switzerland, R.drawable.vik_beach_iceland, R.drawable.black_sand_beach_iceland};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        RecyclerView recyclerView = findViewById(R.id.recycler_view_places);
        setUpPlacesToGoBucketList();

        BucketListRecyclerViewAdapter adapter = new BucketListRecyclerViewAdapter(this, placesToGoBucketList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setUpPlacesToGoBucketList() {
        String[] names = getResources().getStringArray(R.array.places_names);
        String[] descriptions = getResources().getStringArray(R.array.places_description);

        for (int i = 0; i < names.length; i++) {
            placesToGoBucketList.add(new BucketList(names[i], descriptions[i], placesToGoImages[i]));
        }
    }
}