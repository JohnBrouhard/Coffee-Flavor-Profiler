package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

public class ChocolateRasberryCreamActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chocolate_rasberry_cream);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }
    
    public void buttonPressOrganicFairTradeMillenniumJoe(View view) {
        Intent intent = new Intent(this, OrganicFairTradeMillenniumJoeActivity.class);
        startActivity(intent);
    }

    public void buttonPressDarkChocolateTruffle(View view) {
        Intent intent = new Intent(this, DarkChocolateTruffleActivity.class);
        startActivity(intent);
    }

    public void buttonPressItalianRoastClassic(View view) {
        Intent intent = new Intent(this, ItalianRoastClassicActivity.class);
        startActivity(intent);
    }

    public void buttonPressKahluaCream(View view) {
        Intent intent = new Intent(this, KahluaCreamActivity.class);
        startActivity(intent);
    }

    public void buttonPressVanillaMacadamiaNut(View view) {
        Intent intent = new Intent(this, VanillaMacadamiaNutActivity.class);
        startActivity(intent);
    }
}
