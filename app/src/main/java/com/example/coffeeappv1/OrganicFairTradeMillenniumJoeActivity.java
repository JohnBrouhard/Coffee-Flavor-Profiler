package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OrganicFairTradeMillenniumJoeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organic_fair_trade_millennium_joe);
    }

    public void buttonPressOrganicFrenchRoast(View view) {
        Intent intent = new Intent(this, OrganicFrenchRoastActivity.class);
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