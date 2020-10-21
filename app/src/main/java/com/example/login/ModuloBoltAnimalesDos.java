package com.example.login;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloBoltAnimalesDos extends AppCompatActivity {

    MediaPlayer mono;
    MediaPlayer cocodrilo;
    MediaPlayer gorila;
    ImageButton botonMono;
    ImageButton botonCocodrilo;
    ImageButton botonGorila;
    ImageButton next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_bolt_animales_dos);

        botonMono = (ImageButton)findViewById(R.id.audioMono);
        mono = MediaPlayer.create(this, R.raw.mono);

        botonMono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mono.start();
            }
        });

        botonCocodrilo = (ImageButton)findViewById(R.id.audioCocodrilo);
        cocodrilo = MediaPlayer.create(this, R.raw.cocodrilo);

        botonCocodrilo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cocodrilo.start();
            }
        });

        botonGorila = (ImageButton)findViewById(R.id.audioGorila);
        gorila = MediaPlayer.create(this, R.raw.gorila);

        botonGorila.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gorila.start();
            }
        });

        next = (ImageButton) findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloBoltAnimalesDos.this, ModuloBoltAnimalesTres.class);
                ModuloBoltAnimalesDos.this.startActivity(intentRec);
            }
        });

    }

}