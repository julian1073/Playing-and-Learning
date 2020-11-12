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

public class ModuloSuperBoltColoresInglesAmarillo extends AppCompatActivity {
    VideoView videoAmarillo;
    ImageButton siguiente;
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_super_bolt_colores_ingles_amarillo);
        siguiente = (ImageButton) findViewById(R.id.SiguienteVerde);
        videoAmarillo = findViewById(R.id.VideoAmarillo);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloSuperBoltColoresInglesAmarillo.this, ModuloSuperBoltColoresInglesVerde.class);
                ModuloSuperBoltColoresInglesAmarillo.this.startActivity(intentRec);
            }
        });

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.yellow;
        Uri uri = Uri.parse(videoPath);
        videoAmarillo.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoAmarillo.setMediaController(mediaController);
        mediaController.setAnchorView(videoAmarillo);

    }
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.activity_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.itModuloMaya) {

            startActivity(new Intent(ModuloSuperBoltColoresInglesAmarillo.this, ModuloMaya.class));

            return true;
        } else if (id == R.id.itModuloBolt) {

            startActivity(new Intent(ModuloSuperBoltColoresInglesAmarillo.this, ModuloBolt.class));

            return true;
        } else if (id == R.id.itModuloSuperBolt) {

            startActivity(new Intent(ModuloSuperBoltColoresInglesAmarillo.this, ModuloSuperBolt.class));

            return true;
        } else if (id == R.id.itInicio) {

            startActivity(new Intent(ModuloSuperBoltColoresInglesAmarillo.this, Modulos.class));

            return true;
        } else if (id == R.id.itCerrarSesion) {

            mAuth.signOut();
            startActivity(new Intent(ModuloSuperBoltColoresInglesAmarillo.this, MainActivity.class));
            finish();

            return true;
        } else if (id == R.id.itMiCuenta) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
