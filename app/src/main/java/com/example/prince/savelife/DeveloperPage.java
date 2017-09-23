package com.example.prince.savelife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class DeveloperPage extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer_page);
        toolbar=(Toolbar)findViewById(R.id.toolbardev);
        toolbar.setTitle("Donar Hub");
        toolbar.setNavigationIcon(R.drawable.logo);
        toolbar.setTitleTextColor(getResources().getColor(R.color.bar));
        toolbar.setBackgroundColor(getResources().getColor(R.color.bar2));
    }
}
