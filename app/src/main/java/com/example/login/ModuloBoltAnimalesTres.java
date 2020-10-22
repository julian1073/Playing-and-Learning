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

public class ModuloBoltAnimalesTres extends AppCompatActivity {

    MediaPlayer cebra;
    MediaPlayer tigre;
    MediaPlayer Rinoceronte;
    ImageButton botonCebra;
    ImageButton botonTigre;
    ImageButton botonRinoceronte;
    ImageButton next;
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_bolt_animales_tres);

        botonCebra = (ImageButton)findViewById(R.id.audioCebra);
        cebra = MediaPlayer.create(this, R.raw.cebra);

        botonCebra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cebra.start();
            }
        });

        botonTigre = (ImageButton)findViewById(R.id.audioTigre);
        tigre = MediaPlayer.create(this, R.raw.tigre);

        botonTigre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tigre.start();
            }
        });

        botonRinoceronte = (ImageButton)findViewById(R.id.audioRinoceronte);
        Rinoceronte = MediaPlayer.create(this, R.raw.rinoceronte);

        botonRinoceronte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Rinoceronte.start();
            }
        });

        next = (ImageButton) findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloBoltAnimalesTres.this, ModuloBoltAnimalesCuatro.class);
                ModuloBoltAnimalesTres.this.startActivity(intentRec);
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

            startActivity(new Intent(ModuloBoltAnimalesTres.this, ModuloMaya.class));

            return true;
        } else if (id == R.id.itModuloBolt) {

            startActivity(new Intent(ModuloBoltAnimalesTres.this, ModuloBolt.class));

            return true;
        } else if (id == R.id.itModuloSuperBolt) {

            startActivity(new Intent(ModuloBoltAnimalesTres.this, ModuloSuperBolt.class));

            return true;
        } else if (id == R.id.itInicio) {

            startActivity(new Intent(ModuloBoltAnimalesTres.this, Modulos.class));

            return true;
        } else if (id == R.id.itCerrarSesion) {

            mAuth.signOut();
            startActivity(new Intent(ModuloBoltAnimalesTres.this, MainActivity.class));
            finish();

            return true;
        } else if (id == R.id.itMiCuenta) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}

