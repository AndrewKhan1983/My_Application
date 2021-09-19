package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
 }
    public void send (View view){
        EditText editTextName = (EditText) findViewById(R.id.editname);
        TextView textViewName = (TextView) findViewById(R.id.textname);
        EditText editTextBirth = (EditText) findViewById(R.id.editbirth);
        TextView textViewBirth = (TextView) findViewById(R.id.textbirth);
        Button button = (Button) findViewById(R.id.button);
        Intent intent = new Intent(this, SecondActivity2.class);
        intent.putExtra("name", editTextName.getText().toString());
        intent.putExtra("age", editTextBirth.getText().toString());
        startActivityForResult(intent, 1);

    }

    /*@Override
    public void startActivityForResult(Intent intent, int requestCode) {
        if (intent == null){return;}
        Toast.makeText(this, "Enter name and age", Toast.LENGTH_LONG).show();*/
    }


