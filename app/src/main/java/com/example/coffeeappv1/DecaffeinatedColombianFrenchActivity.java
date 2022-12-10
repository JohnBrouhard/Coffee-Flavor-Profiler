package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

public class DecaffeinatedColombianFrenchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decaffeinated_colombian_french);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    public void buttonPressColombiaFrench(View view) {
        Intent intent = new Intent(this, ColombiaFrenchActivity.class);
        startActivity(intent);
    }

    public void buttonPressPresidentsPrivateBlend(View view) {
        Intent intent = new Intent(this, PresidentsPrivateBlendActivity.class);
        startActivity(intent);
    }

    public void buttonPressFrenchRoastClassic(View view) {
        Intent intent = new Intent(this, FrenchRoastClassicActivity.class);
        startActivity(intent);
    }

    public void buttonPressDecaffeinatedFrenchRoastClassic(View view) {
        Intent intent = new Intent(this, DecaffeinatedFrenchRoastClassicActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicRoadWarriorBlend(View view) {
        Intent intent = new Intent(this, OrganicRoadWarriorBlendActivity.class);
        startActivity(intent);
    }
}
