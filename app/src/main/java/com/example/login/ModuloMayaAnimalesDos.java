package com.example.login;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloMayaAnimalesDos extends AppCompatActivity {

    MediaPlayer caballo;
    MediaPlayer gallina;
    MediaPlayer conejo;
    ImageButton botonCaballo;
    ImageButton botonGallina;
    ImageButton botonConejo;
    ImageButton next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_maya_animales_dos);

        botonCaballo = (ImageButton)findViewById(R.id.audioCaballo);
        caballo = MediaPlayer.create(this, R.raw.caballo);

        botonCaballo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                caballo.start();
            }
        });

        botonGallina = (ImageButton)findViewById(R.id.audioGallina);
        gallina = MediaPlayer.create(this, R.raw.gallina);

        botonGallina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gallina.start();
            }
        });

        botonConejo = (ImageButton)findViewById(R.id.audioConejo);
        conejo = MediaPlayer.create(this, R.raw.conejo);

        botonConejo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conejo.start();
            }
        });

        next = (ImageButton) findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloMayaAnimalesDos.this, ModuloMayaAnimalesTres.class);
                ModuloMayaAnimalesDos.this.startActivity(intentRec);
            }
        });

    }

}