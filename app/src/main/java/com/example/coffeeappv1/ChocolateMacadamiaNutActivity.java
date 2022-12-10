package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

public class ChocolateMacadamiaNutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chocolate_macadamia_nut);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    public void buttonPressEspressoNuovo(View view) {
        Intent intent = new Intent(this, EspressoNuovoActivity.class);
        startActivity(intent);
    }

    public void buttonPressKahluaCream(View view) {
        Intent intent = new Intent(this, KahluaCreamActivity.class);
        startActivity(intent);
    }

    public void buttonPressCinnamonNutSugarCookie(View view) {
        Intent intent = new Intent(this, CinnamonNutSugarCookieActivity.class);
        startActivity(intent);
    }

    public void buttonPressDecaffeinatedHazelnut(View view) {
        Intent intent = new Intent(this, DecaffeinatedHazelnutActivity.class);
        startActivity(intent);
    }

    public void buttonPressHotButteredRum(View view) {
        Intent intent = new Intent(this, HotButteredRumActivity.class);
        startActivity(intent);
    }
}
