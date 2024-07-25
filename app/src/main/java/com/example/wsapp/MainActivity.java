package com.example.wsapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.net.Uri;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String PHONE_NUMBER = "358393849";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button callButton = findViewById(R.id.call_button);
        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialPhoneNumber(PHONE_NUMBER);
            }
        });
    }
        private void dialPhoneNumber(String phoneNumber) {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:" + phoneNumber));
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        }
    public void next(View view){
        Intent intent = new Intent(this , location.class);
        startActivity(intent);
    }
}


