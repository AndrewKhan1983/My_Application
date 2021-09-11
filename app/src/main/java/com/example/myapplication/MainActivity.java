package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        }
        public void send (View view){
        EditText editText = (EditText) findViewById(R.id.edit);
        TextView textView = (TextView) findViewById(R.id.text);
        textView.setText(editText.getText());
        textView.setTextSize(28);
        textView.setTextColor(0X66b37ab4);
        textView.setTypeface(Typeface.create("casual",Typeface.NORMAL));



    }
}