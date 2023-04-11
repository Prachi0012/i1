package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ProgressBarActivity extends AppCompatActivity {

    View btnShow;
    View btnHide;
    View progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);

        initview();
    }

    @SuppressLint("WrongViewCast")
    private void initview() {
        btnShow=findViewById(R.id.btnShow);
        btnHide=findViewById(R.id.btnHide);
        progressBar=findViewById(R.id.progressBar);

        btnShow.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                Intent i = new Intent(ProgressBarActivity.this,InstaFooterActivity.class);
                startActivity(i);
//                progressBar.setVisibility(View.VISIBLE);
            }
        });

        btnHide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(View.GONE);
            }
        });
    }
}