package com.example.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloMayaNumerosDos extends AppCompatActivity {
    VideoView videoNumerosVeinte;
    ImageButton siguienteNumerosTres;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_maya_numeros_dos);

        videoNumerosVeinte = findViewById(R.id.videoNumerosVeinte);

        siguienteNumerosTres = (ImageButton) findViewById(R.id.siguienteNumerosTres);

        siguienteNumerosTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloMayaNumerosDos.this, ModuloMayaNumerosTres.class);
                ModuloMayaNumerosDos.this.startActivity(intentRec);
            }
        });

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.videonumerosdiezveinte;
        Uri uri = Uri.parse(videoPath);
        videoNumerosVeinte.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoNumerosVeinte.setMediaController(mediaController);
        mediaController.setAnchorView(videoNumerosVeinte);

    }


}
