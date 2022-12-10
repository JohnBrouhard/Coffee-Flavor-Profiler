package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MidnightRoyaleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midnight_royale);
    }

    public void buttonPressOrganicSumatraDark(View view) {
        Intent intent = new Intent(this, OrganicSumatraDarkActivity.class);
        startActivity(intent);
    }

    public void buttonPressRivieraFrench(View view) {
        Intent intent = new Intent(this, RivieraFrenchActivity.class);
        startActivity(intent);
    }

    public void buttonPressMajesticBlend(View view) {
        Intent intent = new Intent(this, MajesticBlendActivity.class);
        startActivity(intent);
    }

    public void buttonPressMokaJavaDark(View view) {
        Intent intent = new Intent(this, MokaJavaDarkActivity.class);
        startActivity(intent);
    }

    public void buttonPressMokaJavaEthiopian(View view) {
        Intent intent = new Intent(this, MokaJavaEthiopianActivity.class);
        startActivity(intent);
    }
}