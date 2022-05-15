package com.example.t024_viewquotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button BtnSuccess , BtnInspiration , BtnMotivation ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtnSuccess = findViewById(R.id.BtnSuccess);
        BtnInspiration = findViewById(R.id.BtnInspiration);
        BtnMotivation = findViewById(R.id.BtnMotivation);

        BtnSuccess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this , ViewActivity.class));
            }
        });

        BtnInspiration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this , ViewActivity.class));
            }
        });

        BtnMotivation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this , ViewActivity.class));
            }
        });
    }
}