package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HeritageBlendActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heritage_blend);
    }

    public void buttonPressKenyaAA(View view) {
        Intent intent = new Intent(this, KenyaAAActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicCostaRicaLasLajasHoneyMiel(View view) {
        Intent intent = new Intent(this, OrganicCostaRicaLasLajasHoneyMielActivity.class);
        startActivity(intent);
    }

}