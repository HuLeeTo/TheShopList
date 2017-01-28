package com.eve.huleeto.theshoplist;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class ListaConservas extends MainActivity {

    String[] conservas = new String[]{

            "Aceitunas"
            , "Alcachofas"
            , "Alcaparras"
            , "Aceitunas"
            , "Berberechos"
            , "Berenjenas"
            , "Brotes de Ajo"
            , "Champiñones"
            , "Dátiles"
            , "Espárragos"
            , "Foiegras"
            , "Judías Blancas"
            , "Judías Verdes"
            , "Mejillones"
            , "Piña en Almibar"
            , "Remolacha"
            , "Sardinillas en Aceite"
            , "Soja en Granos"
            , "Ternera Asada"
            , "Tomate Pelado"};

    int[] imagen_conserva = {
            R.drawable.consproducto00, R.drawable.consproducto00,
            R.drawable.consproducto00, R.drawable.consproducto00,
            R.drawable.consproducto00, R.drawable.consproducto00,
            R.drawable.consproducto00, R.drawable.consproducto00,
            R.drawable.consproducto00, R.drawable.consproducto00,
            R.drawable.consproducto00, R.drawable.consproducto00,
            R.drawable.consproducto00, R.drawable.consproducto00,
            R.drawable.consproducto00, R.drawable.consproducto00,
            R.drawable.consproducto00, R.drawable.consproducto00,
            R.drawable.consproducto00, R.drawable.consproducto00,
            R.drawable.consproducto00, R.drawable.consproducto00,
            R.drawable.consproducto00, R.drawable.consproducto00,
            R.drawable.consproducto00, R.drawable.consproducto00,
            R.drawable.consproducto00, R.drawable.consproducto00,
            R.drawable.consproducto00, R.drawable.consproducto00,
            R.drawable.consproducto00, R.drawable.consproducto00};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_productos);

        ListAdapter adaptador = new ArrayAdapter<String>(this, R.layout.fila, conservas);
        //ListAdapter adapImagen = new Ima

        ListView lv = (ListView) findViewById(R.id.listaproductos);
        lv.setAdapter(adaptador);

    }
}
