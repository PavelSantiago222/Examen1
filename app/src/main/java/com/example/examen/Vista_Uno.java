package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

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
        Button btLink1Main = findViewById(R.id.btLink1Regresar);
        btLink1Main.setOnClickListener(v -> {
            Intent intent = new   Intent(v.getContext(), MainActivity.class);
            startActivity(intent);
        });
        FloatingActionButton fabLink1Fab1 = findViewById(R.id.fab);
        fabLink1Fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Notificación de Clic en FAB", Snackbar.LENGTH_LONG).setAction("Action", null).show();
            }
        });

        RadioGroup radioGroup = findViewById(R.id.rgOpciones);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton radioButton = findViewById(i);
                String seleccion = radioButton.getText().toString();
                Toast.makeText(Vista_Uno.this, "Seleccionaste: " + seleccion, Toast.LENGTH_LONG).show();
            }
        });
        SwitchMaterial toggleButton = findViewById(R.id.toggleButton);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(Vista_Uno.this, "Activo", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(Vista_Uno.this, "No Activo", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}