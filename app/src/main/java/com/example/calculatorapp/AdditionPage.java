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

public class AdditionPage extends AppCompatActivity {
EditText eadd1,eadd2;
AppCompatButton badd1,badd2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_addition_page);

        eadd1=(EditText) findViewById(R.id.num1);
        eadd2=(EditText) findViewById(R.id.num2);
        badd1=(AppCompatButton) findViewById(R.id.addbtn);
        badd2=(AppCompatButton) findViewById(R.id.backbtn);

        badd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1=eadd1.getText().toString();
                String num2=eadd2.getText().toString();
                int n1=Integer.parseInt(num1);
                int n2=Integer.parseInt(num2);
                int sum=n1+n2;
                Toast.makeText(getApplicationContext(),String.valueOf(sum),Toast.LENGTH_LONG).show();
            }
        });

        badd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

    }
}