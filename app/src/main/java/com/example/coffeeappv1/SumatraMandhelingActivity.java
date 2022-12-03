package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SumatraMandhelingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumatra_mandheling);
    }

    public void buttonPressMidnightRoyale(View view) {
        Intent intent = new Intent(this, MidnightRoyaleActivity.class);
        startActivity(intent);
    }

    public void buttonPressEuropeanRoyale(View view) {
        Intent intent = new Intent(this, EuropeanRoyaleActivity.class);
        startActivity(intent);
    }

    public void buttonPressFrenchRoastClassic(View view) {
        Intent intent = new Intent(this, FrenchRoastClassicActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicBalthazarBlend(View view) {
        Intent intent = new Intent(this, OrganicBalthazarBlendActivity.class);
        startActivity(intent);
    }

    public void buttonPressMokaJavaDark(View view) {
        Intent intent = new Intent(this, MokaJavaDarkActivity.class);
        startActivity(intent);
    }
}