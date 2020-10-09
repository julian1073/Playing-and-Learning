package com.example.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloBoltCuentosUno extends AppCompatActivity {
    VideoView videoCuentoUno;
    ImageButton siguienteCuentosDos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_bolt_cuentos_uno);

        videoCuentoUno = findViewById(R.id.videoCuentoUno);


        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.cuentovocales;
        Uri uri = Uri.parse(videoPath);
        videoCuentoUno.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoCuentoUno.setMediaController(mediaController);
        mediaController.setAnchorView(videoCuentoUno);

        siguienteCuentosDos = (ImageButton) findViewById(R.id.siguienteCuentosDos);

        siguienteCuentosDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloBoltCuentosUno.this, ModuloBoltCuentosDos.class);
                ModuloBoltCuentosUno.this.startActivity(intentRec);
            }
        });

    }
}
