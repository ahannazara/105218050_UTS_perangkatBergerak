package com.example.miniprojectuts;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import android.widget.TextView;

public class detailmail extends AppCompatActivity {


    Button buttonforward, buttonreply, buttonreplyall, buttonback, buttonback3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailmail);

        buttonforward= findViewById(R.id.forwardbtn);
        buttonreply = findViewById(R.id.replybtn);
        buttonreplyall= findViewById(R.id.replyallbtn);
        buttonback = findViewById(R.id.back_button);
        buttonback3 = findViewById(R.id.back_button3);

        buttonforward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(detailmail.this, "forward di lakukan", Toast.LENGTH_SHORT).show();
            }
        });
        buttonreply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(detailmail.this, "reply ke- di lakukan", Toast.LENGTH_SHORT).show();
            }
        });
        buttonreplyall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(detailmail.this, "reply ke semua telah di lakukan", Toast.LENGTH_SHORT).show();
            }
        });
        buttonback.setOnClickListener(new View.OnClickListener() {

        public void onClick(View view) {
            Intent intent = new Intent (detailmail.this, MainActivity.class);
            startActivity(intent);
        }
        });
        buttonback3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent = new Intent (detailmail.this, MainActivity.class);
                startActivity(intent);
            }
        });
        String name = getIntent().getStringExtra("NAME");
        String teks = getIntent().getStringExtra("TEXTED");
        String subject =getIntent().getStringExtra("SUBJECT");
        String icon = getIntent().getStringExtra("ICON");
        String tanggal = getIntent().getStringExtra("TANGGAL");
        String bulan = getIntent().getStringExtra("BULAN");

        TextView namedetail = findViewById(R.id.tvEmailSender);
        TextView textdetail = findViewById(R.id.detaildetail);
        TextView subjectdetail = findViewById(R.id.subject);
        TextView icondetail = findViewById(R.id.tvIcon);
        TextView tanggaldetail = findViewById(R.id.tanggaldetail);
        TextView bulandetail = findViewById(R.id.bulandetail);

        namedetail.setText(name);
        textdetail.setText(teks);
        subjectdetail.setText(subject);
        icondetail.setText(icon);
        tanggaldetail.setText(tanggal);
        bulandetail.setText(bulan);
    }
}