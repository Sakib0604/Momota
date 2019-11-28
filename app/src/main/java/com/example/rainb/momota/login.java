package com.example.rainb.momota;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class login extends AppCompatActivity implements View.OnClickListener {

    private Button buttonSignIn;
    private EditText editTextEmail;
    private EditText editTextPassword;
    private TextView textViewSignup;

    private ProgressDialog progressDialog;

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



        progressDialog=new ProgressDialog(this);

        firebaseAuth=FirebaseAuth.getInstance();

        editTextEmail=(EditText) findViewById(R.id.editTextEmail);
        editTextPassword=(EditText) findViewById(R.id.editTextPassword);

        buttonSignIn=(Button) findViewById(R.id.buttonSignin);

        textViewSignup=(TextView) findViewById(R.id.textViewSignup);

        buttonSignIn.setOnClickListener(this);
        textViewSignup.setOnClickListener(this);
    }

    private void userLogin(){

        String email=editTextEmail.getText().toString().trim();
        String password=editTextPassword.getText().toString().trim();


        if(TextUtils.isEmpty(email))
        {
            //email is empty
            Toast.makeText(this,"Please Enter Email",Toast.LENGTH_SHORT).show();

            return;
        }

        if(TextUtils.isEmpty(password))
        {
            //password ios empty
            Toast.makeText(this,"Please Enter Password",Toast.LENGTH_SHORT).show();

            return;
        }

        progressDialog.setMessage("Logging User ....");
        progressDialog.show();


        firebaseAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                progressDialog.dismiss();

                if(task.isSuccessful()){
                    //start home activity

                    finish();
                    startActivity(new Intent(getApplicationContext(),Home.class));
                }
                else
                {

                }

            }
        });

    }

    @Override
    public void onClick(View view) {
        if(view==buttonSignIn)
        {
            userLogin();
        }

        if(view==textViewSignup)
        {
            finish();
            startActivity(new Intent(this,Register.class));
        }
    }
}
