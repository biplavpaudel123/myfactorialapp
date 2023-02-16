package com.example.dsaproject;


import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.UnicodeSetSpanner;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private EditText input1;
    private TextView output1;
    static long fact(long i){
        if (i==1)
            return 1;
        else
            return i*fact(i-1);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button);
        input1 = findViewById(R.id.input);
        output1 = findViewById(R.id.textView1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String s = input1.getText().toString();
                    long i = Integer.parseInt(s);
                    long output;
                    if (i >= 60) {
                        Toast.makeText(MainActivity.this, "Please try smaller input", Toast.LENGTH_SHORT).show();
                    } else {
                        output = fact(i);
                        output1.setText("The Factorial of " + s + " is " + output);
                        Toast.makeText(MainActivity.this, "**Calculated** \n prepared by Biplav", Toast.LENGTH_SHORT).show();
                    }
                } catch (Exception E) {
                    Toast.makeText(MainActivity.this, "Have you checked input?", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }}