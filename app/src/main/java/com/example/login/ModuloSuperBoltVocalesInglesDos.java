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

public class ModuloSuperBoltVocalesInglesDos extends AppCompatActivity {
    MediaPlayer apple;
    MediaPlayer egg;
    ImageButton botonApple;
    ImageButton botonEgg;
    ImageButton siguienteVocalesInglesDos;
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_super_bolt_vocales_ingles_dos);

        botonApple = (ImageButton)findViewById(R.id.botonApple);
        apple = MediaPlayer.create(this, R.raw.apple);

        botonApple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                apple.start();
            }
        });


        botonEgg = (ImageButton)findViewById(R.id.botonEgg);
        egg = MediaPlayer.create(this, R.raw.egg);

        botonEgg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                egg.start();
            }
        });

        siguienteVocalesInglesDos = (ImageButton) findViewById(R.id.siguienteVocalesInglesDos);

        siguienteVocalesInglesDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloSuperBoltVocalesInglesDos.this, ModuloSuperBoltVocalesInglesTres.class);
                ModuloSuperBoltVocalesInglesDos.this.startActivity(intentRec);
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

            startActivity(new Intent(ModuloSuperBoltVocalesInglesDos.this, ModuloMaya.class));

            return true;
        } else if (id == R.id.itModuloBolt) {

            startActivity(new Intent(ModuloSuperBoltVocalesInglesDos.this, ModuloBolt.class));

            return true;
        } else if (id == R.id.itModuloSuperBolt) {

            startActivity(new Intent(ModuloSuperBoltVocalesInglesDos.this, ModuloSuperBolt.class));

            return true;
        } else if (id == R.id.itInicio) {

            startActivity(new Intent(ModuloSuperBoltVocalesInglesDos.this, Modulos.class));

            return true;
        } else if (id == R.id.itCerrarSesion) {

            mAuth.signOut();
            startActivity(new Intent(ModuloSuperBoltVocalesInglesDos.this, MainActivity.class));
            finish();

            return true;
        } else if (id == R.id.itMiCuenta) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
