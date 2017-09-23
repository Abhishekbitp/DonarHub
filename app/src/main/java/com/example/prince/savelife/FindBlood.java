package com.example.prince.savelife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FindBlood extends AppCompatActivity {
    Toolbar fb;
    Button find;
    EditText name,blood,city;

    String error="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_blood);

        fb=(Toolbar)findViewById(R.id.toolbarfind);
        find=(Button)findViewById(R.id.findbutton);
        name=(EditText)findViewById(R.id.nameeditfind);
        blood=(EditText)findViewById(R.id.bloodeditfind);
        city=(EditText)findViewById(R.id.cityeditfind);


        fb.setTitle("Donar Hub");
        fb.setNavigationIcon(R.drawable.logo);
        fb.setTitleTextColor(getResources().getColor(R.color.bar));
        fb.setBackgroundColor(getResources().getColor(R.color.bar2));



        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String namestr = name.getText().toString();
                String bloodstr = blood.getText().toString();
                String citystr = city.getText().toString();

                if(namestr.equalsIgnoreCase(error)||bloodstr.equalsIgnoreCase(error)||citystr.equalsIgnoreCase(error))
                {
                    Toast.makeText(FindBlood.this,"Please !! Enter all the detail above.....",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(FindBlood.this,"Sorry !! Blood Group Not Found due this app is connected with server >>>>>",Toast.LENGTH_LONG).show();
                    Intent i = new Intent(FindBlood.this,ErrorPage.class);
                    startActivity(i);
                }


            }
        });




    }
}
