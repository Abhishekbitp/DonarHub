package com.example.prince.savelife;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.name;

public class SignupPage extends AppCompatActivity {
    Toolbar tb;
    TextView login;
    TextView first;
    Button signup;
    EditText nam;
    EditText phon;
    EditText pas;

    String error="";

    Database data = new Database(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_page);

        tb = (Toolbar)findViewById(R.id.toolbar);
        tb.setTitle("Donar Hub");
        tb.setNavigationIcon(R.drawable.logo);
        tb.setTitleTextColor(getResources().getColor(R.color.bar));
        tb.setBackgroundColor(getResources().getColor(R.color.bar2));

        login=(TextView)findViewById(R.id.loginbuttonview);
        first=(TextView)findViewById(R.id.firsttimeview);
        signup=(Button)findViewById(R.id.signuppagebutton);
        nam=(EditText)findViewById(R.id.editname);
        phon=(EditText)findViewById(R.id.editphone);
        pas=(EditText)findViewById(R.id.editpass);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent(SignupPage.this,LoginPage.class);
                startActivity(login);

            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nam.getText().toString();
                String mob = phon.getText().toString();
                String pass = pas.getText().toString();

                if(name.equalsIgnoreCase(error)||mob.equalsIgnoreCase(error)||pass.equalsIgnoreCase(error))
                {
                    Toast.makeText(SignupPage.this,"HI!! please fill all the above detail...",Toast.LENGTH_LONG).show();
                }
                else {
                    if (pass.length() < 6) {
                        Toast.makeText(SignupPage.this, "Please ,Chosse a strong password...", Toast.LENGTH_SHORT).show();
                    } else {
                        user u = new user();
                        u.setName(name);
                        u.setmob(mob);
                        u.setPassword(pass);
                        data.adduser(u);

                        Intent i = new Intent(SignupPage.this, SuccessfullyPage.class);
                        startActivity(i);
                    }
                }

            }
        });



    }
}
