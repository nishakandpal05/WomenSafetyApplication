package com.example.wsapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class signing extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signing);
    }
    public void signup (View view){
        Intent intent = new Intent(this ,signup.class);
        startActivity(intent);
    }
    public void signin (View view){
        Intent intent = new Intent(this ,signin.class);
        startActivity(intent);
    }
}