package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ModuloBolt extends AppCompatActivity {

    ImageButton botonCuentos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulo_bolt);

        botonCuentos = (ImageButton) findViewById(R.id.botonCuentos);

        botonCuentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(ModuloBolt.this, ModuloBoltCuentosUno.class);
                ModuloBolt.this.startActivity(intentRec);
            }
        });
    }
}