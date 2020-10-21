package com.example.login;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloBoltColorNaranja extends AppCompatActivity {

    MediaPlayer naranja;
    ImageButton botonNaranja;
    ImageButton next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_bolt_color_naranja);

        botonNaranja = (ImageButton)findViewById(R.id.audioNaranja);
        naranja = MediaPlayer.create(this, R.raw.naranja);

        botonNaranja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                naranja.start();
            }
        });

        next = (ImageButton) findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloBoltColorNaranja.this, ModuloBoltColorVerde.class);
                ModuloBoltColorNaranja.this.startActivity(intentRec);
            }
        });

    }

}