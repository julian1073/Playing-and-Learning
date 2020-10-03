package com.example.login;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloMayaVocalesContinuarDos extends AppCompatActivity {
    MediaPlayer uvas;
    ImageButton botonUva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_maya_vocales_continuar_dos);

        botonUva = (ImageButton)findViewById(R.id.botonUva);
        uvas = MediaPlayer.create(this, R.raw.uva);

        botonUva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uvas.start();
            }
        });
    }
}
