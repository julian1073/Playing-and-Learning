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

public class ModuloSuperBoltAnimalesSiete extends AppCompatActivity {
    MediaPlayer monkey;
    MediaPlayer crocodile;
    ImageButton botonMonkey;
    ImageButton botonCrocodile;
    ImageButton siguiente;
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_super_bolt_animales_siete);

        botonMonkey = (ImageButton)findViewById(R.id.botonMonkey);
        monkey = MediaPlayer.create(this, R.raw.monkey);

        botonMonkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                monkey.start();
            }
        });


        botonCrocodile = (ImageButton)findViewById(R.id.botonCrocodile);
        crocodile = MediaPlayer.create(this, R.raw.crocodile);

        botonCrocodile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crocodile.start();
            }
        });

        siguiente = (ImageButton) findViewById(R.id.siguiente);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloSuperBoltAnimalesSiete.this, ModuloSuperBoltAnimalesOcho.class);
                ModuloSuperBoltAnimalesSiete.this.startActivity(intentRec);
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

            startActivity(new Intent(ModuloSuperBoltAnimalesSiete.this, ModuloMaya.class));

            return true;
        } else if (id == R.id.itModuloBolt) {

            startActivity(new Intent(ModuloSuperBoltAnimalesSiete.this, ModuloBolt.class));

            return true;
        } else if (id == R.id.itModuloSuperBolt) {

            startActivity(new Intent(ModuloSuperBoltAnimalesSiete.this, ModuloSuperBolt.class));

            return true;
        } else if (id == R.id.itInicio) {

            startActivity(new Intent(ModuloSuperBoltAnimalesSiete.this, Modulos.class));

            return true;
        } else if (id == R.id.itCerrarSesion) {

            mAuth.signOut();
            startActivity(new Intent(ModuloSuperBoltAnimalesSiete.this, MainActivity.class));
            finish();

            return true;
        } else if (id == R.id.itMiCuenta) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
