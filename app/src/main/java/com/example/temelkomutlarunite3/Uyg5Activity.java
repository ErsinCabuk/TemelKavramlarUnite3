package com.example.temelkomutlarunite3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg5Activity extends AppCompatActivity {

    Button btnGeri;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.geri_activity);

        float o1 = 1f/3f;
        double o2 = 1d/3d;
        System.out.println("Float Sayı: " + o1);
        System.out.println("Ondalık Sayı: " + o2);

        btnGeri = findViewById(R.id.btnGeri);
        btnGeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main = new Intent(Uyg5Activity.this, MainActivity.class);
                startActivity(main);
            }
        });
    }
}
