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

public class ModuloBoltCuentosQuinto extends AppCompatActivity {
    VideoView videoCuentoQuinto;
    ImageButton siguienteC8;
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_bolt_cuentos_quinto);

        videoCuentoQuinto = findViewById(R.id.videoCuentoQuinto);


        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.cuentoperro;
        Uri uri = Uri.parse(videoPath);
        videoCuentoQuinto.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoCuentoQuinto.setMediaController(mediaController);
        mediaController.setAnchorView(videoCuentoQuinto);

        siguienteC8 = (ImageButton) findViewById(R.id.siguienteC8);
        siguienteC8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentRec = new Intent(ModuloBoltCuentosQuinto.this, ModuloBoltMedalla.class);
                ModuloBoltCuentosQuinto.this.startActivity(intentRec);
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

            startActivity(new Intent(ModuloBoltCuentosQuinto.this, ModuloMaya.class));

            return true;
        } else if (id == R.id.itModuloBolt) {

            startActivity(new Intent(ModuloBoltCuentosQuinto.this, ModuloBolt.class));

            return true;
        } else if (id == R.id.itModuloSuperBolt) {

            startActivity(new Intent(ModuloBoltCuentosQuinto.this, ModuloSuperBolt.class));

            return true;
        } else if (id == R.id.itInicio) {

            startActivity(new Intent(ModuloBoltCuentosQuinto.this, Modulos.class));

            return true;
        } else if (id == R.id.itCerrarSesion) {

            mAuth.signOut();
            startActivity(new Intent(ModuloBoltCuentosQuinto.this, MainActivity.class));
            finish();

            return true;
        } else if (id == R.id.itMiCuenta) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }



}
