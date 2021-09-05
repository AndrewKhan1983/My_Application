package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView = (TextView) findViewById(R.id.header);
        textView.setText("Hello");

        TextView textView2 = (TextView) findViewById(R.id.header2);
        textView.setText("from");

        TextView textView3 = (TextView) findViewById(R.id.header3);
        textView.setText("Java!!!");
    }
}