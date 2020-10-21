package com.example.login;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloBoltColorVerde extends AppCompatActivity {

    MediaPlayer verde;
    ImageButton botonVerde;
    ImageButton next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_bolt_color_verde);

        botonVerde = (ImageButton)findViewById(R.id.audioVerde);
        verde = MediaPlayer.create(this, R.raw.verde);

        botonVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verde.start();
            }
        });

        next = (ImageButton) findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloBoltColorVerde.this, ModuloBoltColorVideo.class);
                ModuloBoltColorVerde.this.startActivity(intentRec);
            }
        });

    }

}