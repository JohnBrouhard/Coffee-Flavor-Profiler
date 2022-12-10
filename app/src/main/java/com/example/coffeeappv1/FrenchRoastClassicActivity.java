package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FrenchRoastClassicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_french_roast_classic);
    }

    public void buttonPressDecaffeinatedEuropeanRoyale(View view) {
        Intent intent = new Intent(this, DecaffeinatedEuropeanRoyale.class);
        startActivity(intent);
    }

    public void buttonPressOrganicSumatraDark(View view) {
        Intent intent = new Intent(this, OrganicSumatraDarkActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicItalianRoast(View view) {
        Intent intent = new Intent(this, OrganicItalianRoastActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicGorillaVanilla(View view) {
        Intent intent = new Intent(this, OrganicGorillaVanillaActivity.class);
        startActivity(intent);
    }
}