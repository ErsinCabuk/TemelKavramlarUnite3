package com.example.temelkomutlarunite3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.geri_activity);

        TextView txtCalistirildi = findViewById(R.id.txtCalistirildi);

        Button btnCalistir = findViewById(R.id.btnCalistir);
        btnCalistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                byte kucukSayi = 127;
                short kisaSayi = 32767;
                int tamSayi = 2147483647;
                long uzunSayi = 9223372036854775807L;
                System.out.println("byte: " + kucukSayi);
                System.out.println("short: " + kisaSayi);
                System.out.println("int: " + tamSayi);
                System.out.println("long: " + uzunSayi);

                txtCalistirildi.setVisibility(View.VISIBLE);
            }
        });

        Button btnGeri = findViewById(R.id.btnGeri);
        btnGeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main = new Intent(Uyg2Activity.this, MainActivity.class);
                startActivity(main);
            }
        });
    }
}
