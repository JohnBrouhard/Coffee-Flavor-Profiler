package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OrganicItalianRoastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organic_italian_roast);
    }

    public void buttonPressDecaffeinatedFrenchRoastClassic(View view) {
        Intent intent = new Intent(this, DecaffeinatedFrenchRoastClassicActivity.class);
        startActivity(intent);
    }

    public void buttonPressPresidentsPrivateBlend(View view) {
        Intent intent = new Intent(this, PresidentsPrivateBlendActivity.class);
        startActivity(intent);
    }

    public void buttonPressItalianRoastClassic(View view) {
        Intent intent = new Intent(this, ItalianRoastClassicActivity.class);
        startActivity(intent);
    }

    public void buttonPressHawaiianGoldenBlend(View view) {
        Intent intent = new Intent(this, HawaiianGoldenBlendActivity.class);
        startActivity(intent);
    }

    public void buttonPressWestsideBlend(View view) {
        Intent intent = new Intent(this, WestsideBlendActivity.class);
        startActivity(intent);
    }
}