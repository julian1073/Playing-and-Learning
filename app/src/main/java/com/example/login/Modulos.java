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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulos);
    }

    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.activity_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.itModuloMaya) {

            return true;
        } else if (id == R.id.itModuloBolt) {

            return true;
        } else if (id == R.id.itModuloSuperBolt) {

            return true;
        } else if (id == R.id.itInicio){

            startActivity(new Intent(Modulos.this, Modulos.class));

            return true;
        } else if (id == R.id.itCerrarSesion) {

            mAuth.signOut();
            startActivity(new Intent(Modulos.this, MainActivity.class));
            finish();

            return true;
        } else if (id == R.id.itMiCuenta) {

            return true;

    private ImageButton mMaya;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.modulos);


            mMaya = (ImageButton) findViewById(R.id.mMaya);


            mMaya.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Para que un activity llame a otro
                    Intent intentReg = new Intent(Modulos.this, ModuloMaya.class);
                    Modulos.this.startActivity(intentReg);
                }
            });
        }

        return super.onOptionsItemSelected(item);
    }
}




