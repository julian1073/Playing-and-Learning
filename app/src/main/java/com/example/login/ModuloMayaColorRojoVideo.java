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

public class ModuloMayaColorRojoVideo extends AppCompatActivity {
    VideoView videoRojo;
<<<<<<< Updated upstream
    ImageButton siguienteAmarillo;
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();
=======
    ImageButton siguientefinal;

>>>>>>> Stashed changes

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_maya_color_amarillo_video);

<<<<<<< Updated upstream
        videoRojo = findViewById(R.id.videoColorRojo);

        siguienteAmarillo = (ImageButton) findViewById(R.id.siguienteAmarillo);

        siguienteAmarillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloMayaColorRojoVideo.this, ModuloMayaColorAmarillo.class);
                ModuloMayaColorRojoVideo.this.startActivity(intentRec);
            }
        });
=======
        videoRojo = findViewById(R.id.videorojo);
>>>>>>> Stashed changes

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.cancionrojo;
        Uri uri = Uri.parse(videoPath);
        videoRojo.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoRojo.setMediaController(mediaController);
        mediaController.setAnchorView(videoRojo);
    }

    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.activity_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.itModuloMaya) {

            startActivity(new Intent(ModuloMayaColorRojoVideo.this, ModuloMaya.class));

            return true;
        } else if (id == R.id.itModuloBolt) {

            startActivity(new Intent(ModuloMayaColorRojoVideo.this, ModuloBolt.class));

            return true;
        } else if (id == R.id.itModuloSuperBolt) {

            startActivity(new Intent(ModuloMayaColorRojoVideo.this, ModuloSuperBolt.class));

            return true;
        } else if (id == R.id.itInicio) {

            startActivity(new Intent(ModuloMayaColorRojoVideo.this, Modulos.class));

            return true;
        } else if (id == R.id.itCerrarSesion) {

            mAuth.signOut();
            startActivity(new Intent(ModuloMayaColorRojoVideo.this, MainActivity.class));
            finish();

            return true;
        } else if (id == R.id.itMiCuenta) {

            return true;
        }

<<<<<<< Updated upstream
        return super.onOptionsItemSelected(item);
=======
        siguientefinal = (ImageButton) findViewById(R.id.rojosiguiente);

        siguientefinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloMayaColorRojoVideo.this, ModuloMayaColorAzul.class);
                ModuloMayaColorRojoVideo.this.startActivity(intentRec);
            }
        });
>>>>>>> Stashed changes
    }
}
