package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button log;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        log =(Button) findViewById(R.id.button);
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sign=new Intent(MainActivity.this , pagefour.class);
                startActivity(sign);
            }
        });

        getSupportActionBar().hide();

    }
}