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

public class ModuloBoltAnimalesDos extends AppCompatActivity {

    MediaPlayer mono;
    MediaPlayer cocodrilo;
    MediaPlayer gorila;
    ImageButton botonMono;
    ImageButton botonCocodrilo;
    ImageButton botonGorila;
    ImageButton next;
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_bolt_animales_dos);

        botonMono = (ImageButton)findViewById(R.id.audioMono);
        mono = MediaPlayer.create(this, R.raw.mono);

        botonMono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mono.start();
            }
        });

        botonCocodrilo = (ImageButton)findViewById(R.id.audioCocodrilo);
        cocodrilo = MediaPlayer.create(this, R.raw.cocodrilo);

        botonCocodrilo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cocodrilo.start();
            }
        });

        botonGorila = (ImageButton)findViewById(R.id.audioGorila);
        gorila = MediaPlayer.create(this, R.raw.gorila);

        botonGorila.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gorila.start();
            }
        });

        next = (ImageButton) findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloBoltAnimalesDos.this, ModuloBoltAnimalesTres.class);
                ModuloBoltAnimalesDos.this.startActivity(intentRec);
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

            startActivity(new Intent(ModuloBoltAnimalesDos.this, ModuloMaya.class));

            return true;
        } else if (id == R.id.itModuloBolt) {

            startActivity(new Intent(ModuloBoltAnimalesDos.this, ModuloBolt.class));

            return true;
        } else if (id == R.id.itModuloSuperBolt) {

            startActivity(new Intent(ModuloBoltAnimalesDos.this, ModuloSuperBolt.class));

            return true;
        } else if (id == R.id.itInicio) {

            startActivity(new Intent(ModuloBoltAnimalesDos.this, Modulos.class));

            return true;
        } else if (id == R.id.itCerrarSesion) {

            mAuth.signOut();
            startActivity(new Intent(ModuloBoltAnimalesDos.this, MainActivity.class));
            finish();

            return true;
        } else if (id == R.id.itMiCuenta) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
