package com.example.glames;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ascii extends AppCompatActivity {

    Button buttonAscii04;
    Button buttonAscii05;
    Button buttonAscii07;
    Button buttonAscii08;
    Button buttonAscii09;
    Button buttonAscii010;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ascii);

        buttonAscii04 = findViewById(R.id.btnPantallaAscii_04);
        buttonAscii04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ascii.this, ascii_04.class);
                startActivity(intent);
            }
        });

        buttonAscii05 = findViewById(R.id.btnPantallaAscii_05);
        buttonAscii05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ascii.this, ascii_05.class);
                startActivity(intent);
            }
        });

        buttonAscii07 = findViewById(R.id.btnPantallaAscii_07);
        buttonAscii07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ascii.this, ascii_07.class);
                startActivity(intent);
            }
        });

        buttonAscii08 = findViewById(R.id.btnPantallaAscii_08);
        buttonAscii08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ascii.this, ascii_08.class);
                startActivity(intent);
            }
        });

        buttonAscii09 = findViewById(R.id.btnPantallaAscii_09);
        buttonAscii09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ascii.this, ascii_09.class);
                startActivity(intent);
            }
        });

        buttonAscii010 = findViewById(R.id.btnPantallaAscii_10);
        buttonAscii010.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ascii.this, ascii_10.class);
                startActivity(intent);
            }
        });

    }

}