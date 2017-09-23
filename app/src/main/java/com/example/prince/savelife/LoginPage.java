package com.example.prince.savelife;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.makeText;

public class LoginPage extends AppCompatActivity {
    Button login,signup,login_same;
    EditText name,pass;

    String error="";

    Database data = new Database(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);


        login_same=(Button)findViewById(R.id.signinbutton);
        login=(Button)findViewById(R.id.loginbutton);
        signup=(Button)findViewById(R.id.signupbutton);

        name=(EditText)findViewById(R.id.editText);
        pass=(EditText)findViewById(R.id.editText2);


        login_same.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginPage.this,"Hi !! , You are Already at Signin Page",Toast.LENGTH_LONG).show();
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sign = new Intent(LoginPage.this,SignupPage.class);
                startActivity(sign);
            }
        });

       login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = name.getText().toString();
                String password = pass.getText().toString();
                String passwordtable = data.searchpass(str);
                //Toast.makeText(LoginPage.this,passwordtable,Toast.LENGTH_LONG).show();
                if(str.equalsIgnoreCase(error)||password.equalsIgnoreCase(error))
                {
                    Toast.makeText(LoginPage.this,"HI!! please fill all the above detail...",Toast.LENGTH_LONG).show();
                }
                else {
                    if (password.equalsIgnoreCase(passwordtable)) {
                        Intent i = new Intent(LoginPage.this, HomePage.class);
                        startActivity(i);
                    } else {
                        Toast.makeText(LoginPage.this, "Please,Enter valid user name & password", Toast.LENGTH_LONG).show();
                    }
                }


            }
        });

    }
}
