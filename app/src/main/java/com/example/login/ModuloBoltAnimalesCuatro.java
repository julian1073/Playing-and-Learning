package com.example.login;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloBoltAnimalesCuatro extends AppCompatActivity {

    MediaPlayer oso;
    MediaPlayer lobo;
    ImageButton botonOso;
    ImageButton botonLobo;
    ImageButton next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_bolt_animales_cuatro);

        botonOso = (ImageButton)findViewById(R.id.audioOso);
        oso = MediaPlayer.create(this, R.raw.osoo);

        botonOso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oso.start();
            }
        });

        botonLobo = (ImageButton)findViewById(R.id.audioLobo);
        lobo = MediaPlayer.create(this, R.raw.lobo);

        botonLobo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lobo.start();
            }
        });

        next = (ImageButton) findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloBoltAnimalesCuatro.this, ModuloBoltAnimalesCinco.class);
                ModuloBoltAnimalesCuatro.this.startActivity(intentRec);
            }
        });

    }

}