package com.example.tarea1petagram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar miActionBar = findViewById(R.id.miActionBAr);
        //setSupportActionBar(miActionBar);

    }

    public void startApp(View v){
        Intent intent = new Intent(MainActivity.this , ListaMascotas.class);
        startActivity(intent);
    }



}