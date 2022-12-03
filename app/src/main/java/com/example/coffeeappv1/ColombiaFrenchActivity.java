package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

public class ColombiaFrenchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colombia_french);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    public void buttonPressDecaffeinatedColombiaFrench(View view) {
        Intent intent = new Intent(this, DecaffeinatedColombianFrenchActivity.class);
        startActivity(intent);
    }

    public void buttonPressDecaffeinatedEuropeanRoyale(View view) {
        Intent intent = new Intent(this, DecaffeinatedEuropeanRoyale.class);
        startActivity(intent);
    }

    public void buttonPressOrganicWPDecafMexico(View view) {
        Intent intent = new Intent(this, OrganicWPDecafMexicoActivity.class);
        startActivity(intent);
    }

    public void buttonPressHotButteredRum(View view) {
        Intent intent = new Intent(this, HotButteredRumActivity.class);
        startActivity(intent);
    }

    public void buttonPressColombiaReserveDark(View view) {
        Intent intent = new Intent(this, ColombiaReserveDarkActivity.class);
        startActivity(intent);
    }
}