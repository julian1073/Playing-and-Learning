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

import com.google.firebase.auth.FirebaseAuth;

public class ModuloMayaAnimalesTres extends AppCompatActivity {

    MediaPlayer oveja;
    MediaPlayer burro;
    MediaPlayer cabra;
    ImageButton botonOveja;
    ImageButton botonBurro;
    ImageButton botonCabra;
    ImageButton next;
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_maya_animales_tres);

        botonOveja = (ImageButton)findViewById(R.id.audioOveja);
        oveja = MediaPlayer.create(this, R.raw.oveja);

        botonOveja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oveja.start();
            }
        });

        botonBurro = (ImageButton)findViewById(R.id.audioBurro);
        burro = MediaPlayer.create(this, R.raw.burro);

        botonBurro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                burro.start();
            }
        });

        botonCabra = (ImageButton)findViewById(R.id.audioCabra);
        cabra = MediaPlayer.create(this, R.raw.cabra);

        botonCabra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cabra.start();
            }
        });

        next = (ImageButton) findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloMayaAnimalesTres.this, ModuloMayaAnimalesCuatro.class);
                ModuloMayaAnimalesTres.this.startActivity(intentRec);
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

            startActivity(new Intent(ModuloMayaAnimalesTres.this, ModuloMaya.class));

            return true;
        } else if (id == R.id.itModuloBolt) {

            startActivity(new Intent(ModuloMayaAnimalesTres.this, ModuloBolt.class));

            return true;
        } else if (id == R.id.itModuloSuperBolt) {

            startActivity(new Intent(ModuloMayaAnimalesTres.this, ModuloBolt.class));

            return true;
        } else if (id == R.id.itInicio) {

            startActivity(new Intent(ModuloMayaAnimalesTres.this, Modulos.class));

            return true;
        } else if (id == R.id.itCerrarSesion) {

            mAuth.signOut();
            startActivity(new Intent(ModuloMayaAnimalesTres.this, MainActivity.class));
            finish();

            return true;
        } else if (id == R.id.itMiCuenta) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}