package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloMaya extends AppCompatActivity{
    ImageButton vocales;
    ImageButton numeros;
    ImageButton colores;
    ImageButton animales;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_maya);

        vocales = (ImageButton) findViewById(R.id.vocales);
        numeros = (ImageButton) findViewById(R.id.numeros);
        colores = (ImageButton) findViewById(R.id.colores);
        animales = (ImageButton) findViewById(R.id.animales);

        vocales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloMaya.this, ModuloMayaVocales.class);
                ModuloMaya.this.startActivity(intentRec);
            }
        });

        numeros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloMaya.this, ModuloMayaNumeros.class);
                ModuloMaya.this.startActivity(intentRec);
            }
        });

        colores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloMaya.this, ModuloMayaColores.class);
                ModuloMaya.this.startActivity(intentRec);
            }
        });

        animales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloMaya.this, ModuloMayaAnimales.class);
                ModuloMaya.this.startActivity(intentRec);
            }
        });
    }

}


