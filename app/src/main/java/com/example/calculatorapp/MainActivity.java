package com.example.calculatorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
AppCompatButton B1,B2,B3,B4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

       B1=(AppCompatButton) findViewById(R.id.add);
       B2=(AppCompatButton) findViewById(R.id.sub);
       B3=(AppCompatButton) findViewById(R.id.mul);
       B4=(AppCompatButton) findViewById(R.id.div);

       B1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               Intent i1= new Intent(getApplicationContext(),AdditionPage.class);
               startActivity(i1);
           }
       });

       B2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               Intent i2= new Intent(getApplicationContext(),SubtractPage.class);
               startActivity(i2);
           }
       });

       B3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent i3= new Intent(getApplicationContext(),MultiplyPage.class);
               startActivity(i3);
           }
       });

       B4.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent i4= new Intent(getApplicationContext(),DividePage.class);
               startActivity(i4);
           }
       });
    }
}