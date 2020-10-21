package com.example.login;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.login.R;
import com.google.firebase.auth.FirebaseAuth;

public class ModuloMayaColorAmarillo extends AppCompatActivity {
    ImageButton amarillo;
    MediaPlayer amarilloVoz;
    ImageButton video;
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_maya_color_amarillo);

        amarillo = (ImageButton)findViewById(R.id.amarillo);
        amarilloVoz = MediaPlayer.create(this, R.raw.amarillo);

        amarillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amarilloVoz.start();
            }
        });
        video = (ImageButton) findViewById(R.id.video);

        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloMayaColorAmarillo.this, ModuloMayaColorAmarilloVideo.class);
                ModuloMayaColorAmarillo.this.startActivity(intentRec);
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

            startActivity(new Intent(ModuloMayaColorAmarillo.this, ModuloMaya.class));

            return true;
        } else if (id == R.id.itModuloBolt) {

            startActivity(new Intent(ModuloMayaColorAmarillo.this, ModuloBolt.class));

            return true;
        } else if (id == R.id.itModuloSuperBolt) {
            startActivity(new Intent(ModuloMayaColorAmarillo.this, ModuloSuperBolt.class));
            return true;
        } else if (id == R.id.itInicio) {

            startActivity(new Intent(ModuloMayaColorAmarillo.this, Modulos.class));

            return true;
        } else if (id == R.id.itCerrarSesion) {

            mAuth.signOut();
            startActivity(new Intent(ModuloMayaColorAmarillo.this, MainActivity.class));
            finish();

            return true;
        } else if (id == R.id.itMiCuenta) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
