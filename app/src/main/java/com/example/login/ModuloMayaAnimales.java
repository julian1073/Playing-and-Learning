package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class
ModuloMayaAnimales extends AppCompatActivity {

    ImageButton siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_maya_animales);

        siguiente = (ImageButton) findViewById(R.id.siguiente4);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloMayaAnimales.this, ModuloMayaAnimalesUno.class);
                ModuloMayaAnimales.this.startActivity(intentRec);
            }
        });

    }
}
