package com.example.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloMayaColorAmarilloVideo extends AppCompatActivity {

    VideoView videoAmarillo;
    ImageButton siguienterojo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_maya_color_amarillo_video);

        videoAmarillo = findViewById(R.id.videoAzul);

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.cancionamarillo;
        Uri uri = Uri.parse(videoPath);
        videoAmarillo.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoAmarillo.setMediaController(mediaController);
        mediaController.setAnchorView(videoAmarillo);

        siguienterojo = (ImageButton) findViewById(R.id.rojosiguiente);

        siguienterojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloMayaColorAmarilloVideo.this, ModuloMayaColorAzul.class);
                ModuloMayaColorAmarilloVideo.this.startActivity(intentRec);
            }
        });
    }
}