package com.example.login;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloMayaAnimalesCuatro extends AppCompatActivity {
    MediaPlayer pato;
    ImageButton botonPato;
    VideoView videoAnimales;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_maya_animales_cuatro);

        botonPato = (ImageButton)findViewById(R.id.audioPato);
        pato = MediaPlayer.create(this, R.raw.pato);
        videoAnimales = findViewById(R.id.videoAnimales);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.videoanimales;
        Uri uri = Uri.parse(videoPath);
        videoAnimales.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoAnimales.setMediaController(mediaController);
        mediaController.setAnchorView(videoAnimales);

    }
}