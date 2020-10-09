package com.example.login;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloMayaNumerosUno extends AppCompatActivity {
    VideoView videoNumerosDiez;
    ImageButton siguienteNumerosDos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_maya_numeros_uno);

        videoNumerosDiez = findViewById(R.id.videoNumerosDiez);

        siguienteNumerosDos = (ImageButton) findViewById(R.id.siguienteNumerosDos);

        siguienteNumerosDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloMayaNumerosUno.this, ModuloMayaNumerosDos.class);
                ModuloMayaNumerosUno.this.startActivity(intentRec);
            }
        });

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.videonumerosunodiez;
        Uri uri = Uri.parse(videoPath);
        videoNumerosDiez.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoNumerosDiez.setMediaController(mediaController);
        mediaController.setAnchorView(videoNumerosDiez);

    }
}
