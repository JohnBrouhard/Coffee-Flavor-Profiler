package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MokaJavaDarkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moka_java_dark);
    }

    public void buttonPressMokaJavaEthiopian(View view) {
        Intent intent = new Intent(this, MokaJavaEthiopianActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicFairTradeMillenniumJoe(View view) {
        Intent intent = new Intent(this, OrganicFairTradeMillenniumJoeActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicHawaiian(View view) {
        Intent intent = new Intent(this, OrganicHawaiianActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicItalianRoast(View view) {
        Intent intent = new Intent(this, OrganicItalianRoastActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicRoadWarriorBlend(View view) {
        Intent intent = new Intent(this, OrganicRoadWarriorBlendActivity.class);
        startActivity(intent);
    }
}