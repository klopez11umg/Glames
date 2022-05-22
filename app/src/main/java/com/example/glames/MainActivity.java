package com.example.glames;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonPantallaCamara; //boton para abrir pantalla de camara
    Button buttonPantallaAudio; //boton para abrir pantalla de camara

    Button buttonP;



    @SuppressLint("CutPasteId")
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Metodo para ver la pantalla uno con el bootn



        //Metodo para ver la pantalla uno con el bootn
        buttonPantallaAudio = findViewById(R.id.btnPantallaCamara);
        buttonPantallaAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( MainActivity.this, pantallaAudio.class);
                startActivity(intent);
            }
        });

        buttonP = findViewById(R.id.btnPantallaCamara);
        buttonP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, pantallaCamara.class);
                startActivity(intent);
            }
        });

        buttonP = findViewById(R.id.btnPantallaCamara);
        buttonP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, pantallaCamara.class);
                startActivity(intent);
            }
        });


        buttonP = findViewById(R.id.btnPantallaHerramientas);
        buttonP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, pantallaHerramientas.class);
                startActivity(intent);
            }
        });





    }//fin onCreate
}