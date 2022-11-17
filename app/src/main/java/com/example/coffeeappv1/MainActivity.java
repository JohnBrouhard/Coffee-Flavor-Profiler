package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonPress1(View view) {
        Intent intent = new Intent(this, SubActivity1.class);
        startActivity(intent);
    }

    public void buttonPress2(View view) {
        Intent intent = new Intent(this, SubActivity2.class);
        startActivity(intent);
    }

    public void buttonPress3(View view) {
        Intent intent = new Intent(this, SubActivity3.class);
        startActivity(intent);
    }

    public void buttonPress4(View view) {
        Intent intent = new Intent(this, SubActivity4.class);
        startActivity(intent);
    }
}