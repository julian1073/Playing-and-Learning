package com.example.login;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloMayaColorAzul extends AppCompatActivity {
    ImageButton azul;
    MediaPlayer azulVoz;
    ImageButton video2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_maya_color_azul);

        azul = (ImageButton)findViewById(R.id.azul);
        azulVoz = MediaPlayer.create(this, R.raw.azul);

        azul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                azulVoz.start();
            }
        });
        video2 = (ImageButton) findViewById(R.id.video2);

        video2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloMayaColorAzul.this, ModuloMayaColorAzulVideo.class);
                ModuloMayaColorAzul.this.startActivity(intentRec);
            }
        });
    }
}
