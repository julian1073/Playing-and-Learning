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

public class ModuloBoltCuentosDos extends AppCompatActivity {
    VideoView videoCuentoDos;
    ImageButton siguienteCuentosTres;
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_bolt_cuentos_dos);

        videoCuentoDos = findViewById(R.id.videoCuentoDos);


        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.cuentosnumeros;
        Uri uri = Uri.parse(videoPath);
        videoCuentoDos.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoCuentoDos.setMediaController(mediaController);
        mediaController.setAnchorView(videoCuentoDos);

        siguienteCuentosTres = (ImageButton) findViewById(R.id.siguienteCuentosTres);

        siguienteCuentosTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloBoltCuentosDos.this, ModuloBoltCuentosTres.class);
                ModuloBoltCuentosDos.this.startActivity(intentRec);
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

            startActivity(new Intent(ModuloBoltCuentosDos.this, ModuloMaya.class));

            return true;
        } else if (id == R.id.itModuloBolt) {

            startActivity(new Intent(ModuloBoltCuentosDos.this, ModuloBolt.class));

            return true;
        } else if (id == R.id.itModuloSuperBolt) {

            startActivity(new Intent(ModuloBoltCuentosDos.this, ModuloSuperBolt.class));

            return true;
        } else if (id == R.id.itInicio) {

            startActivity(new Intent(ModuloBoltCuentosDos.this, Modulos.class));

            return true;
        } else if (id == R.id.itCerrarSesion) {

            mAuth.signOut();
            startActivity(new Intent(ModuloBoltCuentosDos.this, MainActivity.class));
            finish();

            return true;
        } else if (id == R.id.itMiCuenta) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }



}
