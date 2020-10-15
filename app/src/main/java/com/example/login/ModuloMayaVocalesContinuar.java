package com.example.login;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloMayaVocalesContinuar extends AppCompatActivity {

    MediaPlayer iguana;
    MediaPlayer oso;
    ImageButton botonIguana;
    ImageButton botonOso;
    ImageButton botonPauseIguana;
    ImageButton botonPauseOso;
    ImageButton siguienteTres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_maya_vocales_continuar);

        botonIguana = (ImageButton)findViewById(R.id.botonIguana);
        botonPauseIguana = (ImageButton)findViewById(R.id.botonPauseIguana);
        iguana = MediaPlayer.create(this, R.raw.iguana);

        botonIguana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iguana.start();
            }
        });

        botonPauseIguana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iguana.pause();
            }
        });

        botonOso = (ImageButton)findViewById(R.id.botonOso);
        botonPauseOso = (ImageButton)findViewById(R.id.botonPauseOso);
        oso = MediaPlayer.create(this, R.raw.oso);

        botonOso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oso.start();
            }
        });

        botonPauseOso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oso.pause();
            }
        });

        siguienteTres = (ImageButton) findViewById(R.id.siguiente3);

        siguienteTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloMayaVocalesContinuar.this, ModuloMayaVocalesContinuarDos.class);
                ModuloMayaVocalesContinuar.this.startActivity(intentRec);
            }
        });

    }
}
