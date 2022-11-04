package com.example.temelkomutlarunite3;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg1Activity extends AppCompatActivity {

    Button btnGeri;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg1_activity);

        boolean d1 = true;
        System.out.println("1. Değişken Değeri: " + d1);

        btnGeri = findViewById(R.id.btnGeriUyg1);
        btnGeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main = new Intent(Uyg1Activity.this, MainActivity.class);
                startActivity(main);
            }
        });
    }
}
