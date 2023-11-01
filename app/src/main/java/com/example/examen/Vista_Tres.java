package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Vista_Tres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_tres);

        // Boton Alert
        Button btL3Alert = findViewById(R.id.bt3Alert);
        btL3Alert.setOnClickListener(v -> {
            // Crea un AlertDialog.Builder
            AlertDialog.Builder builder = new AlertDialog.Builder(Vista_Tres.this);
            builder.setTitle("Título del diálogo");
            builder.setMessage("Este es un mensaje de ejemplo.");
            // Configura los botones del diálogo
            builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    // Acción al hacer clic en Aceptar
                    // Puedes agregar tu lógica aquí
                }
            });
            builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    // Acción al hacer clic en Cancelar
                    // Puedes agregar tu lógica aquí
                }
            });
            // Crea el AlertDialog
            AlertDialog alertDialog = builder.create();
            // Muestra el AlertDialog
            alertDialog.show();
        });
        // Boton Regresar
        Button btL3Regresar = findViewById(R.id.bt3Regresar);
        btL3Regresar.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), MainActivity.class);
            startActivity(intent);
        });
    }
}