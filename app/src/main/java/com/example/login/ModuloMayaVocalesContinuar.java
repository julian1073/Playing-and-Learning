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
    ImageButton siguienteTres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_maya_vocales_continuar);

        botonIguana = (ImageButton)findViewById(R.id.botonIguana);
        iguana = MediaPlayer.create(this, R.raw.iguana);

        botonIguana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iguana.start();
            }
        });

        botonOso = (ImageButton)findViewById(R.id.botonOso);
        oso = MediaPlayer.create(this, R.raw.oso);

        botonOso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oso.start();
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
