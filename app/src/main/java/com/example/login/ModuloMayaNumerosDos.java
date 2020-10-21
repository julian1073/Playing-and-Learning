package com.example.login;

import android.content.Intent;
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

public class ModuloMayaNumerosDos extends AppCompatActivity {
    VideoView videoNumerosVeinte;
    ImageButton siguienteNumerosTres;
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_maya_numeros_dos);

        videoNumerosVeinte = findViewById(R.id.videoNumerosVeinte);

        siguienteNumerosTres = (ImageButton) findViewById(R.id.siguienteNumerosTres);

        siguienteNumerosTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloMayaNumerosDos.this, ModuloMayaNumerosTres.class);
                ModuloMayaNumerosDos.this.startActivity(intentRec);
            }
        });

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.videonumerosdiezveinte;
        Uri uri = Uri.parse(videoPath);
        videoNumerosVeinte.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoNumerosVeinte.setMediaController(mediaController);
        mediaController.setAnchorView(videoNumerosVeinte);

    }

    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.activity_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.itModuloMaya) {

            startActivity(new Intent(ModuloMayaNumerosDos.this, ModuloMaya.class));

            return true;
        } else if (id == R.id.itModuloBolt) {

            startActivity(new Intent(ModuloMayaNumerosDos.this, ModuloBolt.class));

            return true;
        } else if (id == R.id.itModuloSuperBolt) {


            return true;
        } else if (id == R.id.itInicio) {

            startActivity(new Intent(ModuloMayaNumerosDos.this, Modulos.class));

            return true;
        } else if (id == R.id.itCerrarSesion) {

            mAuth.signOut();
            startActivity(new Intent(ModuloMayaNumerosDos.this, MainActivity.class));
            finish();

            return true;
        } else if (id == R.id.itMiCuenta) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
