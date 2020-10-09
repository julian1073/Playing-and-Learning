package com.example.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloMayaNumerosCuatro extends AppCompatActivity {
    VideoView videoNumerosCuarenta;
    ImageButton siguienteNumerosCinco;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_maya_numeros_cuatro);

        videoNumerosCuarenta = findViewById(R.id.videoNumerosCuarenta);

        siguienteNumerosCinco = (ImageButton) findViewById(R.id.siguienteNumerosCuatro);

        siguienteNumerosCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloMayaNumerosCuatro.this, ModuloMayaNumerosCinco.class);
                ModuloMayaNumerosCuatro.this.startActivity(intentRec);
            }
        });

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.videonumerostreintacuarenta;
        Uri uri = Uri.parse(videoPath);
        videoNumerosCuarenta.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoNumerosCuarenta.setMediaController(mediaController);
        mediaController.setAnchorView(videoNumerosCuarenta);

    }
}
