package com.example.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloMayaNumerosCinco extends AppCompatActivity {

    VideoView videoNumerosCincuenta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_maya_numeros_cinco);

        videoNumerosCincuenta = findViewById(R.id.videoNumerosCincuenta);


        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.videonumeroscuarentacincuenta;
        Uri uri = Uri.parse(videoPath);
        videoNumerosCincuenta.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoNumerosCincuenta.setMediaController(mediaController);
        mediaController.setAnchorView(videoNumerosCincuenta);

    }
}
