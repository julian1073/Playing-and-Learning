package com.example.login;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.login.R;

public class ModuloMayaColorAmarillo extends AppCompatActivity {
    ImageButton amarillo;
    MediaPlayer amarilloVoz;
    ImageButton video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_maya_color_amarillo);

        amarillo = (ImageButton)findViewById(R.id.amarillo);
        amarilloVoz = MediaPlayer.create(this, R.raw.amarillo);

        amarillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amarilloVoz.start();
            }
        });
        video = (ImageButton) findViewById(R.id.video);

        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloMayaColorAmarillo.this, ModuloMayaColorAmarilloVideo.class);
                ModuloMayaColorAmarillo.this.startActivity(intentRec);
            }
        });
    }
}
