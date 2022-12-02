package com.example.temelkomutlarunite3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg8Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uygulama_1sayili_activity);

        EditText editSayi = findViewById(R.id.editSayi);
        Button btnHesapla = findViewById(R.id.btnHesapla);
        Button btnGeri = findViewById(R.id.btnGeri);

        btnHesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi = Integer.parseInt(editSayi.getText().toString());
                System.out.println("x = " + sayi);
                sayi += 3;
                System.out.println("x += 3 : " + sayi);
                sayi -= 2;
                System.out.println("x -= 2 : " + sayi);
                sayi *= 2;
                System.out.println("x *= 2 : " + sayi);
                sayi /= 4;
                System.out.println("x /= 4 : " + sayi);
                sayi %= 2;
                System.out.println("x %= 2 : " + sayi);
            }
        });

        btnGeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main = new Intent(Uyg8Activity.this, MainActivity.class);
                startActivity(main);
            }
        });

    }
}
