package com.example.login;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class ModuloMayaVocalesNext extends AppCompatActivity {

    MediaPlayer arania;
    MediaPlayer elefante;
    ImageButton botonArania;
    ImageButton botonElefante;
    ImageButton siguienteDos;
    ImageButton botonPauseArania;
    ImageButton botonPauseElefante;
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_maya_vocales_next);

        botonArania = (ImageButton)findViewById(R.id.botonArania);
        botonPauseArania = (ImageButton)findViewById(R.id.botonPauseArania);
        arania = MediaPlayer.create(this, R.raw.arania);

        botonArania.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arania.start();
            }
        });

        botonPauseArania.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arania.pause();
            }
        });

        botonElefante = (ImageButton)findViewById(R.id.botonElefante);
        botonPauseElefante = (ImageButton)findViewById(R.id.botonPauseElefante);
        elefante = MediaPlayer.create(this, R.raw.elefante);

        botonElefante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                elefante.start();
            }
        });

        botonPauseElefante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                elefante.pause();
            }
        });


        siguienteDos = (ImageButton) findViewById(R.id.siguiente2);

        siguienteDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloMayaVocalesNext.this, ModuloMayaVocalesContinuar.class);
                ModuloMayaVocalesNext.this.startActivity(intentRec);
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

            startActivity(new Intent(ModuloMayaVocalesNext.this, ModuloMaya.class));

            return true;
        } else if (id == R.id.itModuloBolt) {

            startActivity(new Intent(ModuloMayaVocalesNext.this, ModuloBolt.class));

            return true;
        } else if (id == R.id.itModuloSuperBolt) {


            return true;
        } else if (id == R.id.itInicio) {

            startActivity(new Intent(ModuloMayaVocalesNext.this, Modulos.class));

            return true;
        } else if (id == R.id.itCerrarSesion) {

            mAuth.signOut();
            startActivity(new Intent(ModuloMayaVocalesNext.this, MainActivity.class));
            finish();

            return true;
        } else if (id == R.id.itMiCuenta) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
