package com.example.glames;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.glames.ui.main.bd.DbContactos;

public class notasCrear extends AppCompatActivity {

    EditText txtEscribir;
    Button btnGuardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notas_crear);

        txtEscribir = findViewById(R.id.txt_pantallaNotas_escribir);

        btnGuardar = findViewById(R.id.btn_pantallaNotas_Crear);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DbContactos dbContactos = new DbContactos(notasCrear.this);
                long id = dbContactos.insertarContacto(txtEscribir.getText().toString());

                if (id > 0) {
                    Toast.makeText(notasCrear.this, "Nota Agregada", Toast.LENGTH_LONG).show();
                    limpiar();
                }else{
                    Toast.makeText(notasCrear.this, "FALLO", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
    private void limpiar(){
        txtEscribir.setText("");
    }

}