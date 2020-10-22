package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloSuperBoltVocalesIngles extends AppCompatActivity {
    ImageButton siguienteVocalesIngles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_super_bolt_vocales_ingles);

        siguienteVocalesIngles = (ImageButton) findViewById(R.id.siguienteVocalesIngles);

        siguienteVocalesIngles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloSuperBoltVocalesIngles.this, ModuloSuperBoltVocalesInglesNext.class);
                ModuloSuperBoltVocalesIngles.this.startActivity(intentRec);
            }
        });

    }
}
