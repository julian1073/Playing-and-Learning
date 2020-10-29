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

public class ModuloBoltColorVideo extends AppCompatActivity {
    VideoView videoColoresSecundarios;
    ImageButton siguienteC7;
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_bolt_colores_video);

        videoColoresSecundarios = findViewById(R.id.videoColoresSecundarios);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.colorsecu;
        Uri uri = Uri.parse(videoPath);
        videoColoresSecundarios.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoColoresSecundarios.setMediaController(mediaController);
        mediaController.setAnchorView(videoColoresSecundarios);

        siguienteC7 = (ImageButton) findViewById(R.id.siguienteC7);
        siguienteC7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentRec = new Intent(ModuloBoltColorVideo.this, ModuloBoltMedalla.class);
                ModuloBoltColorVideo.this.startActivity(intentRec);
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

            startActivity(new Intent(ModuloBoltColorVideo.this, ModuloMaya.class));

            return true;
        } else if (id == R.id.itModuloBolt) {

            startActivity(new Intent(ModuloBoltColorVideo.this, ModuloBolt.class));

            return true;
        } else if (id == R.id.itModuloSuperBolt) {

            startActivity(new Intent(ModuloBoltColorVideo.this, ModuloSuperBolt.class));

            return true;
        } else if (id == R.id.itInicio) {

            startActivity(new Intent(ModuloBoltColorVideo.this, Modulos.class));

            return true;
        } else if (id == R.id.itCerrarSesion) {

            mAuth.signOut();
            startActivity(new Intent(ModuloBoltColorVideo.this, MainActivity.class));
            finish();

            return true;
        } else if (id == R.id.itMiCuenta) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
