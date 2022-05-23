package com.example.glames.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.glames.R;
import com.example.glames.entidades.NotasEscritas;

import java.util.ArrayList;

public class ListaNotasAdapter extends RecyclerView.Adapter<ListaNotasAdapter.NotasViewHolder> {

    ArrayList<NotasEscritas> listaNotas;

    public ListaNotasAdapter( ArrayList<NotasEscritas> listaNotas){
        this.listaNotas = listaNotas;
    }

    @NonNull
    @Override
    public NotasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_item_nota,null,false);
    return new NotasViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotasViewHolder holder, int position) {
        holder.viewNombre.setText(listaNotas.get(position).getNota());
    }

    @Override
    public int getItemCount() {
        return listaNotas.size();
    }

    public class NotasViewHolder extends RecyclerView.ViewHolder {

        TextView viewNombre;

        public NotasViewHolder(@NonNull View itemView) {
            super(itemView);

            viewNombre = itemView.findViewById(R.id.viewNota);

        }
    }
}
