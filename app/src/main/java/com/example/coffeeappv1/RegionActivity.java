package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

public class RegionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_region);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    public void buttonPressCostaRicaLaEstrella(View view) {
        Intent intent = new Intent(this, CostaRicaLaEstrellaActivity.class);
        startActivity(intent);
    }

    public void buttonPressEspressoNuovo(View view) {
        Intent intent = new Intent(this, EspressoNuovoActivity.class);
        startActivity(intent);
    }

    public void buttonPressEthiopiaMysticLion(View view) {
        Intent intent = new Intent(this, EthiopiaMysticLionActivity.class);
        startActivity(intent);
    }

    public void buttonPressGuatemalaAntigua(View view) {
        Intent intent = new Intent(this, GuatemalaAntiguaActivity.class);
        startActivity(intent);
    }

    public void buttonPressGuatemalaAntiguaDark(View view) {
        Intent intent = new Intent(this, GuatemalaAntiguaDarkActivity.class);
        startActivity(intent);
    }

    public void buttonPressHawaiianKonaFancy(View view) {
        Intent intent = new Intent(this, HawaiianKonaFancyActivity.class);
        startActivity(intent);
    }

    public void buttonPressJamaicaBlueMountainFancy(View view) {
        Intent intent = new Intent(this, JamaicaBlueMountainFancyActivity.class);
        startActivity(intent);
    }

    public void buttonPressKenyaAA(View view) {
        Intent intent = new Intent(this, KenyaAAActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicCostaRica(View view) {
        Intent intent = new Intent(this, OrganicCostaRicaActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicCostaRicaLasLajasHoneyMiel(View view) {
        Intent intent = new Intent(this, OrganicCostaRicaLasLajasHoneyMielActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicMexico(View view) {
        Intent intent = new Intent(this, OrganicMexicoActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicPeru(View view) {
        Intent intent = new Intent(this, OrganicPeruActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicWPDecafMexico(View view) {
        Intent intent = new Intent(this, OrganicWPDecafMexicoActivity.class);
        startActivity(intent);
    }

    public void buttonPressPanamaLaEsmeraldaGeisha(View view) {
        Intent intent = new Intent(this, PanamaLaEsmeraldaGeishaActivity.class);
        startActivity(intent);
    }

    public void buttonPressSumatraMandhelin(View view) {
        Intent intent = new Intent(this, SumatraMandhelingActivity.class);
        startActivity(intent);
    }

}