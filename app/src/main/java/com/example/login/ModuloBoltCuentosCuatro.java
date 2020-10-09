package com.example.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloBoltCuentosCuatro extends AppCompatActivity {
    VideoView videoCuentoCuarto;
    ImageButton siguienteCuentosQuinto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_bolt_cuentos_cuatro);

        videoCuentoCuarto = findViewById(R.id.videoCuentoCuatro);


        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.cuentoscolores;
        Uri uri = Uri.parse(videoPath);
        videoCuentoCuarto.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoCuentoCuarto.setMediaController(mediaController);
        mediaController.setAnchorView(videoCuentoCuarto);

        siguienteCuentosQuinto = (ImageButton) findViewById(R.id.siguienteCuentoCinco);

        siguienteCuentosQuinto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloBoltCuentosCuatro.this, ModuloBoltCuentosQuinto.class);
                ModuloBoltCuentosCuatro.this.startActivity(intentRec);
            }
        });
    }
}
