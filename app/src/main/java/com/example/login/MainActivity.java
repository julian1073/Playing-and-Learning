package com.example.login;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.login.Modelo.Usuario;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Objects;

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
    private GoogleSignInClient mGoogleSignInClient;
    private int RC_SIGN_IN = 1;
    private SignInButton btnIniciarGoogle;

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
        btnIniciarGoogle =  findViewById(R.id.btnIniciarGoogle);

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

        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();

        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);

        btnIniciarGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IniciarGoogle();
            }
        });

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

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onStart() {

        super.onStart();
        if (mAuth.getCurrentUser() != null){
            getUserInfo();
            startActivity(new Intent(MainActivity.this, Modulos.class));
            finish();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void getUserInfo(){

        try {
            String id = Objects.requireNonNull(mAuth.getCurrentUser().getUid());

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
        }
        catch (Exception ex) {
            throw ex;
        }
    }

    private void IniciarGoogle(){

        Intent signInIntent = mGoogleSignInClient.getSignInIntent();
        startActivityForResult(signInIntent, RC_SIGN_IN);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RC_SIGN_IN){

            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            handleSignInResult(task);
        }
    }

    private void handleSignInResult(Task<GoogleSignInAccount> completedTask){

        try{
            GoogleSignInAccount acc = completedTask.getResult(ApiException.class);
            Toast.makeText(MainActivity.this, "Inicio satisfactorio", Toast.LENGTH_SHORT).show();
            FirebaseGoogleAuth(acc);
        }
        catch(ApiException e){
            Toast.makeText(MainActivity.this, "Inicio fallido", Toast.LENGTH_SHORT).show();
            FirebaseGoogleAuth(null);
        }
    }

    private void FirebaseGoogleAuth(GoogleSignInAccount acct){

        AuthCredential authCredential = GoogleAuthProvider.getCredential(acct.getIdToken(), null);
        mAuth.signInWithCredential(authCredential).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if(task.isSuccessful()){
                    startActivity(new Intent(MainActivity.this, Modulos.class));
                    FirebaseUser user = mAuth.getCurrentUser();
                    updateUI(user);
                }
                else{
                    Toast.makeText(MainActivity.this, "Inicio fallido", Toast.LENGTH_SHORT).show();
                    updateUI(null);
                }
            }
        });
    }

    private void updateUI(FirebaseUser fUser){

        GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(getApplicationContext());
        if (account != null){

            usuario.setNombre(account.getDisplayName());
            usuario.setApellido(account.getFamilyName());
            usuario.setCorreo(account.getEmail());
            usuario.setId(account.getId());
        }
    }
}
