package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

public class EspressoClassicoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_espresso_classico);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    public void buttonPressVanillaMacadamiaNut(View view) {
        Intent intent = new Intent(this, VanillaMacadamiaNutActivity.class);
        startActivity(intent);
    }

    public void buttonPressVanillaNutCream(View view) {
        Intent intent = new Intent(this, VanillaNutCreamActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicFairTradeRendezvousBrew(View view) {
        Intent intent = new Intent(this, OrganicFairTradeRendezvousBrewActivity.class);
        startActivity(intent);
    }

    public void buttonPressCostaRicaLaEstrella(View view) {
        Intent intent = new Intent(this, CostaRicaLaEstrellaActivity.class);
        startActivity(intent);
    }

    public void buttonPressBarbaryCoastBlend(View view) {
        Intent intent = new Intent(this, BarbaryCoastBlendActivity.class);
        startActivity(intent);
    }
}
