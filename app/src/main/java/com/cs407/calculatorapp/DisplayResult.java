package com.cs407.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayResult extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_result);
        textView=(TextView) findViewById(R.id.resultvalue);
        Intent intent=getIntent();
        String str=intent.getStringExtra("message");
        textView.setText("Value is "+str);
    }
}