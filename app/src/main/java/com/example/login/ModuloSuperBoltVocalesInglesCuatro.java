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

public class ModuloSuperBoltVocalesInglesCuatro extends AppCompatActivity {
    MediaPlayer umbrella;
    ImageButton botonUmbrella;
    VideoView videoVocalesIngles;
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_super_bolt_vocales_ingles_cuatro);

        botonUmbrella = (ImageButton)findViewById(R.id.botonUmbrella);
        umbrella = MediaPlayer.create(this, R.raw.umbrella);
        videoVocalesIngles = findViewById(R.id.videoVocalesIngles);

        botonUmbrella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                umbrella.start();
            }
        });

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.vocalesingles;
        Uri uri = Uri.parse(videoPath);
        videoVocalesIngles.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoVocalesIngles.setMediaController(mediaController);
        mediaController.setAnchorView(videoVocalesIngles);

    }

    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.activity_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.itModuloMaya) {

            startActivity(new Intent(ModuloSuperBoltVocalesInglesCuatro.this, ModuloMaya.class));

            return true;
        } else if (id == R.id.itModuloBolt) {

            startActivity(new Intent(ModuloSuperBoltVocalesInglesCuatro.this, ModuloBolt.class));

            return true;
        } else if (id == R.id.itModuloSuperBolt) {

            startActivity(new Intent(ModuloSuperBoltVocalesInglesCuatro.this, ModuloSuperBolt.class));

            return true;
        } else if (id == R.id.itInicio) {

            startActivity(new Intent(ModuloSuperBoltVocalesInglesCuatro.this, Modulos.class));

            return true;
        } else if (id == R.id.itCerrarSesion) {

            mAuth.signOut();
            startActivity(new Intent(ModuloSuperBoltVocalesInglesCuatro.this, MainActivity.class));
            finish();

            return true;
        } else if (id == R.id.itMiCuenta) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
