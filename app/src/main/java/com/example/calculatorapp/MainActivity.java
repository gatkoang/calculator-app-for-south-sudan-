package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    // declaring variables are listed below
Button btn_calculator, btn_web, btn_intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //  finding the view by using findViewById() function
        btn_calculator= findViewById(R.id.btn_calculator);
        btn_intent = findViewById(R.id.btn_intent);
        btn_web = findViewById(R.id.btn_web);
        // set the variable to listeners
        btn_calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent do_calculator_page= new Intent(MainActivity.this,calculatorActivity2.class );
                startActivity(do_calculator_page);
            }
        });

        btn_intent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent do_intent_page= new Intent(MainActivity.this,intentActivity2.class );
                startActivity(do_intent_page);

            }
        });
        btn_web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent do_web_page= new Intent(MainActivity.this,webActivity2.class );
                startActivity(do_web_page);
            }
        });


    }
}