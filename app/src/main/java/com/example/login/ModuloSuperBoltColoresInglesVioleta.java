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

public class ModuloSuperBoltColoresInglesVioleta extends AppCompatActivity {
    ImageButton siguiente;
    VideoView videoVioleta;
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_super_bolt_colores_ingles_violeta);
        siguiente = (ImageButton) findViewById(R.id.SiguienteAmarillo);
        videoVioleta = findViewById(R.id.VideoPurpple);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloSuperBoltColoresInglesVioleta.this, ModuloSuperBoltColoresInglesAmarillo.class);
                ModuloSuperBoltColoresInglesVioleta.this.startActivity(intentRec);
            }
        });
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.purpple;
        Uri uri = Uri.parse(videoPath);
        videoVioleta.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoVioleta.setMediaController(mediaController);
        mediaController.setAnchorView(videoVioleta);

    }
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.activity_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.itModuloMaya) {

            startActivity(new Intent(ModuloSuperBoltColoresInglesVioleta.this, ModuloMaya.class));

            return true;
        } else if (id == R.id.itModuloBolt) {

            startActivity(new Intent(ModuloSuperBoltColoresInglesVioleta.this, ModuloBolt.class));

            return true;
        } else if (id == R.id.itModuloSuperBolt) {

            startActivity(new Intent(ModuloSuperBoltColoresInglesVioleta.this, ModuloSuperBolt.class));

            return true;
        } else if (id == R.id.itInicio) {

            startActivity(new Intent(ModuloSuperBoltColoresInglesVioleta.this, Modulos.class));

            return true;
        } else if (id == R.id.itCerrarSesion) {

            mAuth.signOut();
            startActivity(new Intent(ModuloSuperBoltColoresInglesVioleta.this, MainActivity.class));
            finish();

            return true;
        } else if (id == R.id.itMiCuenta) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}

