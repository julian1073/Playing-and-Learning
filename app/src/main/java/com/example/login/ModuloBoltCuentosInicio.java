package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloBoltCuentosInicio extends AppCompatActivity {

    ImageButton siguienteCuentosInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_bolt_cuentos_inicio);

        siguienteCuentosInicio = (ImageButton) findViewById(R.id.siguienteCuentosInicio);

        siguienteCuentosInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloBoltCuentosInicio.this, ModuloBoltCuentosUno.class);
                ModuloBoltCuentosInicio.this.startActivity(intentRec);
            }
        });

    }
}
