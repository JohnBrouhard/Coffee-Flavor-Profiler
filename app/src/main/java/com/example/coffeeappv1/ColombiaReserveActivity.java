package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

public class ColombiaReserveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colombia_reserve);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    public void buttonPressDecaffeinatedColombia(View view) {
        Intent intent = new Intent(this, DecaffeinatedColombiaActivity.class);
        startActivity(intent);
    }

    public void buttonPressHawaiianGoldenBlend(View view) {
        Intent intent = new Intent(this, HawaiianGoldenBlendActivity.class);
        startActivity(intent);
    }

    public void buttonPressCinnamonBun(View view) {
        Intent intent = new Intent(this, CinnamonBunActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicWPDecafMexico(View view) {
        Intent intent = new Intent(this, OrganicWPDecafMexicoActivity.class);
        startActivity(intent);
    }

    public void buttonPressMajesticBlend(View view) {
        Intent intent = new Intent(this, MajesticBlendActivity.class);
        startActivity(intent);
    }
}