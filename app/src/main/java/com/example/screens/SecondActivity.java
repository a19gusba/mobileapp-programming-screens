package com.example.screens;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);

        TextView textView = findViewById(R.id.name);

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            String name = extras.getString("name");
            int number = extras.getInt("number");
            textView.setText("Name: " + name + ", Number: " + number);
        }

        Button close = findViewById(R.id.close_second_activity);
        close.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                finish();
            }
        });
    }
}
