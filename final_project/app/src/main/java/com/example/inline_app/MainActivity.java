package com.example.inline_app;

import androidx.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    private NavigationView nv;
    CardView bursar, fin_aid, IT_dep, Acad_adv;
    TextView Info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dl = (DrawerLayout)findViewById(R.id.activity_main);
        t = new ActionBarDrawerToggle(this, dl,R.string.Open, R.string.Close);

        dl.addDrawerListener(t);
        t.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        nv = (NavigationView)findViewById(R.id.nv);
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener()

        bursar = findViewById(R.id.bursars);
        fin_aid = findViewById(R.id.financial_aid);
        IT_dep = findViewById(R.id.IT_dep);
        Acad_adv = findViewById(R.id.academic_adv);
        Info = findViewById(R.id.info);

        //Short Click Listeners

        bursar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AddInfo.class));
            }
        });

        fin_aid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AddInfo.class));
            }
        });

        IT_dep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AddInfo.class));
            }
        });

        Acad_adv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AddInfo.class));
            }
        });


        //Long click Listeners

        bursar.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                String info;
                info = getText(R.string.des1).toString();
                Intent i = new Intent(MainActivity.this, OfficeDetails.class);
                i.putExtra("key1", info);
                startActivity(i);
                return false;
            }
        });

        fin_aid.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                String info;
                info = getText(R.string.des2).toString();
                Intent i = new Intent(MainActivity.this, OfficeDetails.class);
                i.putExtra("key1", info);
                startActivity(i);

                return false;
            }
        });

        IT_dep.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                String info;
                info = getText(R.string.des3).toString();
                Intent i = new Intent(MainActivity.this, OfficeDetails.class);
                i.putExtra("key1", info);
                startActivity(i);
                return false;
            }
        });

        Acad_adv.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                String info;
                info = getText(R.string.des4).toString();
                Intent i = new Intent(MainActivity.this, OfficeDetails.class);
                i.putExtra("key1", info);
                startActivity(i);
                return false;
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.info_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch (id) {
            case R.id.info_menu_icon:

                AlertDialog.Builder builder
                        = new AlertDialog
                        .Builder(MainActivity.this);
                builder.setTitle("User Manual");
                builder.setMessage("Click on the office icon to enter your info and join the line.\n Long click on the office icon to view more information.");
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                return true;

            case R.id.status_menu_icon:
                startActivity(new Intent(MainActivity.this, Line_Status.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
        {
        
        if(t.onOptionsItemSelected(item))
            return true;

        return super.onOptionsItemSelected(item);
        }

    }
    @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch(id)
                {
                    case R.id.account:
                        Toast.makeText(MainActivity.this, "My Account",Toast.LENGTH_SHORT).show();
                    case R.id.settings:
                        Toast.makeText(MainActivity.this, "Settings",Toast.LENGTH_SHORT).show();
                    case R.id.mycart:
                        Toast.makeText(MainActivity.this, "My Cart",Toast.LENGTH_SHORT).show();
                    default:
                        return true;
                }




            }
        });


    }
}
