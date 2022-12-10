package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GuatemalaAntiguaDarkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guatemala_antigua_dark);
    }

    public void buttonPressMokaJavaDark(View view) {
        Intent intent = new Intent(this, MokaJavaDarkActivity.class);
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

    public void buttonPressColombiaReserveDark(View view) {
        Intent intent = new Intent(this, ColombiaReserveDarkActivity.class);
        startActivity(intent);
    }

    public void buttonPressDecaffeinatedEuropeanRoyale(View view) {
        Intent intent = new Intent(this, DecaffeinatedEuropeanRoyale.class);
        startActivity(intent);
    }
}