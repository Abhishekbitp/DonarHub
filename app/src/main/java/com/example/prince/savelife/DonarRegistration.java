package com.example.prince.savelife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DonarRegistration extends AppCompatActivity {
    Toolbar don;
    EditText name, add, city, mob, blood, age;
    Button submit;

    String error = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donar_registration);
        don=(Toolbar)findViewById(R.id.toolbardon);

        don.setTitle("Donar Hub");
        don.setNavigationIcon(R.drawable.logo);
        don.setTitleTextColor(getResources().getColor(R.color.bar));
        don.setBackgroundColor(getResources().getColor(R.color.bar2));

        name=(EditText)findViewById(R.id.nameviewreg);
        add=(EditText)findViewById(R.id.adressviewreg);
        city=(EditText)findViewById(R.id.cityviewreg);
        mob=(EditText)findViewById(R.id.cellviewreg);
        blood=(EditText)findViewById(R.id.bloddviewreg);
        age=(EditText)findViewById(R.id.ageviewreg);

        submit=(Button)findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RegisterUser u = new RegisterUser();

                String nam = name.getText().toString();
                String addd = add.getText().toString();
                String cityy = city.getText().toString();
                String con = mob.getText().toString();
                String group = blood.getText().toString();
                String agee = age.getText().toString();



                if(nam.equalsIgnoreCase(error)||addd.equalsIgnoreCase(error)||cityy.equalsIgnoreCase(error)||con.equalsIgnoreCase(error)||group.equalsIgnoreCase(error)||agee.equalsIgnoreCase(error))
                {
                    Toast.makeText(DonarRegistration.this,"Please , Enter all the detail above...",Toast.LENGTH_SHORT).show();
                }
                else {
                    int donar = Integer.parseInt(agee);
                    if(donar<18)
                    {
                        Toast.makeText(DonarRegistration.this,"Sorry !! You are less than 18 , so you can't be a donar",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        u.setName(nam);
                        u.setAdd(addd);
                        u.setCity(cityy);
                        u.setMob(con);
                        u.setBlood(group);
                        u.setAge(agee);

                        Intent i = new Intent(DonarRegistration.this, HomePage.class);
                        startActivity(i);

                        Toast.makeText(DonarRegistration.this,"Thanks !! for register as a DONAR...",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });

    }
}
