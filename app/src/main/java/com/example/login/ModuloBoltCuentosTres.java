package com.example.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class ModuloBoltCuentosTres extends AppCompatActivity {
    VideoView videoCuentoTres;
    ImageButton siguienteCuentosCuatro;
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_bolt_cuentos_tres);

        videoCuentoTres = findViewById(R.id.videoCuentoTres);


        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.cuentoanimales;
        Uri uri = Uri.parse(videoPath);
        videoCuentoTres.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoCuentoTres.setMediaController(mediaController);
        mediaController.setAnchorView(videoCuentoTres);

        siguienteCuentosCuatro = (ImageButton) findViewById(R.id.siguienteCuentoCuatro);

        siguienteCuentosCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloBoltCuentosTres.this, ModuloBoltCuentosCuatro.class);
                ModuloBoltCuentosTres.this.startActivity(intentRec);
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

            startActivity(new Intent(ModuloBoltCuentosTres.this, ModuloMaya.class));

            return true;
        } else if (id == R.id.itModuloBolt) {

            startActivity(new Intent(ModuloBoltCuentosTres.this, ModuloBolt.class));

            return true;
        } else if (id == R.id.itModuloSuperBolt) {


            return true;
        } else if (id == R.id.itInicio) {

            startActivity(new Intent(ModuloBoltCuentosTres.this, Modulos.class));

            return true;
        } else if (id == R.id.itCerrarSesion) {

            mAuth.signOut();
            startActivity(new Intent(ModuloBoltCuentosTres.this, MainActivity.class));
            finish();

            return true;
        } else if (id == R.id.itMiCuenta) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
