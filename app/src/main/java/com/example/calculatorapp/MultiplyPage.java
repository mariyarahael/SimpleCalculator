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

public class MultiplyPage extends AppCompatActivity {
 EditText emul1,emul2;
 AppCompatButton bmul1,bmul2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_multiply_page);

     emul1=(EditText) findViewById(R.id.num1);
     emul2=(EditText) findViewById(R.id.num2);
     bmul1=(AppCompatButton) findViewById(R.id.mulbtn);
     bmul2=(AppCompatButton) findViewById(R.id.backbtn);

     bmul1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             String num1=emul1.getText().toString();
             String num2=emul2.getText().toString();
             int n1=Integer.parseInt(num1);
             int n2=Integer.parseInt(num2);
             int sum=n1*n2;
             Toast.makeText(getApplicationContext(),String.valueOf(sum),Toast.LENGTH_LONG).show();

         }
     });

     bmul2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

    }
}