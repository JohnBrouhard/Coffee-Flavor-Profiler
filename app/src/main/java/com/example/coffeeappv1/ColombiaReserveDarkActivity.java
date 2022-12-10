package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ColombiaReserveDarkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colombia_reserve_dark);
    }
    public void buttonPressHotButteredRum(View view) {
        Intent intent = new Intent(this, HotButteredRumActivity.class);
        startActivity(intent);
    }

    public void buttonPressOrganicWPDecafDarkRoast(View view) {
        Intent intent = new Intent(this, OrganicWPDecafDarkRoastActivity.class);
        startActivity(intent);
    }

    public void buttonPressFrenchRoastDarkItalian(View view) {
        Intent intent = new Intent(this, FrenchRoastDarkItalianActivity.class);
        startActivity(intent);
    }

    public void buttonPressMokaJavaDark(View view) {
        Intent intent = new Intent(this, MokaJavaDarkActivity.class);
        startActivity(intent);
    }

    public void buttonPressViennaDark(View view) {
        Intent intent = new Intent(this, ViennaDarkActivity.class);
        startActivity(intent);
    }
}