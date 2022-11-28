package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

public class LightRoastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_light_roast);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    public void buttonPress1(View view) {
        Intent intent = new Intent(this, BreakfastBlendActivity.class);
        startActivity(intent);
    }

    public void buttonPress2(View view) {
        Intent intent = new Intent(this, ColombiaFrenchActivity.class);
        startActivity(intent);
    }

    public void buttonPress3(View view) {
        Intent intent = new Intent(this, ColombiaReserveActivity.class);
        startActivity(intent);
    }

    public void buttonPress4(View view) {
        Intent intent = new Intent(this, CostaRicaLaEstrellaActivity.class);
        startActivity(intent);
    }

    public void buttonPress5(View view) {
        Intent intent = new Intent(this, EthiopiaMokaActivity.class);
        startActivity(intent);
    }
}