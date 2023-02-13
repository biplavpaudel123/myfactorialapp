package com.example.dsaproject;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;
    private TextView textView5;
    private TextView textView6;
    private TextView textView7;
    private TextView textView8;
    private TextView textView9;
    private TextView textView10;

    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        textView1=findViewById(R.id.textView1);
        textView2=findViewById(R.id.textView2);
        textView3=findViewById(R.id.textView3);
        textView4=findViewById(R.id.textView4);
        textView5=findViewById(R.id.textView5);
        textView6=findViewById(R.id.textView6);
        textView7=findViewById(R.id.textView7);
        textView8=findViewById(R.id.textView8);
        textView9=findViewById(R.id.textView9);
        textView10=findViewById(R.id.textView10);
        editText=findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Toast.makeText(MainActivity.this, "Generated \n **Prepared by BIPLAV**", Toast.LENGTH_SHORT).show();
                    String s = editText.getText().toString();
                    long n = Integer.parseInt(s);
                    textView1.setText(n + " x 1 =" + n);
                    textView2.setText(n + " x 2 =" + n * 2);
                    textView3.setText(n + " x 3 =" + n * 3);
                    textView4.setText(n + " x 4 =" + n * 4);
                    textView5.setText(n + " x 5 =" + n * 5);
                    textView6.setText(n + " x 6 =" + n * 6);
                    textView7.setText(n + " x 7 =" + n * 7);
                    textView8.setText(n + " x 8 =" + n * 8);
                    textView9.setText(n + " x 9 =" + n * 9);
                    textView10.setText(n + " x 10 =" + n * 10);
                } catch (NumberFormatException e){
                    Toast.makeText(MainActivity.this, "Wrong or No input my friend", Toast.LENGTH_SHORT).show();
                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this, "Try smaller input", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}