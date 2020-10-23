package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class ModuloBolt extends AppCompatActivity{

    ImageButton colores;
    ImageButton animales;
    ImageButton signos;
    ImageButton botonCuentos;
    ImageButton figuras;
    ImageButton ibtnTablas;

    private FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_bolt);

        animales = (ImageButton) findViewById(R.id.animales);

        animales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloBolt.this, ModuloBoltAnimales.class);
                ModuloBolt.this.startActivity(intentRec);
            }
        });
        colores = (ImageButton) findViewById(R.id.colores);
        colores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloBolt.this, ModuloBoltColores.class);
                ModuloBolt.this.startActivity(intentRec);
            }
        });

        signos = (ImageButton) findViewById(R.id.signos);
        signos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloBolt.this, ModuloBoltSignos.class);
                ModuloBolt.this.startActivity(intentRec);

            }
        });

        botonCuentos = (ImageButton) findViewById(R.id.botonCuentos);
        botonCuentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloBolt.this, ModuloBoltCuentosUno.class);

                ModuloBolt.this.startActivity(intentRec);
            }
        });
        figuras = (ImageButton) findViewById(R.id.figuras);

        figuras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloBolt.this, ModuloBoltFiguras.class);

                ModuloBolt.this.startActivity(intentRec);
            }
        });

        ibtnTablas = (ImageButton) findViewById(R.id.ibtnTablas);
        ibtnTablas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentRec = new Intent(ModuloBolt.this, ModuloBoltTablas.class);
                
                ModuloBolt.this.startActivity(intentRec);
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

            startActivity(new Intent(ModuloBolt.this, ModuloMaya.class));

            return true;
        } else if (id == R.id.itModuloBolt) {

            startActivity(new Intent(ModuloBolt.this, ModuloBolt.class));

            return true;
        } else if (id == R.id.itModuloSuperBolt) {

            startActivity(new Intent(ModuloBolt.this, ModuloSuperBolt.class));

            return true;
        } else if (id == R.id.itInicio) {

            startActivity(new Intent(ModuloBolt.this, Modulos.class));

            return true;
        } else if (id == R.id.itCerrarSesion) {

            mAuth.signOut();
            startActivity(new Intent(ModuloBolt.this, MainActivity.class));
            finish();

            return true;
        } else if (id == R.id.itMiCuenta) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

