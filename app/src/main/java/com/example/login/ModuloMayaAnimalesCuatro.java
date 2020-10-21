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

public class ModuloMayaAnimalesCuatro extends AppCompatActivity {
    MediaPlayer pato;
    ImageButton botonPato;
    VideoView videoAnimales;
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_maya_animales_cuatro);

        botonPato = (ImageButton)findViewById(R.id.audioPato);
        pato = MediaPlayer.create(this, R.raw.pato);
        videoAnimales = findViewById(R.id.videoAnimales);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.videoanimales;
        Uri uri = Uri.parse(videoPath);
        videoAnimales.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoAnimales.setMediaController(mediaController);
        mediaController.setAnchorView(videoAnimales);

    }

    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.activity_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.itModuloMaya) {

            startActivity(new Intent(ModuloMayaAnimalesCuatro.this, ModuloMaya.class));

            return true;
        } else if (id == R.id.itModuloBolt) {

            startActivity(new Intent(ModuloMayaAnimalesCuatro.this, ModuloBolt.class));

            return true;
        } else if (id == R.id.itModuloSuperBolt) {

            startActivity(new Intent(ModuloMayaAnimalesCuatro.this, ModuloSuperBolt.class));

            return true;
        } else if (id == R.id.itInicio) {

            startActivity(new Intent(ModuloMayaAnimalesCuatro.this, Modulos.class));

            return true;
        } else if (id == R.id.itCerrarSesion) {

            mAuth.signOut();
            startActivity(new Intent(ModuloMayaAnimalesCuatro.this, MainActivity.class));
            finish();

            return true;
        } else if (id == R.id.itMiCuenta) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}