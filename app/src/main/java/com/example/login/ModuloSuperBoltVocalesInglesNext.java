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

public class ModuloSuperBoltVocalesInglesNext extends AppCompatActivity {
    MediaPlayer vocalEi;
    MediaPlayer vocalIi;
    MediaPlayer vocalAi;
    MediaPlayer vocalOu;
    MediaPlayer vocalIu;
    ImageButton botonEi;
    ImageButton botonIi;
    ImageButton botonAi;
    ImageButton botonOu;
    ImageButton botonIu;
    ImageButton nextSiguiente;
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_super_bolt_vocales_ingles_next);

        botonEi = (ImageButton)findViewById(R.id.audioEi);
        vocalEi = MediaPlayer.create(this, R.raw.ei);

        botonEi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vocalEi.start();
            }
        });


        botonIi = (ImageButton)findViewById(R.id.audioIi);
        vocalIi = MediaPlayer.create(this, R.raw.ii);

        botonIi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vocalIi.start();
            }
        });

        botonAi = (ImageButton)findViewById(R.id.audioAi);
        vocalAi = MediaPlayer.create(this, R.raw.ai);

        botonAi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vocalAi.start();
            }
        });

        botonOu = (ImageButton)findViewById(R.id.audioOu);
        vocalOu = MediaPlayer.create(this, R.raw.ou);

        botonOu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vocalOu.start();
            }
        });

        botonIu = (ImageButton)findViewById(R.id.audioIu);
        vocalIu = MediaPlayer.create(this, R.raw.iu);

        botonIu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vocalIu.start();
            }
        });

        nextSiguiente = (ImageButton) findViewById(R.id.nextSiguiente);

        nextSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloSuperBoltVocalesInglesNext.this, ModuloSuperBoltVocalesInglesDos.class);
                ModuloSuperBoltVocalesInglesNext.this.startActivity(intentRec);
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

            startActivity(new Intent(ModuloSuperBoltVocalesInglesNext.this, ModuloMaya.class));

            return true;
        } else if (id == R.id.itModuloBolt) {

            startActivity(new Intent(ModuloSuperBoltVocalesInglesNext.this, ModuloBolt.class));

            return true;
        } else if (id == R.id.itModuloSuperBolt) {

            startActivity(new Intent(ModuloSuperBoltVocalesInglesNext.this, ModuloSuperBolt.class));

            return true;
        } else if (id == R.id.itInicio) {

            startActivity(new Intent(ModuloSuperBoltVocalesInglesNext.this, Modulos.class));

            return true;
        } else if (id == R.id.itCerrarSesion) {

            mAuth.signOut();
            startActivity(new Intent(ModuloSuperBoltVocalesInglesNext.this, MainActivity.class));
            finish();

            return true;
        } else if (id == R.id.itMiCuenta) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
