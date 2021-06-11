package com.example.mycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edit1,edit2;
    Button button1, button2, button3, button4, button5;
    TextView textView1, textView2, textView3, textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1 = (EditText)findViewById(R.id.edit1);
        edit2 = (EditText)findViewById(R.id.edit2);
        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1,num2,name1;
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                int a = Integer.parseInt(num1);
                int b = Integer.parseInt(num2);
                int sum = a+b;
                name1 = "Answer = "+sum;
                textView1.setText(name1);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1,num2,name1;
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                int a = Integer.parseInt(num1);
                int b = Integer.parseInt(num2);
                int sub = a-b;
                name1 = "Answer =  "+sub;
                textView1.setText(name1);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1,num2,name1;
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                int a = Integer.parseInt(num1);
                int b = Integer.parseInt(num2);
                int mul = a*b;
                name1 = "Answer =  "+mul;
                textView1.setText(name1);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1,num2,name1;
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                int a = Integer.parseInt(num1);
                int b = Integer.parseInt(num2);
                float div = a/b;
                name1 = "Answer = "+div;
                textView1.setText(name1);
            }
        });

    }
}
