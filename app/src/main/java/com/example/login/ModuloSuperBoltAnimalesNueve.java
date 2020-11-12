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

public class ModuloSuperBoltAnimalesNueve extends AppCompatActivity {
    MediaPlayer rhino;
    MediaPlayer bear;
    ImageButton botonRhino;
    ImageButton botonBear;
    ImageButton siguiente;
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_super_bolt_animales_nueve);

        botonRhino = (ImageButton)findViewById(R.id.botonRhino);
        rhino = MediaPlayer.create(this, R.raw.rhino);

        botonRhino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rhino.start();
            }
        });


        botonBear = (ImageButton)findViewById(R.id.botonBear);
        bear = MediaPlayer.create(this, R.raw.bear);

        botonBear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bear.start();
            }
        });

        siguiente = (ImageButton) findViewById(R.id.siguiente);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloSuperBoltAnimalesNueve.this, ModuloSuperBoltAnimalesDiez.class);
                ModuloSuperBoltAnimalesNueve.this.startActivity(intentRec);
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

            startActivity(new Intent(ModuloSuperBoltAnimalesNueve.this, ModuloMaya.class));

            return true;
        } else if (id == R.id.itModuloBolt) {

            startActivity(new Intent(ModuloSuperBoltAnimalesNueve.this, ModuloBolt.class));

            return true;
        } else if (id == R.id.itModuloSuperBolt) {

            startActivity(new Intent(ModuloSuperBoltAnimalesNueve.this, ModuloSuperBolt.class));

            return true;
        } else if (id == R.id.itInicio) {

            startActivity(new Intent(ModuloSuperBoltAnimalesNueve.this, Modulos.class));

            return true;
        } else if (id == R.id.itCerrarSesion) {

            mAuth.signOut();
            startActivity(new Intent(ModuloSuperBoltAnimalesNueve.this, MainActivity.class));
            finish();

            return true;
        } else if (id == R.id.itMiCuenta) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
