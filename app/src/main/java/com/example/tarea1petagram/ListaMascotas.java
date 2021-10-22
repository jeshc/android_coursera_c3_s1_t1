package com.example.tarea1petagram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;


public class ListaMascotas extends AppCompatActivity {
    ArrayList<Mascota> listaMascotas;
    private RecyclerView rvMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_mascotas);
        rvMascotas = findViewById(R.id.rvMascotas);


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
    }

    public void inicializarAdaptador() {
        MascotaAdaptador adaptador = new MascotaAdaptador(listaMascotas, ListaMascotas.this);
        rvMascotas.setAdapter(adaptador);

    }
}