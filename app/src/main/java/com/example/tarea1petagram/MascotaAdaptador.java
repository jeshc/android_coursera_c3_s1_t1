package com.example.tarea1petagram;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder>{
    ArrayList<Mascota> listaMascotas;
    Activity activity;

    public MascotaAdaptador(ArrayList<Mascota> listaMascotas, Activity activity) {
        this.listaMascotas = listaMascotas;
        this.activity = activity;
    }

    @NonNull
    @Override
    public MascotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota,parent , false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MascotaViewHolder holder, int position) {
        Mascota mascota = listaMascotas.get(position);
        Log.d("debJH", "onBindViewHolder: " + mascota);
        holder.imgFoto.setImageResource(mascota.getFoto());
        holder.txtNombre.setText(mascota.getNombre());
        holder.txtRating.setText(String.valueOf(mascota.getRating()));

        holder.btnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mascota.setRating(mascota.getRating()+1);
                holder.txtRating.setText(""+mascota.getRating());
            }
        });


    }

    @Override
    public int getItemCount() {
        return listaMascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgFoto;
        private ImageButton btnLike;
        private TextView txtNombre;
        private TextView txtRating;

        public MascotaViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFoto = itemView.findViewById(R.id.imgFoto);
            btnLike = itemView.findViewById(R.id.btnLike);
            txtNombre = itemView.findViewById(R.id.txtNombre);
            txtRating = itemView.findViewById(R.id.txtRating);

        }
    }
}
