package com.example.login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.login.Modelo.Usuario;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class Registro extends AppCompatActivity {

    private EditText etNombre;
    private EditText etApellido;
    private EditText etEdad;
    private EditText etCorreo;
    private EditText etClave;
    private Button btnRegistro;
    DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference();
    private Usuario usuario = new Usuario();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        etNombre = (EditText) findViewById(R.id.etNombre);
        etApellido = (EditText) findViewById(R.id.etApellido);
        etEdad = (EditText) findViewById(R.id.etEdad);
        etCorreo = (EditText) findViewById(R.id.etCorreo);
        etClave = (EditText) findViewById(R.id.etClave);
        btnRegistro = (Button) findViewById(R.id.btnRegistro);

        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                usuario.setNombre(etNombre.getText().toString());
                usuario.setApellido(etApellido.getText().toString());
                if (etEdad.getText().toString().equals("")){
                    usuario.setEdad(0);
                }
                else{
                    usuario.setEdad(Integer.parseInt(etEdad.getText().toString()));
                }
                usuario.setCorreo(etCorreo.getText().toString());
                usuario.setClave(etClave.getText().toString());

                String mensaje = validacion();

                if(mensaje.isEmpty()){

                    try{
                        registrarUsuario();
                    }
                    catch(Exception e){
                        throw e;
                    }
                }
                else{
                    Toast.makeText(getApplicationContext(), mensaje , Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void registrarUsuario() {

        FirebaseAuth.getInstance().createUserWithEmailAndPassword(usuario.getCorreo().toString(), usuario.getClave().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if (task.isSuccessful()){

                    usuario.setId(FirebaseAuth.getInstance().getCurrentUser().getUid());

                    mDatabase.child("usuario").child(usuario.getId()).setValue(usuario).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task2) {

                            if (task2.isSuccessful()){
                                Toast.makeText(getApplicationContext(), "Usuario agregado", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(Registro.this, MainActivity.class));
                                finish();
                            }
                            else{
                                Toast.makeText(getApplicationContext(), "No se han creado los datos", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
                else{
                    Toast.makeText(getApplicationContext(), "Error xd", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private String validacion() {

        if(usuario.getApellido().equals("") || usuario.getClave().equals("")
                || usuario.getCorreo().equals("") || usuario.getNombre().equals("") || usuario.getEdad() == 0
            )
            return "Campos requeridos";

        else if (usuario.getClave().length() < 7)
            return "La contraseña debe tener más de 6 caracteres";

        else
            return "";

    }
}