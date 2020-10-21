package com.example.login;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.login.R;
import com.google.firebase.auth.FirebaseAuth;

public class ModuloMayaColorRojo extends AppCompatActivity {
    ImageButton rojo;
    MediaPlayer rojovoz;
    ImageButton video3;
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_maya_color_rojo);

        rojo = (ImageButton)findViewById(R.id.rojo);
        rojovoz = MediaPlayer.create(this, R.raw.rojo);

        rojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rojovoz.start();
            }
        });
        video3 = (ImageButton) findViewById(R.id.video3);

        video3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloMayaColorRojo.this, ModuloMayaColorRojoVideo.class);
                ModuloMayaColorRojo.this.startActivity(intentRec);
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

            startActivity(new Intent(ModuloMayaColorRojo.this, ModuloMaya.class));

            return true;
        } else if (id == R.id.itModuloBolt) {

            startActivity(new Intent(ModuloMayaColorRojo.this, ModuloBolt.class));

            return true;
        } else if (id == R.id.itModuloSuperBolt) {

            startActivity(new Intent(ModuloMayaColorRojo.this, ModuloSuperBolt.class));

            return true;
        } else if (id == R.id.itInicio) {

            startActivity(new Intent(ModuloMayaColorRojo.this, Modulos.class));

            return true;
        } else if (id == R.id.itCerrarSesion) {

            mAuth.signOut();
            startActivity(new Intent(ModuloMayaColorRojo.this, MainActivity.class));
            finish();

            return true;
        } else if (id == R.id.itMiCuenta) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
