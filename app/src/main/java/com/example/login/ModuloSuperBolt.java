package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class ModuloSuperBolt extends AppCompatActivity {

    ImageButton iVocales;
    ImageButton animalesIngles;
    ImageButton iColores;

    ImageButton numerosIngles;
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_super_bolt);

        animalesIngles = (ImageButton) findViewById(R.id.iAnimales);
        numerosIngles = (ImageButton) findViewById(R.id.imageButton7);

        animalesIngles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloSuperBolt.this, ModuloSuperBoltAnimales.class);
                ModuloSuperBolt.this.startActivity(intentRec);
            }
        });

        iVocales = (ImageButton) findViewById(R.id.iVocales);

        iVocales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloSuperBolt.this, ModuloSuperBoltVocalesIngles.class);
                ModuloSuperBolt.this.startActivity(intentRec);
            }
        });
        iColores = (ImageButton) findViewById(R.id.colors);

        iColores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloSuperBolt.this, ModuloSuperBoltColoresIngles.class);
                ModuloSuperBolt.this.startActivity(intentRec);
            }
        });

        numerosIngles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloSuperBolt.this, ModuloSuperBoltNumeros.class);
                ModuloSuperBolt.this.startActivity(intentRec);
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

            startActivity(new Intent(ModuloSuperBolt.this, ModuloMaya.class));

            return true;
        } else if (id == R.id.itModuloBolt) {

            startActivity(new Intent(ModuloSuperBolt.this, ModuloBolt.class));

            return true;
        } else if (id == R.id.itModuloSuperBolt) {

            startActivity(new Intent(ModuloSuperBolt.this, ModuloSuperBolt.class));

            return true;
        } else if (id == R.id.itInicio) {

            startActivity(new Intent(ModuloSuperBolt.this, Modulos.class));

            return true;
        } else if (id == R.id.itCerrarSesion) {

            mAuth.signOut();
            startActivity(new Intent(ModuloSuperBolt.this, MainActivity.class));
            finish();

            return true;
        } else if (id == R.id.itMiCuenta) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}


