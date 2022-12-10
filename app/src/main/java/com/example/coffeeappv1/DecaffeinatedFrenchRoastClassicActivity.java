package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

public class DecaffeinatedFrenchRoastClassicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decaffeinated_french_roast_classic);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    public void buttonPressFrenchRoastClassic(View view) {
        Intent intent = new Intent(this, FrenchRoastClassicActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicFairTradeMillenniumJoe(View view) {
        Intent intent = new Intent(this, OrganicFairTradeMillenniumJoeActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicHawaiian(View view) {
        Intent intent = new Intent(this, OrganicHawaiianActivity.class);
        startActivity(intent);
    }

    public void buttonPressGuatemalaAntiguaDark(View view) {
        Intent intent = new Intent(this, GuatemalaAntiguaDarkActivity.class);
        startActivity(intent);
    }

    public void buttonPressDecaffeinatedColombia(View view) {
        Intent intent = new Intent(this, DecaffeinatedColombiaActivity.class);
        startActivity(intent);
    }
}
