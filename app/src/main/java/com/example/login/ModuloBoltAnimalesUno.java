package com.example.login;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloBoltAnimalesUno extends AppCompatActivity {

    MediaPlayer leon;
    MediaPlayer elefante;
    MediaPlayer jirafa;
    ImageButton botonLeon;
    ImageButton botonElefante;
    ImageButton botonJirafa;
    ImageButton next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_bolt_animales_uno);

        botonLeon = (ImageButton)findViewById(R.id.audioLeon);
        leon = MediaPlayer.create(this, R.raw.leon);

        botonLeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leon.start();
            }
        });

        botonElefante = (ImageButton)findViewById(R.id.audioElefante);
        elefante = MediaPlayer.create(this, R.raw.elefantee);

        botonElefante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                elefante.start();
            }
        });

        botonJirafa = (ImageButton)findViewById(R.id.audioJirafa);
        jirafa = MediaPlayer.create(this, R.raw.jirafa);

        botonJirafa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jirafa.start();
            }
        });

        next = (ImageButton) findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloBoltAnimalesUno.this, ModuloBoltAnimalesDos.class);
                ModuloBoltAnimalesUno.this.startActivity(intentRec);
            }
        });

    }

}