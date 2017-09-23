package com.example.prince.savelife;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class AboutUs extends Activity {
    Toolbar bar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        bar=(Toolbar)findViewById(R.id.toolbarcon);
        bar.setTitle("Donar Hub");
        bar.setNavigationIcon(R.drawable.logo);
        bar.setTitleTextColor(getResources().getColor(R.color.bar));
        bar.setBackgroundColor(getResources().getColor(R.color.bar2));
    }
}
