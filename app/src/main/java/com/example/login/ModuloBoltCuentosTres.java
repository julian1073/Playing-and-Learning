package com.example.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloBoltCuentosTres extends AppCompatActivity {
    VideoView videoCuentoTres;
    ImageButton siguienteCuentosCuatro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_bolt_cuentos_tres);

        videoCuentoTres = findViewById(R.id.videoCuentoTres);


        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.cuentoanimales;
        Uri uri = Uri.parse(videoPath);
        videoCuentoTres.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoCuentoTres.setMediaController(mediaController);
        mediaController.setAnchorView(videoCuentoTres);

        siguienteCuentosCuatro = (ImageButton) findViewById(R.id.siguienteCuentoCuatro);

        siguienteCuentosCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloBoltCuentosTres.this, ModuloBoltCuentosCuatro.class);
                ModuloBoltCuentosTres.this.startActivity(intentRec);
            }
        });
    }
}
