package com.example.prince.savelife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SuccessfullyPage extends AppCompatActivity {
    Button success;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_successfully_page);
        success=(Button)findViewById(R.id.continuebutton);
        success.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SuccessfullyPage.this,HomePage.class);
                startActivity(i);
            }
        });
    }
}
