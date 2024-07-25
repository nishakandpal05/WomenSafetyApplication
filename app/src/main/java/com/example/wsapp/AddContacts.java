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

public class AddContacts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contacts);
        ListView myListView = findViewById(R.id.lstvw);
        ArrayList<String> contacts = new ArrayList<>();
        contacts.add("Nisha : 43859248928");
        contacts.add("Sam : 3829438609354");
        contacts.add("Monica : 34583940869");
        contacts.add("Denny : 3498239058");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, contacts);
        myListView.setAdapter(arrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String text = "Contact" + position + " " + ((TextView) view).getText().toString();
                Toast.makeText(AddContacts.this, text, Toast.LENGTH_SHORT).show();

            }
        });
    }
}