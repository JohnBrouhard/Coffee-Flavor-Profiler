package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

public class DarkRoastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dark_roast);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    public void buttonPressOrganicBalthazarBlend(View view) {
        Intent intent = new Intent(this, OrganicBalthazarBlendActivity.class);
        startActivity(intent);
    }

    public void buttonPressColombiaReserveDark(View view) {
        Intent intent = new Intent(this, ColombiaReserveDarkActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicEspressoMaranello(View view) {
        Intent intent = new Intent(this, OrganicEspressoMaranelloActivity.class);
        startActivity(intent);
    }

    public void buttonPressEspressoNuovo(View view) {
        Intent intent = new Intent(this, EspressoNuovoActivity.class);
        startActivity(intent);
    }

    public void buttonPressEuropeanRoyale(View view) {
        Intent intent = new Intent(this, EuropeanRoyaleActivity.class);
        startActivity(intent);
    }

    public void buttonPressFrenchRoastDarkItalian(View view) {
        Intent intent = new Intent(this, FrenchRoastDarkItalianActivity.class);
        startActivity(intent);
    }

    public void buttonPressFrenchRoastClassic(View view) {
        Intent intent = new Intent(this, FrenchRoastClassicActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicFrenchRoast(View view) {
        Intent intent = new Intent(this, OrganicFrenchRoastActivity.class);
        startActivity(intent);
    }

    public void buttonPressGuatemalaAntiguaDark(View view) {
        Intent intent = new Intent(this, GuatemalaAntiguaDarkActivity.class);
        startActivity(intent);
    }

    public void buttonPressItalianRoastClassic(View view) {
        Intent intent = new Intent(this, ItalianRoastClassicActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicItalianRoast(View view) {
        Intent intent = new Intent(this, OrganicItalianRoastActivity.class);
        startActivity(intent);
    }

    public void buttonPressMajesticBlend(View view) {
        Intent intent = new Intent(this, MajesticBlendActivity.class);
        startActivity(intent);
    }

    public void buttonPressMidnightRoyale(View view) {
        Intent intent = new Intent(this, MidnightRoyaleActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicFairTradeMillenniumJoe(View view) {
        Intent intent = new Intent(this, OrganicFairTradeMillenniumJoeActivity.class);
        startActivity(intent);
    }

    public void buttonPressMokaJavaDark(View view) {
        Intent intent = new Intent(this, MokaJavaDarkActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicSumatraDark(View view) {
        Intent intent = new Intent(this, OrganicSumatraDarkActivity.class);
        startActivity(intent);
    }

    public void buttonPressPresidentsPrivateBlend(View view) {
        Intent intent = new Intent(this, PresidentsPrivateBlendActivity.class);
        startActivity(intent);
    }

    public void buttonPressRivieraFrench(View view) {
        Intent intent = new Intent(this, RivieraFrenchActivity.class);
        startActivity(intent);
    }

}