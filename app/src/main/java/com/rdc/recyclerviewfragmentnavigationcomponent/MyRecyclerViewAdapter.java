package com.rdc.recyclerviewfragmentnavigationcomponent;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {

     ArrayList<Museo> museos;

     public MyRecyclerViewAdapter(ArrayList<Museo> museos){

        this.museos = museos;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

         // Instanciamos objetos de las views que nos encontramos en item_museo
        ImageView imagen;
        TextView ubicacion, nombre;

        public ViewHolder(View itemView) {
            super(itemView);

            // Añadimos a esas variables, su view con su correspondiente id
            imagen = itemView.findViewById(R.id.imgmuseo);
            ubicacion = itemView.findViewById(R.id.tvubicacionmuseo);
            nombre = itemView.findViewById(R.id.tvnombremuseo);
        }
    }

    @Override // Llama a este método siempre que necesita crear una ViewHolder nueva(una vista nueva)
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

         // Me inflas en view, la "plantilla" donde se van a mostrar los datos
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_museo,null,false);
        return new ViewHolder(view);
    }

    @Override // Llama a este método para asociar una ViewHolder con los datos(introducir datos en la vista)
    public void onBindViewHolder(ViewHolder holder, int position) {

         // getImage, getUbicacion y getNombre son los getters de la clase Museo
        holder.imagen.setImageResource(museos.get(position).getImage());
        holder.ubicacion.setText(museos.get(position).getUbicacion());
        holder.nombre.setText(museos.get(position).getNombre());


        // Para poner oyente de evento a un item del recyclerview
        holder.itemView.setOnClickListener(view -> {

            Toast.makeText(view.getContext(), "Item clikado: " + museos.get(position).getNombre(), Toast.LENGTH_SHORT).show();
        });
    }

    @Override // llama a este método a fin de obtener el tamaño del conjunto de datos(para saber cuantas vistas han de crearse)
    public int getItemCount() {

        return museos.size();
    }
}