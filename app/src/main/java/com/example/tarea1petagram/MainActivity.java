package com.example.tarea1petagram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void startApp(View v){
        Intent intent = new Intent(MainActivity.this , ListaMascotas.class);
        startActivity(intent);
    }
}