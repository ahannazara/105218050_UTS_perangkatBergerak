package com.example.miniprojectuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class addmail extends AppCompatActivity {

    Button buttoncancel;
    Button buttonOK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addmail);
        buttoncancel = findViewById(R.id.buttoncancel);

        buttoncancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (addmail.this, MainActivity.class);
                startActivity(intent);
            }
        });

        buttonOK = findViewById(R.id.buttonOK);
        buttonOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (addmail.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}