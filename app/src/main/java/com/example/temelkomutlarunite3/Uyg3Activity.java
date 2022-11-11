package com.example.temelkomutlarunite3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg3Activity extends AppCompatActivity {

    Button btnGeri;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg3_activity);
        char karakter = 'A';
        System.out.println("Karakter: " + karakter);

        karakter = 'A' + 1;
        System.out.println("Yeni Karakter: " + karakter);

        karakter = 'A' + 32;
        System.out.println("Yeni Karakterin Yeni Karakteri: " + karakter);

        btnGeri = findViewById(R.id.btnGeri);
        btnGeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main = new Intent(Uyg3Activity.this, MainActivity.class);
                startActivity(main);
            }
        });
    }
}
