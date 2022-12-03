package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

public class CostaRicaLaEstrellaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_costa_rica_la_estrella);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    public void buttonPressColombiaReserve(View view) {
        Intent intent = new Intent(this, ColombiaReserveActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicMexico(View view) {
        Intent intent = new Intent(this, OrganicMexicoActivity.class);
        startActivity(intent);
    }

    public void buttonPressMajesticBlend(View view) {
        Intent intent = new Intent(this, MajesticBlendActivity.class);
        startActivity(intent);
    }

    public void buttonPressBreakfastBlend(View view) {
        Intent intent = new Intent(this, BreakfastBlendActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicOakStreetBlend(View view) {
        Intent intent = new Intent(this, OrganicOakStreetBlendActivity.class);
        startActivity(intent);
    }
}