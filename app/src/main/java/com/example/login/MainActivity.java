package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvRegistrar;
    TextView tvRecuperarClave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creamos variable y le asociamos tvRegistrar del activity.main
        tvRegistrar = (TextView) findViewById(R.id.tvRegistrar);
        tvRecuperarClave = (TextView) findViewById(R.id.tvRecuperarClave);

        tvRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Para que un activity llame a otro
                Intent intentReg = new Intent(MainActivity.this, Registro.class);
                MainActivity.this.startActivity(intentReg);
            }
        });

        tvRecuperarClave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRec = new Intent(MainActivity.this, RecuperarClave.class);
                MainActivity.this.startActivity(intentRec);
            }
        });
    }
}