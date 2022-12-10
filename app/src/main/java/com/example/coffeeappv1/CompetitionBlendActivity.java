package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

public class CompetitionBlendActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competition_blend);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    public void buttonPressHeritageBlend(View view) {
        Intent intent = new Intent(this, HeritageBlendActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicCostaRica(View view) {
        Intent intent = new Intent(this, OrganicCostaRicaActivity.class);
        startActivity(intent);
    }

    public void buttonPressPanamaLaEsmeraldaGeisha(View view) {
        Intent intent = new Intent(this, PanamaLaEsmeraldaGeishaActivity.class);
        startActivity(intent);
    }

    public void buttonPressCostaRicaLaEstrella(View view) {
        Intent intent = new Intent(this, CostaRicaLaEstrellaActivity.class);
        startActivity(intent);
    }

    public void buttonPressIslandBlend(View view) {
        Intent intent = new Intent(this, IslandBlendActivity.class);
        startActivity(intent);
    }
}
