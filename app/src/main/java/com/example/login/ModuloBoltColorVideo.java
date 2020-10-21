package com.example.login;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloBoltColorVideo extends AppCompatActivity {
    VideoView videoColoresSecundarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_bolt_colores_video);

        videoColoresSecundarios = findViewById(R.id.videoColoresSecundarios);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.colorsecu;
        Uri uri = Uri.parse(videoPath);
        videoColoresSecundarios.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoColoresSecundarios.setMediaController(mediaController);
        mediaController.setAnchorView(videoColoresSecundarios);

    }
}
