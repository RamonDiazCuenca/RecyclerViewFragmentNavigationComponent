package com.rdc.recyclerviewfragmentnavigationcomponent;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rdc.recyclerviewfragmentnavigationcomponent.databinding.FragmentMuseosBinding;

import java.util.ArrayList;

public class MuseosFragment extends Fragment {

    RecyclerView recyclerViewMuseos;
    ArrayList<Museo> listaMuseos;

    public MuseosFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_museos, container, false);

        // Instanciamos el ArrayList
        listaMuseos = new ArrayList<>();
        // Nos traemos el recyclerView del xml llamado fragment_museos
        recyclerViewMuseos = view.findViewById(R.id.recyclerViewId);
        recyclerViewMuseos.setLayoutManager(new LinearLayoutManager(getContext()));
        // Llamamos a este método para meter los datos en el ArrayList
        llenarLista();

        // Instanciamos la clase donde tenemos el adapter
        MyRecyclerViewAdapter adapter = new MyRecyclerViewAdapter(listaMuseos);

        // Lo metemeos en el recyclerView
        recyclerViewMuseos.setAdapter(adapter);

        return view;
    }

    private void llenarLista() {

        listaMuseos.add(new Museo("Francia, Paris","Museo Louvre",R.drawable.museolouvre));
        listaMuseos.add(new Museo("España, Madrid","Museo del Prado",R.drawable.museoprado));
        listaMuseos.add(new Museo("Inglaterra, Londres","Museo Britanico",R.drawable.museobritanico));
    }
}