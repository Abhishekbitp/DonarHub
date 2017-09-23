package com.example.prince.savelife;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import java.net.URI;

public class EmergencyPage extends AppCompatActivity {
    Toolbar tb;
    Button find;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_page);
        tb = (Toolbar)findViewById(R.id.toolbar3);

        tb.setTitle("Donar Hub");
        tb.setNavigationIcon(R.drawable.logo);
        tb.setTitleTextColor(getResources().getColor(R.color.bar));
        tb.setBackgroundColor(getResources().getColor(R.color.bar2));

        find=(Button)findViewById(R.id.findemer);

        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sear = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nhp.gov.in/helpline_pg"));
                startActivity(sear);
            }
        });
    }
}
