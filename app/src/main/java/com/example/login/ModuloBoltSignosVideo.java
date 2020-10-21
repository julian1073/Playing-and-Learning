package com.example.login;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloBoltSignosVideo extends AppCompatActivity {
    VideoView videoSignos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_bolt_signos_video);

        videoSignos = findViewById(R.id.videoSignos);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.videosignos;
        Uri uri = Uri.parse(videoPath);
        videoSignos.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoSignos.setMediaController(mediaController);
        mediaController.setAnchorView(videoSignos);

    }
}
