package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

public class DecaffeinatedEuropeanRoyale extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decaffeinated_european_royale);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    public void buttonPressEuropeanRoyale(View view) {
        Intent intent = new Intent(this, EuropeanRoyaleActivity.class);
        startActivity(intent);
    }

    public void buttonPressDecaffeinatedColombia(View view) {
        Intent intent = new Intent(this, DecaffeinatedColombiaActivity.class);
        startActivity(intent);
    }

    public void buttonPressMajesticBlend(View view) {
        Intent intent = new Intent(this, MajesticBlendActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicFairTradeRendezvousBrew(View view) {
        Intent intent = new Intent(this, OrganicFairTradeRendezvousBrewActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicPeru(View view) {
        Intent intent = new Intent(this, OrganicPeruActivity.class);
        startActivity(intent);
    }
}
