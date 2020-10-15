package com.example.login;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloMayaVocalesInicio extends AppCompatActivity {

    MediaPlayer vocalA;
    MediaPlayer vocalE;
    MediaPlayer vocalI;
    MediaPlayer vocalO;
    MediaPlayer vocalU;
    ImageButton botonA;
    ImageButton botonE;
    ImageButton botonI;
    ImageButton botonO;
    ImageButton botonU;
    ImageButton next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_maya_vocales_inicio);

        botonA = (ImageButton)findViewById(R.id.audioA);
        vocalA = MediaPlayer.create(this, R.raw.a);

        botonA.setOnClickListener(new View.OnClickListener() {
             @Override
            public void onClick(View v) {
                    vocalA.start();
             }
        });


        botonE = (ImageButton)findViewById(R.id.audioE);
        vocalE = MediaPlayer.create(this, R.raw.e);

        botonE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vocalE.start();
            }
        });

        botonI = (ImageButton)findViewById(R.id.audioI);
        vocalI = MediaPlayer.create(this, R.raw.i);

        botonI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vocalI.start();
            }
        });

        botonO = (ImageButton)findViewById(R.id.audioO);
        vocalO = MediaPlayer.create(this, R.raw.o);

        botonO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vocalO.start();
            }
        });

        botonU = (ImageButton)findViewById(R.id.audioU);
        vocalU = MediaPlayer.create(this, R.raw.u);

        botonU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vocalU.start();
            }
        });

        next = (ImageButton) findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloMayaVocalesInicio.this, ModuloMayaVocalesNext.class);
                ModuloMayaVocalesInicio.this.startActivity(intentRec);
            }
        });

    }

}
