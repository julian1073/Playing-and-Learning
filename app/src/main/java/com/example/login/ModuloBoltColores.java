package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.auth.FirebaseAuth;

public class
ModuloBoltColores extends AppCompatActivity {

    ImageButton siguiente;
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_bolt_colores);

        siguiente = (ImageButton) findViewById(R.id.siguiente);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloBoltColores.this, ModuloBoltColorMorado.class);
                ModuloBoltColores.this.startActivity(intentRec);
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

            startActivity(new Intent(ModuloBoltColores.this, ModuloMaya.class));

            return true;
        } else if (id == R.id.itModuloBolt) {

            startActivity(new Intent(ModuloBoltColores.this, ModuloBolt.class));

            return true;
        } else if (id == R.id.itModuloSuperBolt) {

            startActivity(new Intent(ModuloBoltColores.this, ModuloSuperBolt.class));

            return true;
        } else if (id == R.id.itInicio) {

            startActivity(new Intent(ModuloBoltColores.this, Modulos.class));

            return true;
        } else if (id == R.id.itCerrarSesion) {

            mAuth.signOut();
            startActivity(new Intent(ModuloBoltColores.this, MainActivity.class));
            finish();

            return true;
        } else if (id == R.id.itMiCuenta) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}