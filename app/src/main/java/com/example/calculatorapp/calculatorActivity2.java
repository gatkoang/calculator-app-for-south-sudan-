package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calculatorActivity2 extends AppCompatActivity {
    //declare variable
    TextView btn_result;
    EditText btn_num1, btn_num2;
    Button btn_addition, btn_multiplication, btn_subtration, btn_division;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // these are find view
        setContentView(R.layout.activity_calculator2);
        btn_result= findViewById(R.id.btn_result);
        btn_num1=findViewById(R.id.btn_num1);
        btn_num2 = findViewById(R.id.btn_num2);
        btn_subtration = findViewById(R.id.btn_subtraction);
        btn_multiplication = findViewById(R.id.btn_multiplication);
        btn_addition = findViewById(R.id.btn_addition);
        btn_division = findViewById(R.id.btn_division);
        //  set click listeners
        btn_subtration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1, num2;
                num1 = btn_num1.getText().toString().trim();
                num2 = btn_num2.getText().toString().trim();

                if(num1.isEmpty()){
                    btn_num1.setError("please enter first number");
                }
                else if (num2.isEmpty())
                {
                    btn_num2.setError("please enter second number");
                }
                else
                {
                    double result= Double.parseDouble(num1) - Double.parseDouble(num2);
                    btn_result.setText(String.valueOf(result));
                }
            }
        });
        btn_multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1, num2;
                num1 = btn_num1.getText().toString().trim();
                num2 = btn_num2.getText().toString().trim();
                if(num1.isEmpty()){
                    btn_num1.setError("please enter first number");
                }
                else if (num2.isEmpty())
                {
                    btn_num2.setError("please enter second number");
                }
                else
                {
                    double result= Double.parseDouble(num1) * Double.parseDouble(num2);
                    btn_result.setText(String.valueOf(result));
                }
            }
        });
        btn_addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1, num2;
                num1 = btn_num1.getText().toString().trim();
                num2 = btn_num2.getText().toString().trim();

                if(num1.isEmpty()){
                    btn_num1.setError("please enter first number");
                }
                else if (num2.isEmpty())
                {
                    btn_num2.setError("please enter second number");
                }
                else
                    {
                        double result= Double.parseDouble(num1)+ Double.parseDouble(num2);
                        btn_result.setText(String.valueOf(result));
                    }
            }
        });
        btn_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1, num2;
                num1 = btn_num1.getText().toString().trim();
                num2 = btn_num2.getText().toString().trim();

                if(num1.isEmpty()){
                    btn_num1.setError("please enter first number");
                }
                else if (num2.isEmpty())
                {
                    btn_num2.setError("please enter second number");
                }
                else
                {
                    double result= Double.parseDouble(num1) / Double.parseDouble(num2);
                    btn_result.setText(String.valueOf(result));
                }
            }
        });
    }
}