package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OrganicEspressoMaranelloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organic_espresso_maranello);
    }

    public void buttonPressBreakfastBlend(View view) {
        Intent intent = new Intent(this, BreakfastBlendActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicOakStreetBlend(View view) {
        Intent intent = new Intent(this, OrganicOakStreetBlendActivity.class);
        startActivity(intent);
    }

    public void buttonPressMidnightRoyale(View view) {
        Intent intent = new Intent(this, MidnightRoyaleActivity.class);
        startActivity(intent);
    }

    public void buttonPressEuropeanRoyale(View view) {
        Intent intent = new Intent(this, EuropeanRoyaleActivity.class);
        startActivity(intent);
    }

    public void buttonPressFrenchRoastClassic(View view) {
        Intent intent = new Intent(this, FrenchRoastClassicActivity.class);
        startActivity(intent);
    }
}