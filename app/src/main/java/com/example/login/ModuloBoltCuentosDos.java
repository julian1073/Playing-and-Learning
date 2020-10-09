package com.example.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloBoltCuentosDos extends AppCompatActivity {
    VideoView videoCuentoDos;
    ImageButton siguienteCuentosTres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_bolt_cuentos_dos);

        videoCuentoDos = findViewById(R.id.videoCuentoDos);


        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.cuentosnumeros;
        Uri uri = Uri.parse(videoPath);
        videoCuentoDos.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoCuentoDos.setMediaController(mediaController);
        mediaController.setAnchorView(videoCuentoDos);

        siguienteCuentosTres = (ImageButton) findViewById(R.id.siguienteCuentosTres);

        siguienteCuentosTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloBoltCuentosDos.this, ModuloBoltCuentosTres.class);
                ModuloBoltCuentosDos.this.startActivity(intentRec);
            }
        });
    }
}
