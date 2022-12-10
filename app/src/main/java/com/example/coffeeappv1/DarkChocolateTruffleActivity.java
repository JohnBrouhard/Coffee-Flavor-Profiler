package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

public class DarkChocolateTruffleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dark_chocolate_truffle);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }
    
    public void buttonPressBreakfastBlend(View view) {
        Intent intent = new Intent(this, BreakfastBlendActivity.class);
        startActivity(intent);
    }

    public void buttonPressWestsideBlend(View view) {
        Intent intent = new Intent(this, WestsideBlendActivity.class);
        startActivity(intent);
    }

    public void buttonPressJamaicaBlueMountainFancy(View view) {
        Intent intent = new Intent(this, JamaicaBlueMountainFancyActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicFairTradeRendezvousBrew(View view) {
        Intent intent = new Intent(this, OrganicFairTradeRendezvousBrewActivity.class);
        startActivity(intent);
    }

    public void buttonPressEuropeanRoyale(View view) {
        Intent intent = new Intent(this, EuropeanRoyaleActivity.class);
        startActivity(intent);
    }
}
