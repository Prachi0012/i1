package com.example.myapplication;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginScreenActivity extends AppCompatActivity {

    EditText edtMail;
    EditText edtPass;
    Button btnLogin;
    String mail;
    String pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        initview();
    }
    private void initview() {
        edtMail=findViewById(R.id.edtMail);
        btnLogin=findViewById(R.id.btnLogin);
        edtPass=findViewById(R.id.edtPass);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mail = edtMail.getText().toString();
                pass=edtPass.getText().toString();


                if (mail.isEmpty()) {

                    Toast.makeText(LoginScreenActivity.this, "Please Enter Your email id", Toast.LENGTH_LONG).show();
                }
                else if(pass.isEmpty()){
                    Toast.makeText(LoginScreenActivity.this, "Please Enter Your password", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(LoginScreenActivity.this, "Login Sucessful", Toast.LENGTH_LONG).show();
                }
            }
        });
        
    }
}