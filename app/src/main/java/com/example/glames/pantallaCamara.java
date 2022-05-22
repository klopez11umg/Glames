package com.example.glames;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;
import java.io.IOException;

public class pantallaCamara extends AppCompatActivity {

    Button buttonPcAbrirCamara; //boton  para abrir camara
    ImageView imgView;
    String rutaImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_camara);


        //M
        buttonPcAbrirCamara = findViewById(R.id.btn_pc_abrirCamara);
        imgView = findViewById(R.id.imagenCamara);

        buttonPcAbrirCamara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirCamara();

            }
        });


    }//fin onCreate

    // Metodo para abrir camara
    private void abrirCamara(){
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        //if (intent.resolveActivity((getPackageManager())) != null) {

            File imagenArchivo = null;

            try {
                imagenArchivo = crearImagen();
            }catch (IOException e){
                Log.e("Error", e.toString());
            }

            if(imagenArchivo != null){
                Uri fotoUri = FileProvider.getUriForFile(this, "com.example.glames.fileprovider",imagenArchivo);
                intent.putExtra(MediaStore.EXTRA_OUTPUT, fotoUri);
                startActivityForResult(intent, 1);
            }


        //}
    }

    //Metodo
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == RESULT_OK) {
            //Bundle extras = data.getExtras();
            Bitmap imagenBit = BitmapFactory.decodeFile(rutaImagen);
            imgView.setImageBitmap(imagenBit);
        }
    }

    private File crearImagen() throws IOException {
        String nombreImagen = "foto_";
        File directorio = getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        File imagen = File.createTempFile(nombreImagen,".jpg",directorio);

        rutaImagen = imagen.getAbsolutePath();
        return  imagen;
    }


}