package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

public class CinnamonNutSugarCookieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinnamon_nut_sugar_cookie);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    public void buttonPressVanillaNutCream(View view) {
        Intent intent = new Intent(this, VanillaNutCreamActivity.class);
        startActivity(intent);
    }

    public void buttonPressDecaffeinatedVanillaNutCream(View view) {
        Intent intent = new Intent(this, DecaffeinatedVanillaNutCreamActivity.class);
        startActivity(intent);
    }

    public void buttonPressCinnamonBun(View view) {
        Intent intent = new Intent(this, CinnamonBunActivity.class);
        startActivity(intent);
    }

    public void buttonPressFrenchVanilla(View view) {
        Intent intent = new Intent(this, FrenchVanillaActivity.class);
        startActivity(intent);
    }

    public void buttonPressCinnamonFrangelico(View view) {
        Intent intent = new Intent(this, CinnamonFrangelicoActivity.class);
        startActivity(intent);
    }
}
