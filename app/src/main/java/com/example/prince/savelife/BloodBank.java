package com.example.prince.savelife;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BloodBank extends AppCompatActivity {
    Toolbar tbb;

    EditText city;
    String str="";
    Button sear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_bank);

        tbb=(Toolbar)findViewById(R.id.toolbarbbb);

        city=(EditText)findViewById(R.id.cityeditbb);
        sear=(Button)findViewById(R.id.findbbbutton);


        tbb.setTitle("Donar Hub");
        tbb.setNavigationIcon(R.drawable.logo);
        tbb.setTitleTextColor(getResources().getColor(R.color.bar));
        tbb.setBackgroundColor(getResources().getColor(R.color.bar2));

        sear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bloodcity = city.getText().toString();
                str="Blood bank in "+bloodcity;
                Intent search = new Intent(Intent.ACTION_WEB_SEARCH);
                search.putExtra(SearchManager.QUERY,str);
                startActivity(search);
            }
        });
    }

}
