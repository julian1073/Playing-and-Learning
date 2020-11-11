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

public class ModuloSuperBoltAnimalesDiez extends AppCompatActivity {
    MediaPlayer goat;
    MediaPlayer wolf;
    ImageButton botonGoat;
    ImageButton botonWolf;
    ImageButton siguiente;
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_super_bolt_animales_diez);

        botonGoat = (ImageButton)findViewById(R.id.botonGoat);
        goat = MediaPlayer.create(this, R.raw.goat);

        botonGoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goat.start();
            }
        });


        botonWolf = (ImageButton)findViewById(R.id.botonWolf);
        wolf = MediaPlayer.create(this, R.raw.wolf);

        botonWolf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wolf.start();
            }
        });

        siguiente = (ImageButton) findViewById(R.id.siguiente);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloSuperBoltAnimalesDiez.this, ModuloSuperBoltAnimalesOnce.class);
                ModuloSuperBoltAnimalesDiez.this.startActivity(intentRec);
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

            startActivity(new Intent(ModuloSuperBoltAnimalesDiez.this, ModuloMaya.class));

            return true;
        } else if (id == R.id.itModuloBolt) {

            startActivity(new Intent(ModuloSuperBoltAnimalesDiez.this, ModuloBolt.class));

            return true;
        } else if (id == R.id.itModuloSuperBolt) {

            startActivity(new Intent(ModuloSuperBoltAnimalesDiez.this, ModuloSuperBolt.class));

            return true;
        } else if (id == R.id.itInicio) {

            startActivity(new Intent(ModuloSuperBoltAnimalesDiez.this, Modulos.class));

            return true;
        } else if (id == R.id.itCerrarSesion) {

            mAuth.signOut();
            startActivity(new Intent(ModuloSuperBoltAnimalesDiez.this, MainActivity.class));
            finish();

            return true;
        } else if (id == R.id.itMiCuenta) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}