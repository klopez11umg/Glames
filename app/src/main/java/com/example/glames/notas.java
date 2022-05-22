package com.example.glames;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.glames.ui.main.bd.DbHelper;

public class notas extends AppCompatActivity {

    Button buttonAbrirBD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notas);

        buttonAbrirBD = findViewById(R.id.btn_pantallaNotas_abrir);

        buttonAbrirBD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DbHelper dbHelper = new DbHelper(notas.this);
                SQLiteDatabase db = dbHelper.getWritableDatabase();

                if(db != null){
                    Toast.makeText(notas.this, "BASE DE DATOS CREADA", Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(notas.this, "ERROR AL CREAR BASE DE DATOS", Toast.LENGTH_LONG).show();
                }
            }
        });

        }
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_notas, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.menuNota:
                nuevoRegistro();
                return true;
            default:
                return  super.onOptionsItemSelected(item);
        }
    }

    private void nuevoRegistro(){
        Intent intent = new Intent(notas.this, notasCrear.class);
        startActivity(intent);
    }

    }
