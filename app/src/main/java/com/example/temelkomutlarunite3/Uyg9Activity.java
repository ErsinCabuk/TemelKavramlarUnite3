package com.example.temelkomutlarunite3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg9Activity extends AppCompatActivity {
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
                System.out.println("x ile y eşit mi: " + (sayi1 == sayi2));
                System.out.println("x ile y farklı mı: " + (sayi1 != sayi2));
                System.out.println("x, y’den büyük mü: " + (sayi1 > sayi2));
                System.out.println("x, y’den küçük mü:  " + (sayi1 < sayi2));
                System.out.println("x, y’den büyük veya eşit mi: " + (sayi1 >= sayi2));
                System.out.println("x, y’den küçük veya eşit mi: " + (sayi1 <= sayi2));
            }
        });

        btnGeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main = new Intent(Uyg9Activity.this, MainActivity.class);
                startActivity(main);
            }
        });
    }
}
