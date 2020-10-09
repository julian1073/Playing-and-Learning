package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloMayaColores extends AppCompatActivity {

    ImageButton siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_maya_colores);

        siguiente = (ImageButton) findViewById(R.id.azul);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloMayaColores.this, ModuloMayaColorAmarillo.class);
                ModuloMayaColores.this.startActivity(intentRec);
            }
        });

    }
}
