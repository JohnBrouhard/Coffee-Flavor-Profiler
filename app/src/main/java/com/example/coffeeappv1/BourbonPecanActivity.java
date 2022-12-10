package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

public class BourbonPecanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bourbon_pecan);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    public void buttonPressVanillaMacadamiaNut(View view) {
        Intent intent = new Intent(this, VanillaMacadamiaNutActivity.class);
        startActivity(intent);
    }

    public void buttonPressDecaffeinatedVanillaNutCream(View view) {
        Intent intent = new Intent(this, DecaffeinatedVanillaNutCreamActivity.class);
        startActivity(intent);
    }

    public void buttonPressFrenchVanilla(View view) {
        Intent intent = new Intent(this, FrenchVanillaActivity.class);
        startActivity(intent);
    }

    public void buttonPressKahluaCream(View view) {
        Intent intent = new Intent(this, KahluaCreamActivity.class);
        startActivity(intent);
    }

    public void buttonPressCaramelNutFudge(View view) {
        Intent intent = new Intent(this, CaramelNutFudgeActivity.class);
        startActivity(intent);
    }
}
