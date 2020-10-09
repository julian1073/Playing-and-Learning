package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloMayaNumeros extends AppCompatActivity {
    ImageButton siguienteNumeros;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_maya_numeros);

        siguienteNumeros = (ImageButton) findViewById(R.id.siguienteNumeros);

        siguienteNumeros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloMayaNumeros.this, ModuloMayaNumerosUno.class);
                ModuloMayaNumeros.this.startActivity(intentRec);
            }
        });

    }


}
