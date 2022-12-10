package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

public class CinnamonBunActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinnamon_bun);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    public void buttonPressCinnamonNutSugarCookie(View view) {
        Intent intent = new Intent(this, CinnamonNutSugarCookieActivity.class);
        startActivity(intent);
    }

    public void buttonPressCinnamonFrangelico(View view) {
        Intent intent = new Intent(this, CinnamonFrangelicoActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicFairTradeMillenniumJoe(View view) {
        Intent intent = new Intent(this, OrganicFairTradeMillenniumJoeActivity.class);
        startActivity(intent);
    }

    public void buttonPressChocolateRaspberryCream(View view) {
        Intent intent = new Intent(this, ChocolateRaspberryCreamActivity.class);
        startActivity(intent);
    }

    public void buttonPressDecaffeinatedEspressoRoast(View view) {
        Intent intent = new Intent(this, DecaffeinatedEspressoRoastActivity.class);
        startActivity(intent);
    }
}
