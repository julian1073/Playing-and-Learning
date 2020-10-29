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

public class ModuloBoltAnimalesCinco extends AppCompatActivity {
    VideoView videoAnimalesSalvajes;
    ImageButton siguienteC6;
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_bolt_animales_cinco);

        videoAnimalesSalvajes = findViewById(R.id.videoAnimalesSalvajes);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.videoanimales;
        Uri uri = Uri.parse(videoPath);
        videoAnimalesSalvajes.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoAnimalesSalvajes.setMediaController(mediaController);
        mediaController.setAnchorView(videoAnimalesSalvajes);

        siguienteC6 = (ImageButton) findViewById(R.id.siguienteC6);
        siguienteC6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentRec = new Intent(ModuloBoltAnimalesCinco.this, ModuloBoltMedalla.class);
                ModuloBoltAnimalesCinco.this.startActivity(intentRec);
            }
        });

    }
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.activity_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.itModuloMaya) {

            startActivity(new Intent(ModuloBoltAnimalesCinco.this, ModuloMaya.class));

            return true;
        } else if (id == R.id.itModuloBolt) {

            startActivity(new Intent(ModuloBoltAnimalesCinco.this, ModuloBolt.class));

            return true;
        } else if (id == R.id.itModuloSuperBolt) {

            startActivity(new Intent(ModuloBoltAnimalesCinco.this, ModuloSuperBolt.class));

            return true;
        } else if (id == R.id.itInicio) {

            startActivity(new Intent(ModuloBoltAnimalesCinco.this, Modulos.class));

            return true;
        } else if (id == R.id.itCerrarSesion) {

            mAuth.signOut();
            startActivity(new Intent(ModuloBoltAnimalesCinco.this, MainActivity.class));
            finish();

            return true;
        } else if (id == R.id.itMiCuenta) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}


