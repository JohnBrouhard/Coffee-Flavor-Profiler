package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KenyaAAActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kenya_aa);
    }

    public void buttonPressOrganicWPDecafMexico(View view) {
        Intent intent = new Intent(this, OrganicWPDecafMexicoActivity.class);
        startActivity(intent);
    }

    public void buttonPressDecaffeinatedColombia(View view) {
        Intent intent = new Intent(this, DecaffeinatedColombiaActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicMexico(View view) {
        Intent intent = new Intent(this, OrganicMexicoActivity.class);
        startActivity(intent);
    }

    public void buttonPressColombiaReserve(View view) {
        Intent intent = new Intent(this, ColombiaReserveActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicCostaRicaLasLajasHoneyMiel(View view) {
        Intent intent = new Intent(this, OrganicCostaRicaLasLajasHoneyMielActivity.class);
        startActivity(intent);
    }
}