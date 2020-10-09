package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Modulos extends AppCompatActivity{

    private ImageButton mMaya;
    private ImageButton mBolt;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.modulos);


            mMaya = (ImageButton) findViewById(R.id.mMaya);
            mBolt = (ImageButton) findViewById(R.id.mBolt);

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
        }
}




