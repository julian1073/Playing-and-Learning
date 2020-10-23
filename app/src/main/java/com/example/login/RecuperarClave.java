package com.example.login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;


public class RecuperarClave extends AppCompatActivity {

    private Button btnRecuperar;
    private EditText tvRecuperarClave;
    private String email = "";
    private FirebaseAuth mAuth;
    private ProgressDialog mDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperar_clave);

        btnRecuperar = (Button) findViewById(R.id.btnRecuperar);
        tvRecuperarClave = (EditText) findViewById(R.id.tvRecuperarClave);
        mAuth = FirebaseAuth.getInstance();
        mDialog = new ProgressDialog(this);

        btnRecuperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                email = tvRecuperarClave.getText().toString();

                if (!email.isEmpty()){

                    mDialog.setMessage("Espere un momento...");
                    mDialog.setCanceledOnTouchOutside(false);
                    mDialog.show();
                    resetPassword();
                }
                else{
                    Toast.makeText(RecuperarClave.this, "Debe ingresar un correo", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    private void resetPassword(){

        mAuth.setLanguageCode("es");
        mAuth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {

                if (task.isSuccessful()){

                    Toast.makeText(RecuperarClave.this, "Se ha enviado un correo para restablecer la contraseña", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(RecuperarClave.this, "No se pudo envíar el correo", Toast.LENGTH_SHORT).show();
                }

                mDialog.dismiss();
            }
        });
    }
}