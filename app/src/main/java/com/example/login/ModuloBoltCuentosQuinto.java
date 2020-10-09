package com.example.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloBoltCuentosQuinto extends AppCompatActivity {
    VideoView videoCuentoQuinto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_bolt_cuentos_quinto);

        videoCuentoQuinto = findViewById(R.id.videoCuentoQuinto);


        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.cuentoperro;
        Uri uri = Uri.parse(videoPath);
        videoCuentoQuinto.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoCuentoQuinto.setMediaController(mediaController);
        mediaController.setAnchorView(videoCuentoQuinto);
    }
}
