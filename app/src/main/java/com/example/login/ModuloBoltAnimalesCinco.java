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

public class ModuloBoltAnimalesCinco extends AppCompatActivity {
    VideoView videoAnimalesSalvajes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_bolt_animales_cinco);

        videoAnimalesSalvajes = findViewById(R.id.videoAnimalesSalvajes);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.videoanimales;
        Uri uri = Uri.parse(videoPath);
        videoAnimalesSalvajes.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoAnimalesSalvajes.setMediaController(mediaController);
        mediaController.setAnchorView(videoAnimalesSalvajes);



    }
}
