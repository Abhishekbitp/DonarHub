package com.example.prince.savelife;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomePage extends AppCompatActivity {
    Button reg,find,bbank;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setBackground(new ColorDrawable(Color.parseColor("#8B0000")));
        toolbar.setTitle("Donar Hub");
        toolbar.setNavigationIcon(R.drawable.logo);
        setSupportActionBar(toolbar);

        reg=(Button)findViewById(R.id.reg);
        find=(Button)findViewById(R.id.find);
        bbank=(Button)findViewById(R.id.bank);

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reg = new Intent(HomePage.this,DonarRegistration.class);
                startActivity(reg);
            }
        });

        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent find = new Intent(HomePage.this,FindBlood.class);
                startActivity(find);
            }
        });

        bbank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bb= new Intent(HomePage.this,BloodBank.class);
                startActivity(bb);
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.action_home:
                Intent home = new Intent(HomePage.this,LoginPage.class);
                startActivity(home);
                return true;
            case R.id.action_Emer:
               Intent emer = new Intent(HomePage.this,EmergencyPage.class);
                startActivity(emer);
                return true;

            case R.id.action_con:
                Intent con = new Intent(HomePage.this,AboutUs.class);
                startActivity(con);
                return true;
            case R.id.action_dev:
                Intent dev = new Intent(HomePage.this,DeveloperPage.class);
                startActivity(dev);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
