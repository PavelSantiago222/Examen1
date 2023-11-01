package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class vista_principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_principal);

        Button btMain1 = findViewById(R.id.btMenu1);
        btMain1.setOnClickListener(v -> {
            Intent intent = new Intent (v.getContext(), Vista_Uno.class);
            startActivity(intent);
        });

        Button btMain2 = findViewById(R.id.btMenu2);
        btMain2.setOnClickListener(v -> {
            Intent intent = new Intent (v.getContext(), Vista_Dos.class);
            startActivity(intent);
        });

        Button btMainL = findViewById(R.id.btMenu3);
        btMain2.setOnClickListener(v -> {
            Intent intent = new Intent (v.getContext(), Vista_Tres.class);
            startActivity(intent);
        });
    }
}