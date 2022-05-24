package com.example.glames;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class pantalla_calendario extends AppCompatActivity {
    TextView tv;
    TextView  hr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_calendario);
        tv = findViewById(R.id.textView1);
        hr = findViewById(R.id.textView2);
    }

    public void abrirCalendario(View view) {
        /*Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);*/
        Calendar cal = Calendar.getInstance();
        int anio = cal.get(Calendar.YEAR);
        int mes = cal.get (Calendar.MONTH);
        int dia = cal.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog dpd = new  DatePickerDialog(pantalla_calendario.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                String fecha = dayOfMonth + "/"+ month + "/"+ year;
                tv.setText(fecha);
            }
        },dia,mes,anio);
        dpd.show();
    }

    public void abrirHora(View view) {
        Calendar c = Calendar.getInstance();
        int hora = c.get(Calendar.HOUR_OF_DAY);
        int min = c.get(Calendar.MINUTE);

        TimePickerDialog tmd = new TimePickerDialog(pantalla_calendario.this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                hr.setText(hourOfDay +":"+ minute );
            }
        }, hora, min , false);
        tmd.show();
    }
}