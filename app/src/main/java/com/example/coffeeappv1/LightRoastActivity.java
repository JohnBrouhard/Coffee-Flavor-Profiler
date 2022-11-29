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

    public void buttonPressAmericanBreakfastBlend(View view) {
        Intent intent = new Intent(this, BreakfastBlendActivity.class);
        startActivity(intent);
    }

    public void buttonPressColombianFrench(View view) {
        Intent intent = new Intent(this, ColombiaFrenchActivity.class);
        startActivity(intent);
    }

    public void buttonPressColombiaReserve(View view) {
        Intent intent = new Intent(this, ColombiaReserveActivity.class);
        startActivity(intent);
    }

    public void buttonPressCostaRicaLaEstrella(View view) {
        Intent intent = new Intent(this, CostaRicaLaEstrellaActivity.class);
        startActivity(intent);
    }

    public void buttonPressEthiopianMoka(View view) {
        Intent intent = new Intent(this, EthiopiaMokaActivity.class);
        startActivity(intent);
    }

    public void buttonPressGuatemalaAntigua(View view) {
        Intent intent = new Intent(this, GuatemalaAntiguaActivity.class);
        startActivity(intent);
    }

    public void buttonPressHawaiianGoldenBlend(View view) {
        Intent intent = new Intent(this, HawaiianGoldenBlendActivity.class);
        startActivity(intent);
    }

    public void buttonPressHeritageBlend(View view) {
        Intent intent = new Intent(this, HeritageBlendActivity.class);
        startActivity(intent);
    }

    public void buttonPressKenyaAA(View view) {
        Intent intent = new Intent(this, KenyaAAActivity.class);
        startActivity(intent);
    }

    public void buttonPressMexicoOrganic(View view) {
        Intent intent = new Intent(this, OrganicMexicoActivity.class);
        startActivity(intent);
    }

    public void buttonPressMokaJavaEthiopian(View view) {
        Intent intent = new Intent(this, MokaJavaEthiopianActivity.class);
        startActivity(intent);
    }

    public void buttonPressEthiopianMysticLion(View view) {
        Intent intent = new Intent(this, EthiopiaMysticLionActivity.class);
        startActivity(intent);
    }

    public void buttonPressSumatraMandheling(View view) {
        Intent intent = new Intent(this, SumatraMandhelingActivity.class);
        startActivity(intent);
    }

}