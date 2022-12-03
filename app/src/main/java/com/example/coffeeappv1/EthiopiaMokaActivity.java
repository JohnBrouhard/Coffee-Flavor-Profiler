package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

public class EthiopiaMokaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ethiopia_moka);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    public void buttonPressPanamaLaEsmeraldaGeisha(View view) {
        Intent intent = new Intent(this, PanamaLaEsmeraldaGeishaActivity.class);
        startActivity(intent);
    }

    public void buttonPressCompetitionBlend(View view) {
        Intent intent = new Intent(this, CompetitionBlendActivity.class);
        startActivity(intent);
    }

}