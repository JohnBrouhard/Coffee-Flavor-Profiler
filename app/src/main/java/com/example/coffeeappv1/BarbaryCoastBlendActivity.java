package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

public class BarbaryCoastBlendActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barbary_coast_blend);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }
    
    public void buttonPressViennaDark(View view) {
        Intent intent = new Intent(this, ViennaDarkActivity.class);
        startActivity(intent);
    }

    public void buttonPressRivieraFrench(View view) {
        Intent intent = new Intent(this, RivieraFrenchActivity.class);
        startActivity(intent);
    }

    public void buttonPressMidnightRoyale(View view) {
        Intent intent = new Intent(this, MidnightRoyaleActivity.class);
        startActivity(intent);
    }

    public void buttonPressFrenchRoastDarkItalian(View view) {
        Intent intent = new Intent(this, FrenchRoastDarkItalianRoastActivity.class);
        startActivity(intent);
    }

    public void buttonPressEspressoNuovo(View view) {
        Intent intent = new Intent(this, EspressoNuovoActivity.class);
        startActivity(intent);
    }
    
}
