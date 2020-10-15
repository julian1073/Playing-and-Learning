package com.example.login;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloMayaVocalesContinuarDos extends AppCompatActivity {
    MediaPlayer uvas;
    ImageButton botonUva;
    ImageButton botonPauseUva;
    VideoView videoVocales;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_maya_vocales_continuar_dos);

        botonUva = (ImageButton)findViewById(R.id.botonUva);
        botonPauseUva = (ImageButton)findViewById(R.id.botonPauseUva);
        uvas = MediaPlayer.create(this, R.raw.uva);
        videoVocales = findViewById(R.id.videoVocales);

        botonUva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uvas.start();
            }
        });

        botonPauseUva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uvas.pause();
            }
        });

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.videovocales;
        Uri uri = Uri.parse(videoPath);
        videoVocales.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoVocales.setMediaController(mediaController);
        mediaController.setAnchorView(videoVocales);

    }
}
