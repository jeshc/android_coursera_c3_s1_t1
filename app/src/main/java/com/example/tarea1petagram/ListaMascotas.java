package com.example.tarea1petagram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;


public class ListaMascotas extends AppCompatActivity {
    ArrayList<Mascota> listaMascotas;
    private RecyclerView rvMascotas;
    TextView tvTituloPantalla ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_mascotas);
        Toolbar miActionBar = findViewById(R.id.miActionBAr);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rvMascotas = findViewById(R.id.rvMascotas);
        tvTituloPantalla = findViewById(R.id.tvTituloPantalla);
        tvTituloPantalla.setText("Catálogo Mascotas");

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvMascotas.setLayoutManager(llm);


        /*
        GridLayoutManager glm = new GridLayoutManager(this, 2);
        rvMascotas.setLayoutManager(glm);
*/


        inicializarListaMascotas();
        inicializarAdaptador();
    }

    public void inicializarListaMascotas() {
        listaMascotas = new ArrayList<Mascota>();
        listaMascotas.add(new Mascota("Rocky", 4, R.drawable.puppy1));
        listaMascotas.add(new Mascota("Rex", 1, R.drawable.puppy2));
        listaMascotas.add(new Mascota("Chiquis", 2, R.drawable.puppy3));
        listaMascotas.add(new Mascota("Baxton", 3, R.drawable.puppy4));
        listaMascotas.add(new Mascota("Destroyer", 5, R.drawable.puppy5));
        listaMascotas.add(new Mascota("Max", 6, R.drawable.puppy6));
        listaMascotas.add(new Mascota("Odin", 3, R.drawable.puppy7));
        listaMascotas.add(new Mascota("Baxter", 4, R.drawable.puppy1));
        listaMascotas.add(new Mascota("Don Kiko", 1, R.drawable.puppy2));
        listaMascotas.add(new Mascota("paletin", 2, R.drawable.puppy3));
        listaMascotas.add(new Mascota("mac", 3, R.drawable.puppy4));
        listaMascotas.add(new Mascota("Lula", 5, R.drawable.puppy5));
        listaMascotas.add(new Mascota("Chupon", 6, R.drawable.puppy6));
        listaMascotas.add(new Mascota("Random", 3, R.drawable.puppy7));
    }

    public void inicializarAdaptador() {
        MascotaAdaptador adaptador = new MascotaAdaptador(listaMascotas, ListaMascotas.this);
        rvMascotas.setAdapter(adaptador);

    }

    public void irAlTopFive(View v){
        Intent intent = new Intent(ListaMascotas.this , TopFive.class);
        startActivity(intent);
    }
}