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

public class ModuloSuperBoltVocalesInglesTres extends AppCompatActivity {
    MediaPlayer igloo;
    MediaPlayer orange;
    ImageButton botonIgloo;
    ImageButton botonOrange;
    ImageButton siguienteVocalesInglesTres;
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_super_bolt_vocales_ingles_tres);

        botonIgloo = (ImageButton)findViewById(R.id.botonIgloo);
        igloo = MediaPlayer.create(this, R.raw.igloo);

        botonIgloo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                igloo.start();
            }
        });


        botonOrange = (ImageButton)findViewById(R.id.botonOrange);
        orange = MediaPlayer.create(this, R.raw.orange);

        botonOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orange.start();
            }
        });

        siguienteVocalesInglesTres = (ImageButton) findViewById(R.id.siguienteVocalesInglesTres);

        siguienteVocalesInglesTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloSuperBoltVocalesInglesTres.this, ModuloSuperBoltVocalesInglesCuatro.class);
                ModuloSuperBoltVocalesInglesTres.this.startActivity(intentRec);
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

            startActivity(new Intent(ModuloSuperBoltVocalesInglesTres.this, ModuloMaya.class));

            return true;
        } else if (id == R.id.itModuloBolt) {

            startActivity(new Intent(ModuloSuperBoltVocalesInglesTres.this, ModuloBolt.class));

            return true;
        } else if (id == R.id.itModuloSuperBolt) {

            startActivity(new Intent(ModuloSuperBoltVocalesInglesTres.this, ModuloSuperBolt.class));

            return true;
        } else if (id == R.id.itInicio) {

            startActivity(new Intent(ModuloSuperBoltVocalesInglesTres.this, Modulos.class));

            return true;
        } else if (id == R.id.itCerrarSesion) {

            mAuth.signOut();
            startActivity(new Intent(ModuloSuperBoltVocalesInglesTres.this, MainActivity.class));
            finish();

            return true;
        } else if (id == R.id.itMiCuenta) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
