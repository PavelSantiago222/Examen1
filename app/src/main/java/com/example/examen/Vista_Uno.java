package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.switchmaterial.SwitchMaterial;

public class Vista_Uno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_uno);

        // Boton Alert
        Button btAlert = findViewById(R.id.btAlert);
        btAlert.setOnClickListener(v -> {
            // Crea un AlertDialog.Builder
            AlertDialog.Builder builder = new AlertDialog.Builder(Vista_Uno.this);
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
        Button btRegresar = findViewById(R.id.btRegresar);
        btRegresar.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), vista_principal.class);
            startActivity(intent);
        });

        Button btMain = findViewById(R.id.btRegresar);
        btMain.setOnClickListener(v -> {
            Intent intent = new   Intent(v.getContext(), vista_principal.class);
            startActivity(intent);
        });

    }
}