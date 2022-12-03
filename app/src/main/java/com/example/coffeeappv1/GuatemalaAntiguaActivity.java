package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GuatemalaAntiguaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guatemala_antigua);
    }

    public void buttonPressDecaffeinatedEspressoRoast(View view) {
        Intent intent = new Intent(this, DecaffeinatedEspressoRoastActivity.class);
        startActivity(intent);
    }

    public void buttonPressBreakfastBlend(View view) {
        Intent intent = new Intent(this, BreakfastBlendActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicOakStreetBlend(View view) {
        Intent intent = new Intent(this, OrganicOakStreetBlendActivity.class);
        startActivity(intent);
    }

    public void buttonPressViennaDark(View view) {
        Intent intent = new Intent(this, ViennaDarkActivity.class);
        startActivity(intent);
    }

    public void buttonPressEspressoClassico(View view) {
        Intent intent = new Intent(this, EspressoClassicoActivity.class);
        startActivity(intent);
    }
}