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

public class ModuloSuperBoltColoresInglesVerde extends AppCompatActivity {
    VideoView videoVerde;
    ImageButton siguiente;
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_super_bolt_colores_ingles_verde);

        siguiente = (ImageButton) findViewById(R.id.SiguienteRojo);
        videoVerde = findViewById(R.id.VideoGreen);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloSuperBoltColoresInglesVerde.this, ModuloSuperBoltColoresInglesRojo.class);
                ModuloSuperBoltColoresInglesVerde.this.startActivity(intentRec);
            }
        });
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.green;
        Uri uri = Uri.parse(videoPath);
        videoVerde.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoVerde.setMediaController(mediaController);
        mediaController.setAnchorView(videoVerde);

    }
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.activity_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.itModuloMaya) {

            startActivity(new Intent(ModuloSuperBoltColoresInglesVerde.this, ModuloMaya.class));

            return true;
        } else if (id == R.id.itModuloBolt) {

            startActivity(new Intent(ModuloSuperBoltColoresInglesVerde.this, ModuloBolt.class));

            return true;
        } else if (id == R.id.itModuloSuperBolt) {

            startActivity(new Intent(ModuloSuperBoltColoresInglesVerde.this, ModuloSuperBolt.class));

            return true;
        } else if (id == R.id.itInicio) {

            startActivity(new Intent(ModuloSuperBoltColoresInglesVerde.this, Modulos.class));

            return true;
        } else if (id == R.id.itCerrarSesion) {

            mAuth.signOut();
            startActivity(new Intent(ModuloSuperBoltColoresInglesVerde.this, MainActivity.class));
            finish();

            return true;
        } else if (id == R.id.itMiCuenta) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}

