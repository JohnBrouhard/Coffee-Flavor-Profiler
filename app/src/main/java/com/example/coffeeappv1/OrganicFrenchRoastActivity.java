package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OrganicFrenchRoastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organic_french_roast);
    }

    public void buttonPressOrganicFairTradeMillenniumJoe(View view) {
        Intent intent = new Intent(this, OrganicFairTradeMillenniumJoeActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicWPDecafItalianRoast(View view) {
        Intent intent = new Intent(this, OrganicWPDecafItalianRoastActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicWPDecafFairTradeFrenchRoast(View view) {
        Intent intent = new Intent(this, OrganicWPDecafFairTradeFrenchRoastActivity.class);
        startActivity(intent);
    }

    public void buttonPressPresidentsPrivateBlend(View view) {
        Intent intent = new Intent(this, PresidentsPrivateBlendActivity.class);
        startActivity(intent);
    }
}