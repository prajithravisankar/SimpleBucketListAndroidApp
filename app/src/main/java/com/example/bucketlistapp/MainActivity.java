package com.example.bucketlistapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    CardView placesCard;
    CardView activitiesCard;
    CardView healthAndFitnessCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        setupListeners();
    }

    private void setupListeners() {
        placesCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // go to places recycler view activity
                Intent intent = new Intent(MainActivity.this, PlacesActivity.class);
                startActivity(intent);
            }
        });

        activitiesCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // go to activities recycler view activity
                Intent intent = new Intent(MainActivity.this, ActivitiesActivity.class);
                startActivity(intent);
            }
        });

        healthAndFitnessCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // go to health and fitness recycler view activity
                Intent intent = new Intent(MainActivity.this, HealthFitnessActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initialize() {
        placesCard = findViewById(R.id.card_view_places_to_visit);
        activitiesCard = findViewById(R.id.card_view_activities);
        healthAndFitnessCard = findViewById(R.id.card_view_health);
    }
}