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

public class ModuloMayaAnimalesDos extends AppCompatActivity {

    MediaPlayer caballo;
    MediaPlayer gallina;
    MediaPlayer conejo;
    ImageButton botonCaballo;
    ImageButton botonGallina;
    ImageButton botonConejo;
    ImageButton next;
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_maya_animales_dos);

        botonCaballo = (ImageButton)findViewById(R.id.audioCaballo);
        caballo = MediaPlayer.create(this, R.raw.caballo);

        botonCaballo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                caballo.start();
            }
        });

        botonGallina = (ImageButton)findViewById(R.id.audioGallina);
        gallina = MediaPlayer.create(this, R.raw.gallina);

        botonGallina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gallina.start();
            }
        });

        botonConejo = (ImageButton)findViewById(R.id.audioConejo);
        conejo = MediaPlayer.create(this, R.raw.conejo);

        botonConejo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conejo.start();
            }
        });

        next = (ImageButton) findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloMayaAnimalesDos.this, ModuloMayaAnimalesTres.class);
                ModuloMayaAnimalesDos.this.startActivity(intentRec);
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

            startActivity(new Intent(ModuloMayaAnimalesDos.this, ModuloMaya.class));

            return true;
        } else if (id == R.id.itModuloBolt) {

            startActivity(new Intent(ModuloMayaAnimalesDos.this, ModuloBolt.class));

            return true;
        } else if (id == R.id.itModuloSuperBolt) {


            return true;
        } else if (id == R.id.itInicio) {

            startActivity(new Intent(ModuloMayaAnimalesDos.this, Modulos.class));

            return true;
        } else if (id == R.id.itCerrarSesion) {

            mAuth.signOut();
            startActivity(new Intent(ModuloMayaAnimalesDos.this, MainActivity.class));
            finish();

            return true;
        } else if (id == R.id.itMiCuenta) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}