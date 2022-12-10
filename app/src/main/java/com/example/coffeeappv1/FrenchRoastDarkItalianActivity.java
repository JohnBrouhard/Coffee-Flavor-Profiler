package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FrenchRoastDarkItalianActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_french_roast_dark_italian);
    }

    public void buttonPressItalianRoastClassic(View view) {
        Intent intent = new Intent(this, ItalianRoastClassicActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicWPDecafDarkRoast(View view) {
        Intent intent = new Intent(this, OrganicWPDecafDarkRoastActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicItalianRoast(View view) {
        Intent intent = new Intent(this, OrganicItalianRoastActivity.class);
        startActivity(intent);
    }

    public void buttonPressWestsideBlend(View view) {
        Intent intent = new Intent(this, WestsideBlendActivity.class);
        startActivity(intent);
    }

    public void buttonPressColombiaReserveDark(View view) {
        Intent intent = new Intent(this, ColombiaReserveDarkActivity.class);
        startActivity(intent);
    }
}