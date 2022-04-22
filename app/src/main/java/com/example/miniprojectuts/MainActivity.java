package com.example.miniprojectuts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RVinterface{

    Button buttonaddmail;
    TextView tv;

    List<maillist> listmail = new ArrayList<maillist>();
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fillmaillist();
        Toast.makeText(this, "mails count" + listmail.size(), Toast.LENGTH_SHORT).show();
        buttonaddmail = findViewById(R.id.buttonaddmail);


        tv = (TextView) findViewById(R.id.tvEmailSender);
        buttonaddmail.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MainActivity.this, addmail.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Maaf masih belum bisa mengirim email", Toast.LENGTH_SHORT).show();
            }

        });

        recyclerView = findViewById(R.id.avmaillist);

        recyclerView.setHasFixedSize(true);

        mAdapter = new RCAdapter(listmail, this,this);
        recyclerView.setAdapter(mAdapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


    }

    private void fillmaillist() {

        maillist p0 = new maillist(0,"Farhan","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum",  "03","mei","2020","","Loreipsum dolore");
        maillist p1 = new maillist(1,"Siti","Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.", "04","mei","2020","","missed title i dont know why");
        maillist p2 = new maillist(2,"Entong","But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system, and expound the actual teachings of the great explorer of the truth, the master-builder of human happiness.",  "05","mei","2020","", "the truth of happiness");
        maillist p3 = new maillist(3,"Budi","At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi, ",  "06","mei","2020","", "forsee the pain");
        maillist p4 = new maillist(4,"Teguh","saya sudah culik si farhun On the other hand, we denounce with righteous indignation and dislike men who are so beguiled and demoralized by the charms of pleasure of the moment, so blinded by desire, that they cannot foresee the pain and trouble that are bound to ensue",  "06","mei","2020","","deserunt mollitia");
        maillist p5 = new maillist(5,"Monika","are so beguiled and demoralized by the charms of pleasure of the moment, so blinded by desire, that they cannot foresee the pain and trouble that are bound to ensue",  "06","mei","2020","", "bound to bound");
        maillist p6 = new maillist(6,"zidan","On the other hand, we denounce with righteous indignation and dislike men who are so beguiled and demoralized by the charms of pleasure of the moment, so blinded by desire, that they cannot foresee the pain and trouble that are bound to ensue",  "06","mei","2020","", "random title");
        maillist p7 = new maillist(7,"Rian","quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi",  "06","mei","2020","", "another random title");
        maillist p8 = new maillist(8, "kakarot", "But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system, and expound the actual teachings of the great explorer of the truth, the master-builder of human happiness.",  "05","mei","2020","", "i need happiness");
        maillist p9 = new maillist(9,"qinqio","quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi",  "06","mei","2020","", "pls read this as soon as possible");
        maillist p10= new maillist(10,"Suisei","similique sunt in culpa qui officia deserunt mollitia animi similique sunt in culpa qui officia deserunt mollitia animi quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi",  "06","mei","2020","", "pls buy my new album");

        listmail.addAll(Arrays.asList(new maillist[]{p0, p1, p2, p3, p4, p5, p6, p7,p8, p9, p10}));
    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent (MainActivity.this, detailmail.class);


        intent.putExtra("NAME", listmail.get(position).getName());
        intent.putExtra("TEXTED", listmail.get(position).getTexted());
        intent.putExtra("SUBJECT", listmail.get(position).getSubjek());
        intent.putExtra("ICON", listmail.get(position).getName().substring(0, 1));
        intent.putExtra("TANGGAL",listmail.get(position).getTanggal());
        intent.putExtra("BULAN", listmail.get(position).getBulan());

        startActivity(intent);
    }
}
