package com.example.login;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloMayaVocalesNext extends AppCompatActivity {

    MediaPlayer arania;
    MediaPlayer elefante;
    ImageButton botonArania;
    ImageButton botonElefante;
    ImageButton siguienteDos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_maya_vocales_next);

        botonArania = (ImageButton)findViewById(R.id.botonArania);
        arania = MediaPlayer.create(this, R.raw.arania);

        botonArania.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arania.start();
            }
        });

        botonElefante = (ImageButton)findViewById(R.id.botonElefante);
        elefante = MediaPlayer.create(this, R.raw.elefante);

        botonElefante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                elefante.start();
            }
        });

        siguienteDos = (ImageButton) findViewById(R.id.siguiente2);

        siguienteDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloMayaVocalesNext.this, ModuloMayaVocalesContinuar.class);
                ModuloMayaVocalesNext.this.startActivity(intentRec);
            }
        });

    }
}
