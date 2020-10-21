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

public class ModuloMayaNumerosCinco extends AppCompatActivity {

    VideoView videoNumerosCincuenta;
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_maya_numeros_cinco);

        videoNumerosCincuenta = findViewById(R.id.videoNumerosCincuenta);


        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.videonumeroscuarentacincuenta;
        Uri uri = Uri.parse(videoPath);
        videoNumerosCincuenta.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoNumerosCincuenta.setMediaController(mediaController);
        mediaController.setAnchorView(videoNumerosCincuenta);

    }

    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.activity_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.itModuloMaya) {

            startActivity(new Intent(ModuloMayaNumerosCinco.this, ModuloMaya.class));

            return true;
        } else if (id == R.id.itModuloBolt) {

            startActivity(new Intent(ModuloMayaNumerosCinco.this, ModuloBolt.class));

            return true;
        } else if (id == R.id.itModuloSuperBolt) {

            startActivity(new Intent(ModuloMayaNumerosCinco.this, ModuloSuperBolt.class));


            return true;
        } else if (id == R.id.itInicio) {

            startActivity(new Intent(ModuloMayaNumerosCinco.this, Modulos.class));

            return true;
        } else if (id == R.id.itCerrarSesion) {

            mAuth.signOut();
            startActivity(new Intent(ModuloMayaNumerosCinco.this, MainActivity.class));
            finish();

            return true;
        } else if (id == R.id.itMiCuenta) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
