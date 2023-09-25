package com.cs407.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void addition(View view){
        EditText input1 = (EditText) findViewById(R.id.editTextNumber);
        int number1 = Integer.valueOf(input1.getText().toString());
        EditText input2 = (EditText) findViewById(R.id.editTextNumber2);
        int number2 = Integer.valueOf(input2.getText().toString());
        Integer numberfinal = number1 + number2;

        goToActivity(String.valueOf(numberfinal));
    }

    public void subtraction(View view){
        EditText input1 = (EditText) findViewById(R.id.editTextNumber);
        int number1 = Integer.valueOf(input1.getText().toString());
        EditText input2 = (EditText) findViewById(R.id.editTextNumber2);
        int number2 = Integer.valueOf(input2.getText().toString());
        Integer numberfinal = number1 - number2;

        goToActivity(String.valueOf(numberfinal));
    }

    public void multiplication(View view){
        EditText input1 = (EditText) findViewById(R.id.editTextNumber);
        int number1 = Integer.valueOf(input1.getText().toString());
        EditText input2 = (EditText) findViewById(R.id.editTextNumber2);
        int number2 = Integer.valueOf(input2.getText().toString());
        Integer numberfinal = number1 * number2;

        goToActivity(String.valueOf(numberfinal));
    }

    public void division(View view){
        EditText input1 = (EditText) findViewById(R.id.editTextNumber);
        int number1 = Integer.valueOf(input1.getText().toString());
        EditText input2 = (EditText) findViewById(R.id.editTextNumber2);
        int number2 = Integer.valueOf(input2.getText().toString());
        if (number2 == 0) {
            Toast.makeText(MainActivity.this, "ERROR: Cannot divide by 0", Toast.LENGTH_LONG).show();
        } else {
            Integer numberfinal = number1 / number2;
            goToActivity(String.valueOf(numberfinal));
        }
    }

    public void goToActivity(String s) {
        Intent intent = new Intent(this, DisplayResult.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}