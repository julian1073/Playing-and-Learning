package com.example.login;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloSuperBoltVocalesInglesDos extends AppCompatActivity {
    MediaPlayer apple;
    MediaPlayer egg;
    ImageButton botonApple;
    ImageButton botonEgg;
    ImageButton siguienteVocalesInglesDos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_super_bolt_vocales_ingles_dos);

        botonApple = (ImageButton)findViewById(R.id.botonApple);
        apple = MediaPlayer.create(this, R.raw.apple);

        botonApple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                apple.start();
            }
        });


        botonEgg = (ImageButton)findViewById(R.id.botonEgg);
        egg = MediaPlayer.create(this, R.raw.egg);

        botonEgg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                egg.start();
            }
        });

        siguienteVocalesInglesDos = (ImageButton) findViewById(R.id.siguienteVocalesInglesDos);

        siguienteVocalesInglesDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloSuperBoltVocalesInglesDos.this, ModuloSuperBoltVocalesInglesTres.class);
                ModuloSuperBoltVocalesInglesDos.this.startActivity(intentRec);
            }
        });

    }
}
