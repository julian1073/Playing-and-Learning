package com.example.login;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.auth.FirebaseAuth;

public class ModuloSuperBoltColoresInglesNaranja extends AppCompatActivity {
    ImageButton siguiente;
    VideoView videoNaranja;

    private FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_super_bolt_colores_ingles_naranja);
        siguiente = (ImageButton) findViewById(R.id.SiguienteFin);
        videoNaranja = findViewById(R.id.VideoNaranja);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloSuperBoltColoresInglesNaranja.this, ModuloSuperBoltColoresFin.class);
                ModuloSuperBoltColoresInglesNaranja.this.startActivity(intentRec);
            }
        });

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.norangcolor;
        Uri uri = Uri.parse(videoPath);
        videoNaranja.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoNaranja.setMediaController(mediaController);
        mediaController.setAnchorView(videoNaranja);
    }
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.activity_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.itModuloMaya) {

            startActivity(new Intent(ModuloSuperBoltColoresInglesNaranja.this, ModuloMaya.class));

            return true;
        } else if (id == R.id.itModuloBolt) {

            startActivity(new Intent(ModuloSuperBoltColoresInglesNaranja.this, ModuloBolt.class));

            return true;
        } else if (id == R.id.itModuloSuperBolt) {

            startActivity(new Intent(ModuloSuperBoltColoresInglesNaranja.this, ModuloSuperBolt.class));

            return true;
        } else if (id == R.id.itInicio) {

            startActivity(new Intent(ModuloSuperBoltColoresInglesNaranja.this, Modulos.class));

            return true;
        } else if (id == R.id.itCerrarSesion) {

            mAuth.signOut();
            startActivity(new Intent(ModuloSuperBoltColoresInglesNaranja.this, MainActivity.class));
            finish();

            return true;
        } else if (id == R.id.itMiCuenta) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}

