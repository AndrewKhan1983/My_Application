package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication.databinding.ActivitySecond2Binding;

public class SecondActivity2 extends AppCompatActivity {

    public class MainActivity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_second2);
            Bundle arguments = getIntent().getExtras();
            Intent intent = new Intent();
            if (arguments.get("age").toString().equals("14")){
                intent.putExtra("result", "Welcome");
            }else{
                intent.putExtra("result", "no");
            }
            setResult(1,intent);
            finish();
            Toast.makeText(this, "Welcome" + arguments.get("name").toString(),Toast.LENGTH_LONG).show();
            setResult(1);
           }
        }

    }