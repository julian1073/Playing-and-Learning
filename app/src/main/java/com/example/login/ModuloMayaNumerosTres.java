package com.example.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloMayaNumerosTres extends AppCompatActivity {
    VideoView videoNumerosTreinta;
    ImageButton siguienteNumerosCuatro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_maya_numeros_tres);

        videoNumerosTreinta = findViewById(R.id.videoNumerosTreinta);

        siguienteNumerosCuatro = (ImageButton) findViewById(R.id.siguienteNumerosTres);

        siguienteNumerosCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloMayaNumerosTres.this, ModuloMayaNumerosCuatro.class);
                ModuloMayaNumerosTres.this.startActivity(intentRec);
            }
        });

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.videonumerosveintetreinta;
        Uri uri = Uri.parse(videoPath);
        videoNumerosTreinta.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoNumerosTreinta.setMediaController(mediaController);
        mediaController.setAnchorView(videoNumerosTreinta);

    }
}
