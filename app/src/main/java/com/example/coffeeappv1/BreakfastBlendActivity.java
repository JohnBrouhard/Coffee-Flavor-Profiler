package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

public class BreakfastBlendActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast_blend);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    public void buttonPressOrganicOakStreetBlend(View view) {
        Intent intent = new Intent(this, OrganicOakStreetBlendActivity.class);
        startActivity(intent);
    }

    public void buttonPressMajesticBlend(View view) {
        Intent intent = new Intent(this, MajesticBlendActivity.class);
        startActivity(intent);
    }

    public void buttonPressEspressoClassico(View view) {
        Intent intent = new Intent(this, EspressoClassicoActivity.class);
        startActivity(intent);
    }

    public void buttonPressDecaffeinatedEspressoRoast(View view) {
        Intent intent = new Intent(this, DecaffeinatedEspressoRoastActivity.class);
        startActivity(intent);
    }

    public void buttonPressEuropeanRoyale(View view) {
        Intent intent = new Intent(this, EuropeanRoyaleActivity.class);
        startActivity(intent);
    }
}