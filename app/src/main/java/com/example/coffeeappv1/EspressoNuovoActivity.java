package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EspressoNuovoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_espresso_nuovo);
    }
    public void buttonPressRivieraFrench(View view) {
        Intent intent = new Intent(this, RivieraFrenchActivity.class);
        startActivity(intent);
    }

    public void buttonPressMajesticBlend(View view) {
        Intent intent = new Intent(this, MajesticBlendActivity.class);
        startActivity(intent);
    }

    public void buttonPressCaramelNutFudge(View view) {
        Intent intent = new Intent(this, CaramelNutFudgeActivity.class);
        startActivity(intent);
    }

    public void buttonPressDecaffeinatedEspressoRoast(View view) {
        Intent intent = new Intent(this, DecaffeinatedEspressoRoastActivity.class);
        startActivity(intent);
    }

    public void buttonPressMidnightRoyale(View view) {
        Intent intent = new Intent(this, MidnightRoyaleActivity.class);
        startActivity(intent);
    }
}