package com.example.temelkomutlarunite3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg7Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uygulama_2sayili_activity);

        EditText editSayi1 = findViewById(R.id.editSayi1);
        EditText editSayi2 = findViewById(R.id.editSayi2);
        Button btnHesapla = findViewById(R.id.btnHesapla);
        Button btnGeri = findViewById(R.id.btnGeri);

        btnHesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1 = Integer.parseInt(editSayi1.getText().toString());
                int sayi2 = Integer.parseInt(editSayi2.getText().toString());
                int toplam = sayi1 + sayi2;
                int fark = sayi1 - sayi2;
                int carpim = sayi1 * sayi2;
                int bolme = sayi1 / sayi2;
                int mod = sayi1 % sayi2;
                sayi1++;
                sayi2--;
                System.out.println("Toplam: " + toplam);
                System.out.println("Fark: " + fark);
                System.out.println("Çarpım: " + carpim);
                System.out.println("Bölme: " + bolme);
                System.out.println("Mod Alma: " + mod);
                System.out.println("Artırma: " + sayi1);
                System.out.println("Azaltma: " + sayi2);
            }
        });

        btnGeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main = new Intent(Uyg7Activity.this, MainActivity.class);
                startActivity(main);
            }
        });

    }
}
