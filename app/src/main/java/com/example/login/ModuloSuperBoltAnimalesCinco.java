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

public class ModuloSuperBoltAnimalesCinco extends AppCompatActivity {
    MediaPlayer duck;
    MediaPlayer lion;
    ImageButton botonDuck;
    ImageButton botonLion;
    ImageButton siguiente;
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_super_bolt_animales_cinco);

        botonDuck = (ImageButton)findViewById(R.id.botonDuck);
        duck = MediaPlayer.create(this, R.raw.duck);

        botonDuck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                duck.start();
            }
        });


        botonLion = (ImageButton)findViewById(R.id.botonLion);
        lion = MediaPlayer.create(this, R.raw.lion);

        botonLion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lion.start();
            }
        });

        siguiente = (ImageButton) findViewById(R.id.siguiente);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloSuperBoltAnimalesCinco.this, ModuloSuperBoltAnimalesSeis.class);
                ModuloSuperBoltAnimalesCinco.this.startActivity(intentRec);
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

            startActivity(new Intent(ModuloSuperBoltAnimalesCinco.this, ModuloMaya.class));

            return true;
        } else if (id == R.id.itModuloBolt) {

            startActivity(new Intent(ModuloSuperBoltAnimalesCinco.this, ModuloBolt.class));

            return true;
        } else if (id == R.id.itModuloSuperBolt) {

            startActivity(new Intent(ModuloSuperBoltAnimalesCinco.this, ModuloSuperBolt.class));

            return true;
        } else if (id == R.id.itInicio) {

            startActivity(new Intent(ModuloSuperBoltAnimalesCinco.this, Modulos.class));

            return true;
        } else if (id == R.id.itCerrarSesion) {

            mAuth.signOut();
            startActivity(new Intent(ModuloSuperBoltAnimalesCinco.this, MainActivity.class));
            finish();

            return true;
        } else if (id == R.id.itMiCuenta) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}