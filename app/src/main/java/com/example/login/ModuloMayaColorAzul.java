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

public class ModuloMayaColorAzul extends AppCompatActivity {
    ImageButton azul;
    MediaPlayer azulVoz;
    ImageButton video2;
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_maya_color_azul);

        azul = (ImageButton)findViewById(R.id.azul);
        azulVoz = MediaPlayer.create(this, R.raw.azul);

        azul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                azulVoz.start();
            }
        });
        video2 = (ImageButton) findViewById(R.id.video2);

        video2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloMayaColorAzul.this, ModuloMayaColorAzulVideo.class);
                ModuloMayaColorAzul.this.startActivity(intentRec);
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

            startActivity(new Intent(ModuloMayaColorAzul.this, ModuloMaya.class));

            return true;
        } else if (id == R.id.itModuloBolt) {

            startActivity(new Intent(ModuloMayaColorAzul.this, ModuloBolt.class));

            return true;
        } else if (id == R.id.itModuloSuperBolt) {


            return true;
        } else if (id == R.id.itInicio) {

            startActivity(new Intent(ModuloMayaColorAzul.this, Modulos.class));

            return true;
        } else if (id == R.id.itCerrarSesion) {

            mAuth.signOut();
            startActivity(new Intent(ModuloMayaColorAzul.this, MainActivity.class));
            finish();

            return true;
        } else if (id == R.id.itMiCuenta) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
