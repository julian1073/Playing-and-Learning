package com.example.login;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloSuperBoltVocalesInglesTres extends AppCompatActivity {
    MediaPlayer igloo;
    MediaPlayer orange;
    ImageButton botonIgloo;
    ImageButton botonOrange;
    ImageButton siguienteVocalesInglesTres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_super_bolt_vocales_ingles_tres);

        botonIgloo = (ImageButton)findViewById(R.id.botonIgloo);
        igloo = MediaPlayer.create(this, R.raw.igloo);

        botonIgloo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                igloo.start();
            }
        });


        botonOrange = (ImageButton)findViewById(R.id.botonOrange);
        orange = MediaPlayer.create(this, R.raw.orange);

        botonOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orange.start();
            }
        });

        siguienteVocalesInglesTres = (ImageButton) findViewById(R.id.siguienteVocalesInglesTres);

        siguienteVocalesInglesTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloSuperBoltVocalesInglesTres.this, ModuloSuperBoltVocalesInglesCuatro.class);
                ModuloSuperBoltVocalesInglesTres.this.startActivity(intentRec);
            }
        });

    }
}
