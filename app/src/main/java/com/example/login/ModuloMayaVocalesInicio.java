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

public class ModuloMayaVocalesInicio extends AppCompatActivity {

    MediaPlayer vocalA;
    MediaPlayer vocalE;
    MediaPlayer vocalI;
    MediaPlayer vocalO;
    MediaPlayer vocalU;
    ImageButton botonA;
    ImageButton botonE;
    ImageButton botonI;
    ImageButton botonO;
    ImageButton botonU;
    ImageButton next;
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_maya_vocales_inicio);

        botonA = (ImageButton)findViewById(R.id.audioA);
        vocalA = MediaPlayer.create(this, R.raw.a);

        botonA.setOnClickListener(new View.OnClickListener() {
             @Override
            public void onClick(View v) {
                    vocalA.start();
             }
        });


        botonE = (ImageButton)findViewById(R.id.audioE);
        vocalE = MediaPlayer.create(this, R.raw.e);

        botonE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vocalE.start();
            }
        });

        botonI = (ImageButton)findViewById(R.id.audioI);
        vocalI = MediaPlayer.create(this, R.raw.i);

        botonI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vocalI.start();
            }
        });

        botonO = (ImageButton)findViewById(R.id.audioO);
        vocalO = MediaPlayer.create(this, R.raw.o);

        botonO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vocalO.start();
            }
        });

        botonU = (ImageButton)findViewById(R.id.audioU);
        vocalU = MediaPlayer.create(this, R.raw.u);

        botonU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vocalU.start();
            }
        });

        next = (ImageButton) findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloMayaVocalesInicio.this, ModuloMayaVocalesNext.class);
                ModuloMayaVocalesInicio.this.startActivity(intentRec);
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

            startActivity(new Intent(ModuloMayaVocalesInicio.this, ModuloMaya.class));

            return true;
        } else if (id == R.id.itModuloBolt) {

            startActivity(new Intent(ModuloMayaVocalesInicio.this, ModuloBolt.class));

            return true;
        } else if (id == R.id.itModuloSuperBolt) {


            return true;
        } else if (id == R.id.itInicio) {

            startActivity(new Intent(ModuloMayaVocalesInicio.this, Modulos.class));

            return true;
        } else if (id == R.id.itCerrarSesion) {

            mAuth.signOut();
            startActivity(new Intent(ModuloMayaVocalesInicio.this, MainActivity.class));
            finish();

            return true;
        } else if (id == R.id.itMiCuenta) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
