package com.example.login;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;
import com.google.firebase.auth.FirebaseAuth;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloBoltAnimalesUno extends AppCompatActivity {

    MediaPlayer leon;
    MediaPlayer elefante;
    MediaPlayer jirafa;
    ImageButton botonLeon;
    ImageButton botonElefante;
    ImageButton botonJirafa;
    ImageButton next;
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_bolt_animales_uno);

        botonLeon = (ImageButton)findViewById(R.id.audioLeon);
        leon = MediaPlayer.create(this, R.raw.leon);

        botonLeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leon.start();
            }
        });

        botonElefante = (ImageButton)findViewById(R.id.audioElefante);
        elefante = MediaPlayer.create(this, R.raw.elefantee);

        botonElefante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                elefante.start();
            }
        });

        botonJirafa = (ImageButton)findViewById(R.id.audioJirafa);
        jirafa = MediaPlayer.create(this, R.raw.jirafa);

        botonJirafa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jirafa.start();
            }
        });

        next = (ImageButton) findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloBoltAnimalesUno.this, ModuloBoltAnimalesDos.class);
                ModuloBoltAnimalesUno.this.startActivity(intentRec);
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

            startActivity(new Intent(ModuloBoltAnimalesUno.this, ModuloMaya.class));

            return true;
        } else if (id == R.id.itModuloBolt) {

            startActivity(new Intent(ModuloBoltAnimalesUno.this, ModuloBolt.class));

            return true;
        } else if (id == R.id.itModuloSuperBolt) {

            startActivity(new Intent(ModuloBoltAnimalesUno.this, ModuloSuperBolt.class));

            return true;
        } else if (id == R.id.itInicio) {

            startActivity(new Intent(ModuloBoltAnimalesUno.this, Modulos.class));

            return true;
        } else if (id == R.id.itCerrarSesion) {

            mAuth.signOut();
            startActivity(new Intent(ModuloBoltAnimalesUno.this, MainActivity.class));
            finish();

            return true;
        } else if (id == R.id.itMiCuenta) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}