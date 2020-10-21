package com.example.login;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloBoltAnimalesTres extends AppCompatActivity {

    MediaPlayer cebra;
    MediaPlayer tigre;
    MediaPlayer Rinoceronte;
    ImageButton botonCebra;
    ImageButton botonTigre;
    ImageButton botonRinoceronte;
    ImageButton next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_bolt_animales_tres);

        botonCebra = (ImageButton)findViewById(R.id.audioCebra);
        cebra = MediaPlayer.create(this, R.raw.cebra);

        botonCebra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cebra.start();
            }
        });

        botonTigre = (ImageButton)findViewById(R.id.audioTigre);
        tigre = MediaPlayer.create(this, R.raw.tigre);

        botonTigre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tigre.start();
            }
        });

        botonRinoceronte = (ImageButton)findViewById(R.id.audioRinoceronte);
        Rinoceronte = MediaPlayer.create(this, R.raw.rinoceronte);

        botonRinoceronte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Rinoceronte.start();
            }
        });

        next = (ImageButton) findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloBoltAnimalesTres.this, ModuloBoltAnimalesCuatro.class);
                ModuloBoltAnimalesTres.this.startActivity(intentRec);
            }
        });

    }

}
