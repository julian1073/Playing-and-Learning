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

public class ModuloSuperBoltAnimalesUno extends AppCompatActivity {
    MediaPlayer cow;
    MediaPlayer dog;
    ImageButton botonCow;
    ImageButton botonDog;
    ImageButton siguiente1;
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_super_bolt_animales_uno);

        botonCow = (ImageButton)findViewById(R.id.botonCow);
        cow = MediaPlayer.create(this, R.raw.cow);

        botonCow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cow.start();
            }
        });


        botonDog = (ImageButton)findViewById(R.id.botonDog);
        dog = MediaPlayer.create(this, R.raw.dog);

        botonDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dog.start();
            }
        });

        siguiente1 = (ImageButton) findViewById(R.id.siguiente1);

        siguiente1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloSuperBoltAnimalesUno.this, ModuloSuperBoltAnimalesDos.class);
                ModuloSuperBoltAnimalesUno.this.startActivity(intentRec);
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

            startActivity(new Intent(ModuloSuperBoltAnimalesUno.this, ModuloMaya.class));

            return true;
        } else if (id == R.id.itModuloBolt) {

            startActivity(new Intent(ModuloSuperBoltAnimalesUno.this, ModuloBolt.class));

            return true;
        } else if (id == R.id.itModuloSuperBolt) {

            startActivity(new Intent(ModuloSuperBoltAnimalesUno.this, ModuloSuperBolt.class));

            return true;
        } else if (id == R.id.itInicio) {

            startActivity(new Intent(ModuloSuperBoltAnimalesUno.this, Modulos.class));

            return true;
        } else if (id == R.id.itCerrarSesion) {

            mAuth.signOut();
            startActivity(new Intent(ModuloSuperBoltAnimalesUno.this, MainActivity.class));
            finish();

            return true;
        } else if (id == R.id.itMiCuenta) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}