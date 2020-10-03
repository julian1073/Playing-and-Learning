package com.example.login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.login.Modelo.Usuario;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    private TextView tvRegistrar;
    private TextView tvRecuperarClave;
    private Button btnIniciar;
    private EditText etCorreo;
    private EditText etClave;
    private String correo;
    private String clave;
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();
    private DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference();
    private Usuario usuario = new Usuario();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creamos variable y le asociamos tvRegistrar del activity.main
        tvRegistrar = (TextView) findViewById(R.id.tvRegistrar);
        tvRecuperarClave = (TextView) findViewById(R.id.tvRecuperarClave);
        btnIniciar = (Button) findViewById(R.id.btnIniciar);
        etCorreo = (EditText) findViewById(R.id.etCorreo);
        etClave = (EditText) findViewById(R.id.etClave);
        btnIniciar = (Button) findViewById(R.id.btnIniciar);

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

        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                correo = etCorreo.getText().toString();
                clave = etClave.getText().toString();

                String mensaje = validacion();

                if(mensaje.isEmpty()){

                    loginUser();
                }
                else{
                    Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_SHORT).show();
                }
            }
        });

       // getUserInfo();
    }

    public String validacion(){

        if (correo.equals("") || clave.equals(""))
            return "Campos requeridos";
        else
            return "";
    }

    public void loginUser(){

        mAuth.signInWithEmailAndPassword(correo, clave).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    startActivity(new Intent(MainActivity.this, Modulos.class));
                    finish();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Correo o clave incorrecta", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


   @Override
    protected void onStart() {

        super.onStart();
        if (mAuth.getCurrentUser() != null){
            startActivity(new Intent(MainActivity.this, Modulos.class));
            finish();
        }
    }

    //@Override
    //protected void onStart() {

       // super.onStart();
       // if (mAuth.getCurrentUser() != null){
       //     startActivity(new Intent(MainActivity.this, Modulos.class));
         //   finish();
        //}
   // }


    /*public void getUserInfo(){

        String id = mAuth.getCurrentUser().getUid();
        mDatabase.child("usuario").child(id).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()){

                    usuario.setNombre(snapshot.child("nombre").getValue().toString());
                    usuario.setApellido(snapshot.child("apellido").getValue().toString());
                    usuario.setEdad(Integer.parseInt(snapshot.child("edad").getValue().toString()));
                    usuario.setCorreo(snapshot.child("correo").getValue().toString());
                    usuario.setId(snapshot.child("id").getValue().toString());
                    usuario.setClave(snapshot.child("clave").getValue().toString());
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }*/
}