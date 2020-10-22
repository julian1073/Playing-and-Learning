package com.example.login;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloSuperBoltVocalesInglesCuatro extends AppCompatActivity {
    MediaPlayer umbrella;
    ImageButton botonUmbrella;
    VideoView videoVocalesIngles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_super_bolt_vocales_ingles_cuatro);

        botonUmbrella = (ImageButton)findViewById(R.id.botonUmbrella);
        umbrella = MediaPlayer.create(this, R.raw.umbrella);
        videoVocalesIngles = findViewById(R.id.videoVocalesIngles);

        botonUmbrella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                umbrella.start();
            }
        });

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.vocalesingles;
        Uri uri = Uri.parse(videoPath);
        videoVocalesIngles.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoVocalesIngles.setMediaController(mediaController);
        mediaController.setAnchorView(videoVocalesIngles);

    }
}
