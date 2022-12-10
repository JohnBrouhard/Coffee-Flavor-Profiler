package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OrganicBalthazarBlendActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organic_balthazar_blend);
    }
    public void buttonPressOrganicSumatraDark(View view) {
        Intent intent = new Intent(this, OrganicSumatraDarkActivity.class);
        startActivity(intent);
    }

    public void buttonPressMidnightRoyale(View view) {
        Intent intent = new Intent(this, MidnightRoyaleActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicFairTradeFrenchRoast(View view) {
        Intent intent = new Intent(this, OrganicFairTradeFrenchRoastActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicFrenchRoast(View view) {
        Intent intent = new Intent(this, OrganicFrenchRoastActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicFairTradeMillenniumJoe(View view) {
        Intent intent = new Intent(this, OrganicFairTradeMillenniumJoeActivity.class);
        startActivity(intent);
    }
}