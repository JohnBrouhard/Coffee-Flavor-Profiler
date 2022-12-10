package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

public class DecaffeinatedVanillaNutCreamActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decaffeinated_vanilla_nut_cream);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    public void buttonPressCinnamonNutSugarCookie(View view) {
        Intent intent = new Intent(this, CinnamonNutSugarCookieActivity.class);
        startActivity(intent);
    }

    public void buttonPressFrenchVanilla(View view) {
        Intent intent = new Intent(this, FrenchVanillaActivity.class);
        startActivity(intent);
    }

    public void buttonPressCaramelNutFudge(View view) {
        Intent intent = new Intent(this, CaramelNutFudgeActivity.class);
        startActivity(intent);
    }

    public void buttonPressBourbonPecan(View view) {
        Intent intent = new Intent(this, BourbonPecanActivity.class);
        startActivity(intent);
    }

    public void buttonPressVanillaMacadamiaNut(View view) {
        Intent intent = new Intent(this, VanillaMacadamiaNutActivity.class);
        startActivity(intent);
    }
}
