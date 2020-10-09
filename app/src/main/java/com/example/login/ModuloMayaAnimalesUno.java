package com.example.login;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloMayaAnimalesUno extends AppCompatActivity {

    MediaPlayer perro;
    MediaPlayer gato;
    MediaPlayer vaca;
    ImageButton botonPerro;
    ImageButton botonGato;
    ImageButton botonVaca;
    ImageButton next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_maya_aniamles_uno);

        botonPerro = (ImageButton)findViewById(R.id.audioPerro);
        perro = MediaPlayer.create(this, R.raw.perro);

        botonPerro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                perro.start();
            }
        });

        botonGato = (ImageButton)findViewById(R.id.audioGato);
        gato = MediaPlayer.create(this, R.raw.gato);

        botonGato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gato.start();
            }
        });

        botonVaca = (ImageButton)findViewById(R.id.audioVaca);
        vaca = MediaPlayer.create(this, R.raw.vaca);

        botonVaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vaca.start();
            }
        });

        next = (ImageButton) findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloMayaAnimalesUno.this, ModuloMayaAnimalesDos.class);
                ModuloMayaAnimalesUno.this.startActivity(intentRec);
            }
        });

    }

}

