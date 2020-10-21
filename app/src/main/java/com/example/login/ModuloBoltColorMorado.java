package com.example.login;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloBoltColorMorado extends AppCompatActivity {

    MediaPlayer morado;
    ImageButton botonMorado;
    ImageButton next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_bolt_color_morado);

        botonMorado = (ImageButton)findViewById(R.id.audioMorado);
        morado = MediaPlayer.create(this, R.raw.violeta);

        botonMorado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                morado.start();
            }
        });

        next = (ImageButton) findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloBoltColorMorado.this, ModuloBoltColorNaranja.class);
                ModuloBoltColorMorado.this.startActivity(intentRec);
            }
        });

    }

}