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

public class ModuloMayaVocalesContinuar extends AppCompatActivity {

    MediaPlayer iguana;
    MediaPlayer oso;
    ImageButton botonIguana;
    ImageButton botonOso;
    ImageButton botonPauseIguana;
    ImageButton botonPauseOso;
    ImageButton siguienteTres;
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_maya_vocales_continuar);

        botonIguana = (ImageButton)findViewById(R.id.botonIguana);
        botonPauseIguana = (ImageButton)findViewById(R.id.botonPauseIguana);
        iguana = MediaPlayer.create(this, R.raw.iguana);

        botonIguana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iguana.start();
            }
        });

        botonPauseIguana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iguana.pause();
            }
        });

        botonOso = (ImageButton)findViewById(R.id.botonOso);
        botonPauseOso = (ImageButton)findViewById(R.id.botonPauseOso);
        oso = MediaPlayer.create(this, R.raw.oso);

        botonOso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oso.start();
            }
        });

        botonPauseOso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oso.pause();
            }
        });

        siguienteTres = (ImageButton) findViewById(R.id.siguiente3);

        siguienteTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloMayaVocalesContinuar.this, ModuloMayaVocalesContinuarDos.class);
                ModuloMayaVocalesContinuar.this.startActivity(intentRec);
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

            startActivity(new Intent(ModuloMayaVocalesContinuar.this, ModuloMaya.class));

            return true;
        } else if (id == R.id.itModuloBolt) {

            startActivity(new Intent(ModuloMayaVocalesContinuar.this, ModuloBolt.class));

            return true;
        } else if (id == R.id.itModuloSuperBolt) {

            startActivity(new Intent(ModuloMayaVocalesContinuar.this, ModuloSuperBolt.class));

            return true;
        } else if (id == R.id.itInicio) {

            startActivity(new Intent(ModuloMayaVocalesContinuar.this, Modulos.class));

            return true;
        } else if (id == R.id.itCerrarSesion) {

            mAuth.signOut();
            startActivity(new Intent(ModuloMayaVocalesContinuar.this, MainActivity.class));
            finish();

            return true;
        } else if (id == R.id.itMiCuenta) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
