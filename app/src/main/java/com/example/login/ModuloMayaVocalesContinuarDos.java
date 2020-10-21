package com.example.login;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class ModuloMayaVocalesContinuarDos extends AppCompatActivity {
    MediaPlayer uvas;
    ImageButton botonUva;
    ImageButton botonPauseUva;
    VideoView videoVocales;
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_maya_vocales_continuar_dos);

        botonUva = (ImageButton)findViewById(R.id.botonUva);
        botonPauseUva = (ImageButton)findViewById(R.id.botonPauseUva);
        uvas = MediaPlayer.create(this, R.raw.uva);
        videoVocales = findViewById(R.id.videoVocales);

        botonUva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uvas.start();
            }
        });

        botonPauseUva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uvas.pause();
            }
        });

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.videovocales;
        Uri uri = Uri.parse(videoPath);
        videoVocales.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoVocales.setMediaController(mediaController);
        mediaController.setAnchorView(videoVocales);

    }

    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.activity_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.itModuloMaya) {

            startActivity(new Intent(ModuloMayaVocalesContinuarDos.this, ModuloMaya.class));

            return true;
        } else if (id == R.id.itModuloBolt) {

            startActivity(new Intent(ModuloMayaVocalesContinuarDos.this, ModuloBolt.class));

            return true;
        } else if (id == R.id.itModuloSuperBolt) {

            startActivity(new Intent(ModuloMayaVocalesContinuarDos.this, ModuloSuperBolt.class));

            return true;
        } else if (id == R.id.itInicio) {

            startActivity(new Intent(ModuloMayaVocalesContinuarDos.this, Modulos.class));

            return true;
        } else if (id == R.id.itCerrarSesion) {

            mAuth.signOut();
            startActivity(new Intent(ModuloMayaVocalesContinuarDos.this, MainActivity.class));
            finish();

            return true;
        } else if (id == R.id.itMiCuenta) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
