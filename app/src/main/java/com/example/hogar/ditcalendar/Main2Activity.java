package com.example.hogar.ditcalendar;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Hogar on 01/08/2016.
 */
public class Main2Activity extends AppCompatActivity {

    private ListView listaMaterias;
    private ArrayList<String> materiasSeleccionadas = new ArrayList<String>();
    private ArrayAdapter<String> adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
        materiasSeleccionadas = Materia.getPreferencias(pref);

        listaMaterias = (ListView) findViewById(R.id.listaMaterias);
        adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,materiasSeleccionadas);
        listaMaterias.setAdapter(adaptador);
    }
}
