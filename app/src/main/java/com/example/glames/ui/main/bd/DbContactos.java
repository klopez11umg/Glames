package com.example.glames.ui.main.bd;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

import com.example.glames.entidades.NotasEscritas;

import java.util.ArrayList;

public class DbContactos extends DbHelper{

    Context context;

    public DbContactos(@Nullable Context context) {
        super(context);
        this.context = context;
    }

    public long insertarContacto(String nombre){
        long id = 0;
        try {
            DbHelper dbHelper = new DbHelper(context);
            SQLiteDatabase db = dbHelper.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put("nombre", nombre);
            id = db.insert(TABLE_CONTACTOS, null, values);
        } catch (Exception ex) {
            ex.toString();
        }
        return id;
    }

    public ArrayList<NotasEscritas> mostrarNotas(){
        DbHelper dbHelper = new DbHelper(context);
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        ArrayList<NotasEscritas> listaNotas = new ArrayList<>();
        NotasEscritas notas = null;
        Cursor cursorNotas = null;

        cursorNotas = db.rawQuery("SELECT * FROM "+TABLE_CONTACTOS,null);

        if (cursorNotas.moveToFirst()){
            do{
                notas = new NotasEscritas();
                notas.setId(cursorNotas.getInt(0));
                notas.setNota(cursorNotas.getString(1));
                listaNotas.add(notas);
            }while (cursorNotas.moveToNext());
        }
        cursorNotas.close();
        return  listaNotas;
    }

}
