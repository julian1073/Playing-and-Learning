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

import com.example.login.R;

public class ModuloMayaColorAzulVideo extends AppCompatActivity {

    VideoView videoAzul;
    ImageButton rojosiguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_maya_color_azul_video);
        videoAzul = findViewById(R.id.videoAzul);

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.cancionazul;
        Uri uri = Uri.parse(videoPath);
        videoAzul.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoAzul.setMediaController(mediaController);
        mediaController.setAnchorView(videoAzul);

        rojosiguiente = (ImageButton) findViewById(R.id.rojosiguiente);

        rojosiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloMayaColorAzulVideo.this, ModuloMayaColorRojo.class);
                ModuloMayaColorAzulVideo.this.startActivity(intentRec);
            }
        });
    }

}