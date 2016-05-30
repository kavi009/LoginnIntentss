package com.example.subba.loginnintentss;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class UserActivity extends AppCompatActivity{
    TextView tvView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tvView = (TextView) findViewById(R.id.tvView);

        Intent intent = getIntent();

        String fName = intent.getStringExtra("fname");
        String lName = intent.getStringExtra("lname");

        tvView.setText("Welcome" + " " + fName + " " + lName);
    }
}
