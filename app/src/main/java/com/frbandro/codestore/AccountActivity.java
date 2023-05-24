package com.frbandro.codestore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class AccountActivity extends AppCompatActivity {
    EditText username, password;
    Button submit;
    FirebaseAuth Auther;
    FirebaseUser user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        username=findViewById(R.id.editTextUsername);
        password=findViewById(R.id.editTextPassword);
        submit=findViewById(R.id.buttonLogin);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Auther=FirebaseAuth.getInstance();
               String mail=username.getText().toString();
               String pass=password.getText().toString();
               Auther.signInWithEmailAndPassword(mail,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                   @Override
                   public void onComplete(@NonNull Task<AuthResult> task) {
                       Toast.makeText(AccountActivity.this,"Signin Successful",Toast.LENGTH_LONG).show();
                   }
               });
            }
        });
    }
}