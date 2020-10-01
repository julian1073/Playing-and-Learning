package com.example.login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class RecuperarClave extends AppCompatActivity {

    Button botonRecuperar;
    TextView tvRecuperarClave;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_recuperar_clave);

        //botonRecuperar = findViewById(R.id.bRecuperar);
       // tvRecuperarClave = findViewById(R.id.tvRecuperarClave);

        botonRecuperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate();
            }
        });

    }

    public void validate(){
        String email = tvRecuperarClave.getText().toString().trim();

//        if(email.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            tvRecuperarClave.setError("Correo invalido");
            return;
       // }

     //   sendEmail(email);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent intent = new Intent(RecuperarClave.this,MainActivity.class);
        startActivity(intent);
        finish();

    }

    public void sendEmail(String email){
       // FireBaseAuth auth = FirebaseAuth.getIntance();
        String direccionEmail = email;

        //auth.sendPasswordResetEmail(direccionEmail)
          //      .addOnCompleteListener(new OnCompleteListener<Void>(){
            //        @Override
              //      public void OnComplete(@NonNull Task<Void> task){
                //        if(task.isSuccessful()){
                    //        Toast.makeText(RecuperarClave.this, "Correo enviado", Toast.LENGTH_SHORT).show();
                      //      Intent inten = new Intent(RecuperarClave.this, MainActivity.class);
                  //          startActivity(intent);
                        //    finish();
                        //}else{
                          //  Toast.makeText(RecuperarClave.this, "Correo invalido", Toast.LENGTH_SHORT).show();
                   //     }
                    //}

             //   });
    }
}