package com.example.login;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloMayaAnimalesTres extends AppCompatActivity {

    MediaPlayer oveja;
    MediaPlayer burro;
    MediaPlayer cabra;
    ImageButton botonOveja;
    ImageButton botonBurro;
    ImageButton botonCabra;
    ImageButton next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_maya_animales_tres);

        botonOveja = (ImageButton)findViewById(R.id.audioOveja);
        oveja = MediaPlayer.create(this, R.raw.oveja);

        botonOveja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oveja.start();
            }
        });

        botonBurro = (ImageButton)findViewById(R.id.audioBurro);
        burro = MediaPlayer.create(this, R.raw.burro);

        botonBurro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                burro.start();
            }
        });

        botonCabra = (ImageButton)findViewById(R.id.audioCabra);
        cabra = MediaPlayer.create(this, R.raw.cabra);

        botonCabra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cabra.start();
            }
        });

        next = (ImageButton) findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloMayaAnimalesTres.this, ModuloMayaAnimalesCuatro.class);
                ModuloMayaAnimalesTres.this.startActivity(intentRec);
            }
        });

    }

}