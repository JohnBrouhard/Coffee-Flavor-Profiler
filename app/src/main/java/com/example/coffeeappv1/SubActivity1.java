package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SubActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub1);
    }

    public void buttonPress1(View view) {
        Intent intent = new Intent(this, SubActivity11.class);
        startActivity(intent);
    }

    public void buttonPress2(View view) {
        Intent intent = new Intent(this, SubActivity1_2.class);
        startActivity(intent);
    }

    public void buttonPress3(View view) {
        Intent intent = new Intent(this, SubActivity1_3.class);
        startActivity(intent);
    }

    public void buttonPress4(View view) {
        Intent intent = new Intent(this, SubActivity1_4.class);
        startActivity(intent);
    }

    public void buttonPress5(View view) {
        Intent intent = new Intent(this, SubActivity1_5.class);
        startActivity(intent);
    }
}