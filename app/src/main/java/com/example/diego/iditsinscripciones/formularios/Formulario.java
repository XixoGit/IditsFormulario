package com.example.diego.iditsinscripciones.formularios;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;  //libreria completa support
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.diego.iditsinscripciones.R;

/**
 * Created by Diego on 23/9/2016.
 */
public class Formulario extends Fragment {

    //creo constructor vacio

    //


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       //ahora creamos la interfaz graica

        View interfazDelFragmento=inflater.inflate(R.layout.formulario,container,false);

        return  interfazDelFragmento;
    }



}
