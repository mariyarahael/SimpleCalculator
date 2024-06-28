package com.example.calculatorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DividePage extends AppCompatActivity {
EditText ediv1,ediv2;
AppCompatButton bdiv1,bdiv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_divide_page);

        ediv1=(EditText) findViewById(R.id.num1);
        ediv2=(EditText) findViewById(R.id.num2);
        bdiv1=(AppCompatButton) findViewById(R.id.divbtn);
        bdiv2=(AppCompatButton) findViewById(R.id.backbtn);

        bdiv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1=ediv1.getText().toString();
                String num2=ediv2.getText().toString();
                int n1=Integer.parseInt(num1);
                int n2=Integer.parseInt(num2);
                int sum=n1/n2;
                Toast.makeText(getApplicationContext(),String.valueOf(sum),Toast.LENGTH_LONG).show();
            }
        });

        bdiv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

    }
}