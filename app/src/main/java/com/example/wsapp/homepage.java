package com.example.wsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.View;

public class homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
    }
    public void addContact (View view){
        Intent intent = new Intent(this ,AddContacts.class);
        startActivity(intent);
    }
    public void sendmsg (View view){
        Intent intent = new Intent(this , Messages.class);
        startActivity(intent);
    }
}