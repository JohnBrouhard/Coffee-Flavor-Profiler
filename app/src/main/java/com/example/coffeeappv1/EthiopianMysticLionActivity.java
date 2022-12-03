package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EthiopianMysticLionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ethiopian_mystic_lion);
    }

    public void buttonPressHawaiianGoldenBlend(View view) {
        Intent intent = new Intent(this, HawaiianGoldenBlendActivity.class);
        startActivity(intent);
    }

    public void buttonPressPanamaLaEsmeraldaGeisha(View view) {
        Intent intent = new Intent(this, PanamaLaEsmeraldaGeishaActivity.class);
        startActivity(intent);
    }

    public void buttonPressDecaffeinatedColombia(View view) {
        Intent intent = new Intent(this, DecaffeinatedColombiaActivity.class);
        startActivity(intent);
    }

    public void buttonPressPresidentsPrivateBlend(View view) {
        Intent intent = new Intent(this, PresidentsPrivateBlendActivity.class);
        startActivity(intent);
    }

    public void buttonPressColombiaReserve(View view) {
        Intent intent = new Intent(this, ColombiaReserveActivity.class);
        startActivity(intent);
    }
}