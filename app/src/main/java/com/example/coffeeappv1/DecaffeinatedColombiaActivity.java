package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

public class DecaffeinatedColombiaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decaffeinated_colombia);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    public void buttonPressOrganicMexico(View view) {
        Intent intent = new Intent(this, OrganicMexicoActivity.class);
        startActivity(intent);
    }

    public void buttonPressDecaffeinatedEuropeanRoyale(View view) {
        Intent intent = new Intent(this, DecaffeinatedEuropeanRoyaleActivity.class);
        startActivity(intent);
    }

    public void buttonPressFrenchRoastDarkItalian(View view) {
        Intent intent = new Intent(this, FrenchRoastDarkItalianActivity.class);
        startActivity(intent);
    }

    public void buttonPressHawaiianGoldenBlend(View view) {
        Intent intent = new Intent(this, HawaiianGoldenBlendActivity.class);
        startActivity(intent);
    }

    public void buttonPressDecaffeinatedFrenchRoastClassic(View view) {
        Intent intent = new Intent(this, DecaffeinatedFrenchRoastClassicActivity.class);
        startActivity(intent);
    }
}
