package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InfoActivity extends AppCompatActivity {

    EditText edtFName,edtLName,edtNum,edtAddress,edtMail,edtBusiness,edtLang,edtRef,edtEdu,edtSkill;
    Button btnLogin;
    String Fname,LName,Num,Address,Mail,Business,Lang,Ref,Edu,Skill;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        initview();
    }

    private void initview() {
        edtFName = findViewById(R.id.edtFName);
        edtLName = findViewById(R.id.edtLName);
        edtNum = findViewById(R.id.edtNum);
        edtAddress = findViewById(R.id.edtAddress);
        edtMail = findViewById(R.id.edtMail);
        edtBusiness = findViewById(R.id.edtBusiness);
        edtLang = findViewById(R.id.edtLang);
        edtRef = findViewById(R.id.edtRef);
        edtEdu = findViewById(R.id.edtEdu);
        edtSkill = findViewById(R.id.edtSkill);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Fname = edtFName.getText().toString();
                LName = edtLName.getText().toString();
                Num = edtNum.getText().toString();
                Address = edtAddress.getText().toString();
                Mail = edtMail.getText().toString();
                Business = edtBusiness.getText().toString();
                Lang = edtLang.getText().toString();
                Ref = edtRef.getText().toString();
                Edu = edtEdu.getText().toString();
                Skill = edtSkill.getText().toString();

                if (Fname.isEmpty()) {
                    Toast.makeText(InfoActivity.this, "Please Enter First Name", Toast.LENGTH_LONG).show();
                }
                if (LName.isEmpty()) {
                    Toast.makeText(InfoActivity.this, "Please Enter Last Name", Toast.LENGTH_LONG).show();
                }
                if (Num.isEmpty()) {
                    Toast.makeText(InfoActivity.this, "Please Enter Contact Number", Toast.LENGTH_LONG).show();
                }
                if (Address.isEmpty()) {
                    Toast.makeText(InfoActivity.this, "Please Enter Your Address", Toast.LENGTH_LONG).show();
                }
                if (Mail.isEmpty()) {
                    Toast.makeText(InfoActivity.this, "Please Enter E-Mail Id", Toast.LENGTH_LONG).show();
                }
                if (Business.isEmpty()) {
                    Toast.makeText(InfoActivity.this, "Please Enter Business Name", Toast.LENGTH_LONG).show();
                }
                if (Lang.isEmpty()) {
                    Toast.makeText(InfoActivity.this, "Please Enter Languages Known", Toast.LENGTH_LONG).show();
                }
                if (Ref.isEmpty()) {
                    Toast.makeText(InfoActivity.this, "Please Enter Reference", Toast.LENGTH_LONG).show();
                }
                if (Edu.isEmpty()) {
                    Toast.makeText(InfoActivity.this, "Please Enter Education", Toast.LENGTH_LONG).show();
                }
                if (Skill.isEmpty()) {
                    Toast.makeText(InfoActivity.this, "Please Enter Your Skill", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(InfoActivity.this, "Please Fill the full form", Toast.LENGTH_LONG).show();
                }
            }
        });
    }    
}