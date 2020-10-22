package com.example.login;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloSuperBoltVocalesInglesNext extends AppCompatActivity {
    MediaPlayer vocalEi;
    MediaPlayer vocalIi;
    MediaPlayer vocalAi;
    MediaPlayer vocalOu;
    MediaPlayer vocalIu;
    ImageButton botonEi;
    ImageButton botonIi;
    ImageButton botonAi;
    ImageButton botonOu;
    ImageButton botonIu;
    ImageButton nextSiguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_super_bolt_vocales_ingles_next);

        botonEi = (ImageButton)findViewById(R.id.audioEi);
        vocalEi = MediaPlayer.create(this, R.raw.ei);

        botonEi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vocalEi.start();
            }
        });


        botonIi = (ImageButton)findViewById(R.id.audioIi);
        vocalIi = MediaPlayer.create(this, R.raw.ii);

        botonIi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vocalIi.start();
            }
        });

        botonAi = (ImageButton)findViewById(R.id.audioAi);
        vocalAi = MediaPlayer.create(this, R.raw.ai);

        botonAi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vocalAi.start();
            }
        });

        botonOu = (ImageButton)findViewById(R.id.audioOu);
        vocalOu = MediaPlayer.create(this, R.raw.ou);

        botonOu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vocalOu.start();
            }
        });

        botonIu = (ImageButton)findViewById(R.id.audioIu);
        vocalIu = MediaPlayer.create(this, R.raw.iu);

        botonIu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vocalIu.start();
            }
        });

        nextSiguiente = (ImageButton) findViewById(R.id.nextSiguiente);

        nextSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloSuperBoltVocalesInglesNext.this, ModuloSuperBoltVocalesInglesDos.class);
                ModuloSuperBoltVocalesInglesNext.this.startActivity(intentRec);
            }
        });

    }
}
