package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity {

    CheckBox cbDancing, cbSinging, cbTravelling, cbReading, cbOther;
    AppCompatButton btnSubmit;
    String hobby = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        initview();
    }

    private void initview() {
        cbDancing = findViewById(R.id.cbDancing);
        cbSinging = findViewById(R.id.cbSinging);
        cbTravelling = findViewById(R.id.cbTravelling);
        cbReading = findViewById(R.id.cbReading);
        cbOther = findViewById(R.id.cbOther);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hobby = "";
                if (cbDancing.isChecked()) {
                    hobby += cbDancing.getText().toString();
                    Toast.makeText(CheckBoxActivity.this, hobby, Toast.LENGTH_LONG).show();
                }
                if (cbSinging.isChecked()) {
                    hobby += cbSinging.getText().toString();
                    Toast.makeText(CheckBoxActivity.this, hobby, Toast.LENGTH_LONG).show();
                }
                if (cbTravelling.isChecked()) {
                    hobby += cbTravelling.getText().toString();
                    Toast.makeText(CheckBoxActivity.this, hobby, Toast.LENGTH_LONG).show();
                }
                if (cbReading.isChecked()) {
                    hobby += cbReading.getText().toString();
                    Toast.makeText(CheckBoxActivity.this, hobby, Toast.LENGTH_LONG).show();
                }
                if (cbOther.isChecked()) {
                    hobby += cbOther.getText().toString();
                    Toast.makeText(CheckBoxActivity.this, hobby, Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}