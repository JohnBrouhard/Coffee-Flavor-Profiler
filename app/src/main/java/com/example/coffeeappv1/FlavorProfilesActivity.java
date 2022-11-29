package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

public class FlavorProfilesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flavor_profiles);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    public void buttonPressBourbonPecan(View view) {
        Intent intent = new Intent(this, BourbonPecanActivity.class);
        startActivity(intent);
    }

    public void buttonPressCappuccinoFudge(View view) {
        Intent intent = new Intent(this, CappuccinoFudgeActivity.class);
        startActivity(intent);
    }

    public void buttonPressCaramelNutFudge(View view) {
        Intent intent = new Intent(this, CaramelNutFudgeActivity.class);
        startActivity(intent);
    }

    public void buttonPressChocolateMacadamiaNut(View view) {
        Intent intent = new Intent(this, ChocolateMacadamiaNutActivity.class);
        startActivity(intent);
    }

    public void buttonPressChocolateRasberryCream(View view) {
        Intent intent = new Intent(this, ChocolateRasberryCreamActivity.class);
        startActivity(intent);
    }

    public void buttonPressCinnamonBun(View view) {
        Intent intent = new Intent(this, CinnamonBunActivity.class);
        startActivity(intent);
    }

    public void buttonPressCinnamonFragelico(View view) {
        Intent intent = new Intent(this, CinnamonFragelicoActivity.class);
        startActivity(intent);
    }

    public void buttonPressCinnamonNutSugarCookie(View view) {
        Intent intent = new Intent(this, CinnamonNutSugarCookieActivity.class);
        startActivity(intent);
    }

    public void buttonPressDarkChocolateTruffle(View view) {
        Intent intent = new Intent(this, DarkChocolateTruffleActivity.class);
        startActivity(intent);
    }

    public void buttonPressDecaffeinatedHazelnut(View view) {
        Intent intent = new Intent(this, DecaffeinatedHazelnutActivity.class);
        startActivity(intent);
    }

    public void buttonPressDecaffeinatedVanillaNutCream(View view) {
        Intent intent = new Intent(this, DecaffeinatedVanillaNutCreamActivity.class);
        startActivity(intent);
    }

    public void buttonPressFrenchVanilla(View view) {
        Intent intent = new Intent(this, FrenchVanillaActivity.class);
        startActivity(intent);
    }

    public void buttonPressHazelnut(View view) {
        Intent intent = new Intent(this, HazelnutActivity.class);
        startActivity(intent);
    }

    public void buttonPressHotButteredRum(View view) {
        Intent intent = new Intent(this, HotButteredRumActivity.class);
        startActivity(intent);
    }

    public void buttonPressIrishShamrockCream(View view) {
        Intent intent = new Intent(this, IrishShamrockCreamActivity.class);
        startActivity(intent);
    }

    public void buttonPressKahluaCream(View view) {
        Intent intent = new Intent(this, KahluaCreamActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicGorillaVanilla(View view) {
        Intent intent = new Intent(this, OrganicGorillaVanillaActivity.class);
        startActivity(intent);
    }

    public void buttonPressVanillaMacadamiaNut(View view) {
        Intent intent = new Intent(this, VanillaMacadamiaNutActivity.class);
        startActivity(intent);
    }

    public void buttonPressVanillaNutCream(View view) {
        Intent intent = new Intent(this, VanillaNutCreamActivity.class);
        startActivity(intent);
    }
}