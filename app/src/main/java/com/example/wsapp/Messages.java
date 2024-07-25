package com.example.wsapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

public class Messages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);
        ListView myListView = findViewById(R.id.lstvww2);
        ArrayList<String> msg = new ArrayList<>();
        msg.add("Nisha");
        msg.add("Sam");
        msg.add("Monica");
        msg.add("Denny");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, msg);
        myListView.setAdapter(arrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String text = "Contact" + position + " " + ((TextView) view).getText().toString();
                Toast.makeText(Messages.this, text, Toast.LENGTH_SHORT).show();

            }
        });
    }
}