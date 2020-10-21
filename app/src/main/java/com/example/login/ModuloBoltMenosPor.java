package com.example.login;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloBoltMenosPor extends AppCompatActivity {

    MediaPlayer menos;
    MediaPlayer por;
    ImageButton botonMenos;
    ImageButton botonPor;
    ImageButton next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_bolt_menos_por);

        botonMenos = (ImageButton)findViewById(R.id.audioMenos);
        menos = MediaPlayer.create(this, R.raw.menos);

        botonMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menos.start();
            }
        });

        botonPor = (ImageButton)findViewById(R.id.audioPor);
        por = MediaPlayer.create(this, R.raw.porr);

        botonPor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                por.start();
            }
        });

        next = (ImageButton) findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloBoltMenosPor.this, ModuloBoltSignosVideo.class);
                ModuloBoltMenosPor.this.startActivity(intentRec);
            }
        });

    }

}
