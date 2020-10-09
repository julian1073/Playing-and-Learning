package com.example.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloMayaColorRojoVideo extends AppCompatActivity {

    VideoView videoRojo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_maya_color_rojo_video);

        videoRojo = findViewById(R.id.videoRojo);

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.cancionrojo;
        Uri uri = Uri.parse(videoPath);
        videoRojo.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoRojo.setMediaController(mediaController);
        mediaController.setAnchorView(videoRojo);

    }
}