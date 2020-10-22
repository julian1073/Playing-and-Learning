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

public class ModuloBoltAnimalesCuatro extends AppCompatActivity {

    MediaPlayer oso;
    MediaPlayer lobo;
    ImageButton botonOso;
    ImageButton botonLobo;
    ImageButton next;
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_bolt_animales_cuatro);

        botonOso = (ImageButton)findViewById(R.id.audioOso);
        oso = MediaPlayer.create(this, R.raw.osoo);

        botonOso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oso.start();
            }
        });

        botonLobo = (ImageButton)findViewById(R.id.audioLobo);
        lobo = MediaPlayer.create(this, R.raw.lobo);

        botonLobo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lobo.start();
            }
        });

        next = (ImageButton) findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloBoltAnimalesCuatro.this, ModuloBoltAnimalesCinco.class);
                ModuloBoltAnimalesCuatro.this.startActivity(intentRec);
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

            startActivity(new Intent(ModuloBoltAnimalesCuatro.this, ModuloMaya.class));

            return true;
        } else if (id == R.id.itModuloBolt) {

            startActivity(new Intent(ModuloBoltAnimalesCuatro.this, ModuloBolt.class));

            return true;
        } else if (id == R.id.itModuloSuperBolt) {

            startActivity(new Intent(ModuloBoltAnimalesCuatro.this, ModuloSuperBolt.class));

            return true;
        } else if (id == R.id.itInicio) {

            startActivity(new Intent(ModuloBoltAnimalesCuatro.this, Modulos.class));

            return true;
        } else if (id == R.id.itCerrarSesion) {

            mAuth.signOut();
            startActivity(new Intent(ModuloBoltAnimalesCuatro.this, MainActivity.class));
            finish();

            return true;
        } else if (id == R.id.itMiCuenta) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
