package com.example.tarea1petagram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;
import android.widget.TextView;


import java.util.ArrayList;

public class TopFive extends AppCompatActivity {
    ArrayList<Mascota> listaMascotas;
    private RecyclerView rvTopFiveMascotas;

    TextView tvTituloPantalla ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_five);
        Toolbar miActionBar = findViewById(R.id.miActionBAr);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rvTopFiveMascotas = findViewById(R.id.rvTopFiveMascotas);
        tvTituloPantalla = findViewById(R.id.tvTituloPantalla);
        tvTituloPantalla.setText("Top Five ");

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvTopFiveMascotas.setLayoutManager(llm);

        inicializarListaMascotas();
        inicializarAdaptador();
    }

    public void inicializarListaMascotas() {
        listaMascotas = new ArrayList<>();
        listaMascotas.add(new Mascota("Firulais", 15, R.drawable.puppy7));
        listaMascotas.add(new Mascota("Odin", 12, R.drawable.puppy6));
        listaMascotas.add(new Mascota("Chiquis", 8, R.drawable.puppy3));
        listaMascotas.add(new Mascota("Baxton", 7, R.drawable.puppy2));
        listaMascotas.add(new Mascota("Destroyer", 6, R.drawable.puppy1));

    }
    public void inicializarAdaptador() {
        MascotaAdaptador adaptador = new MascotaAdaptador(listaMascotas, TopFive.this);
        rvTopFiveMascotas.setAdapter(adaptador);

    }




}