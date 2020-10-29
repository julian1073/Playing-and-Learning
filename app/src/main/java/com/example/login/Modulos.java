package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class Modulos extends AppCompatActivity{

    private FirebaseAuth mAuth = FirebaseAuth.getInstance();
    private ImageButton mMaya;
    private ImageButton mBolt;
    private ImageButton mSuperBolt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulos);

            mMaya = (ImageButton) findViewById(R.id.mMaya);
            mBolt = (ImageButton) findViewById(R.id.mBolt);
            mSuperBolt = (ImageButton) findViewById(R.id.mSuperBolt);

            mMaya.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Para que un activity llame a otro
                    Intent intentReg = new Intent(Modulos.this, ModuloMaya.class);
                    Modulos.this.startActivity(intentReg);
                }
            });
            mBolt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Para que un activity llame a otro
                    Intent intentReg = new Intent(Modulos.this, ModuloBolt.class);
                    Modulos.this.startActivity(intentReg);
                }
            });
            mSuperBolt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Para que un activity llame a otro
                    Intent intentReg = new Intent(Modulos.this, ModuloSuperBolt.class);
                    Modulos.this.startActivity(intentReg);
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

            startActivity(new Intent(Modulos.this, ModuloMaya.class));

            return true;
        } else if (id == R.id.itModuloBolt) {

            startActivity(new Intent(Modulos.this, ModuloBolt.class));

            return true;
        } else if (id == R.id.itModuloSuperBolt) {

            startActivity(new Intent(Modulos.this, ModuloSuperBolt.class));

            return true;
        } else if (id == R.id.itInicio) {

            startActivity(new Intent(Modulos.this, Modulos.class));

            return true;
        } else if (id == R.id.itCerrarSesion) {

            mAuth.signOut();
            startActivity(new Intent(Modulos.this, MainActivity.class));
            finish();

            return true;
        } else if (id == R.id.itMiCuenta) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}




