package com.example.glames;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pantallaHerramientas extends AppCompatActivity {

    Button buttonHerramientas;
    Button buttonHerramientasFisica;
    Button buttonHerramientasAlfabeto;
    Button buttonHerramientasEquivalencias;
    Button buttonHerramientasAscii;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herramientas);

        buttonHerramientas = findViewById(R.id.btnPantallaHerramientas_prefijos);
        buttonHerramientas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pantallaHerramientas.this, herramientas_prefijos.class);
                startActivity(intent);
            }
        });

        buttonHerramientasFisica = findViewById(R.id.btnPantallaHerramientas_tblFisica);
        buttonHerramientasFisica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pantallaHerramientas.this, herramientas_fisica.class);
                startActivity(intent);
            }
        });

        buttonHerramientasAlfabeto = findViewById(R.id.btnPantallaHerramientas_alfabeto);
        buttonHerramientasAlfabeto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pantallaHerramientas.this, herramientas_alfabeto.class);
                startActivity(intent);
            }
        });

        buttonHerramientasEquivalencias = findViewById(R.id.btnPantallaHerramientas_tblEquivalencias);
        buttonHerramientasEquivalencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pantallaHerramientas.this, herramientas_equivalencias.class);
                startActivity(intent);
            }
        });

        buttonHerramientasAscii = findViewById(R.id.btnPantallAscii);
        buttonHerramientasAscii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pantallaHerramientas.this, ascii.class);
                startActivity(intent);
            }
        });



    }

}