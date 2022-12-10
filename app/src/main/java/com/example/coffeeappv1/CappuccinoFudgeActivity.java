package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

public class CappuccinoFudgeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cappuccino_fudge);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    public void buttonPressFrenchVanilla(View view) {
        Intent intent = new Intent(this, FrenchVanillaActivity.class);
        startActivity(intent);
    }

    public void buttonPressDarkChocolateTruffle(View view) {
        Intent intent = new Intent(this, DarkChocolateTruffleActivity.class);
        startActivity(intent);
    }

    public void buttonPressChocolateRaspberryCream(View view) {
        Intent intent = new Intent(this, ChocolateRaspberryCreamActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicOakStreetBlend(View view) {
        Intent intent = new Intent(this, OrganicOakStreetBlendActivity.class);
        startActivity(intent);
    }

    public void buttonPressFrenchRoastDarkItalian(View view) {
        Intent intent = new Intent(this, FrenchRoastDarkItalianActivity.class);
        startActivity(intent);
    }
}
