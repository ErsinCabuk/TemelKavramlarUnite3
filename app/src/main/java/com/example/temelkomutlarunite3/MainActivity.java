package com.example.temelkomutlarunite3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnUyg1;
    Button btnUyg2;
    Button btnUyg3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnUyg1 = findViewById(R.id.btnUyg1);
        btnUyg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uyg1 = new Intent(MainActivity.this, Uyg1Activity.class);
                startActivity(uyg1);
            }
        });

        btnUyg2 = findViewById(R.id.btnUyg2);
        btnUyg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uyg2 = new Intent(MainActivity.this, Uyg2Activity.class);
                startActivity(uyg2);
            }
        });

        btnUyg3 = findViewById(R.id.btnUyg3);
        btnUyg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uyg3 = new Intent(MainActivity.this, Uyg3Activity.class);
                startActivity(uyg3);
            }
        });
    }
}