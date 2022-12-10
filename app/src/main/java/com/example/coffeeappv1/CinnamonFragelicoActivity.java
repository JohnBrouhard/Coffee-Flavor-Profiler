package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

public class CinnamonFragelicoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinnamon_fragelico);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }
    
    public void buttonPressDecaffeinatedHazelnut(View view) {
        Intent intent = new Intent(this, DecaffeinatedHazelnutActivity.class);
        startActivity(intent);
    }

    public void buttonPressHazelnut(View view) {
        Intent intent = new Intent(this, HazelnutActivity.class);
        startActivity(intent);
    }

    public void buttonPressCaramelNutFudge(View view) {
        Intent intent = new Intent(this, CaramelNutFudgeActivity.class);
        startActivity(intent);
    }

    public void buttonPressCinnamonNutSugarCookie(View view) {
        Intent intent = new Intent(this, CinnamonNutSugarCookieActivity.class);
        startActivity(intent);
    }

    public void buttonPressCinnamonBun(View view) {
        Intent intent = new Intent(this, CinnamonBunActivity.class);
        startActivity(intent);
    }
}
