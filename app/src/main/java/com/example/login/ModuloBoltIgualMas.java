package com.example.login;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloBoltIgualMas extends AppCompatActivity {

    MediaPlayer igual;
    MediaPlayer mas;
    ImageButton botonIgual;
    ImageButton botonMas;
    ImageButton next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_bolt_igual_mas);

        botonIgual = (ImageButton)findViewById(R.id.audioIgual);
        igual = MediaPlayer.create(this, R.raw.igual);

        botonIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                igual.start();
            }
        });

        botonMas = (ImageButton)findViewById(R.id.audioMas);
        mas = MediaPlayer.create(this, R.raw.mas);

        botonMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mas.start();
            }
        });

        next = (ImageButton) findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloBoltIgualMas.this, ModuloBoltMenosPor.class);
                ModuloBoltIgualMas.this.startActivity(intentRec);
            }
        });

    }

}
