package com.example.login;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.login.R;

public class ModuloMayaColorRojo extends AppCompatActivity {
    ImageButton rojo;
    MediaPlayer rojovoz;
    ImageButton video3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_maya_color_rojo);

        rojo = (ImageButton)findViewById(R.id.rojo);
        rojovoz = MediaPlayer.create(this, R.raw.rojo);

        rojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rojovoz.start();
            }
        });
        video3 = (ImageButton) findViewById(R.id.video3);

        video3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloMayaColorRojo.this, ModuloMayaColorRojoVideo.class);
                ModuloMayaColorRojo.this.startActivity(intentRec);
            }
        });
    }
}
