package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ItalianRoastClassicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian_roast_classic);
    }

    public void buttonPressFrenchRoastDarkItalian(View view) {
        Intent intent = new Intent(this, FrenchRoastDarkItalianActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicItalianRoast(View view) {
        Intent intent = new Intent(this, OrganicItalianRoastActivity.class);
        startActivity(intent);
    }

    public void buttonPressWestsideBlend(View view) {
        Intent intent = new Intent(this, WestsideBlendActivity.class);
        startActivity(intent);
    }

    public void buttonPressRivieraFrench(View view) {
        Intent intent = new Intent(this, RivieraFrenchActivity.class);
        startActivity(intent);
    }

    public void buttonPressPresidentsPrivateBlend(View view) {
        Intent intent = new Intent(this, PresidentsPrivateBlendActivity.class);
        startActivity(intent);
    }
}