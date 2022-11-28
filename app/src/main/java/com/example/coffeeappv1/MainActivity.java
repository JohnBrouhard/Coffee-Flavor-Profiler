package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    public void buttonPressLightRoast(View view) {
        Intent intent = new Intent(this, LightRoastActivity.class);
        startActivity(intent);
    }

    public void buttonPressDarkRoast(View view) {
        Intent intent = new Intent(this, DarkRoastActivity.class);
        startActivity(intent);
    }

    public void buttonPressRegion(View view) {
        Intent intent = new Intent(this, RegionActivity.class);
        startActivity(intent);
    }

    public void buttonPressFlavorProfiles(View view) {
        Intent intent = new Intent(this, FlavorProfilesActivity.class);
        startActivity(intent);
    }

    public void buttonPressSearch(View view) {
        Intent intent = new Intent(this, SearchActivity.class);
        startActivity(intent);
    }
}