package com.example.login;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
<<<<<<< Updated upstream
import com.google.firebase.auth.FirebaseAuth;
=======
>>>>>>> Stashed changes

public class ModuloMayaColorAmarillo extends AppCompatActivity {

    MediaPlayer amarillo;
    ImageButton bAmarillo;
    ImageButton siguienteV;
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_maya_color_amarillo);

        bAmarillo = (ImageButton)findViewById(R.id.audioAmarillo);
        amarillo = MediaPlayer.create(this, R.raw.amarillo);

        bAmarillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amarillo.start();
            }
        });
<<<<<<< Updated upstream
=======
        video = (ImageButton) findViewById(R.id.videorojo);
>>>>>>> Stashed changes

        siguienteV = (ImageButton) findViewById(R.id.siguienteVideoAmarillo);

        siguienteV.setOnClickListener(new View.OnClickListener() {
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