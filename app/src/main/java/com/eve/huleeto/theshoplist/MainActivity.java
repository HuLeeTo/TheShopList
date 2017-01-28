package com.eve.huleeto.theshoplist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    String lista_obtenida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void ejecuta_lista(View view){

        Intent i=new Intent(this, ListaConservas.class);

        startActivity(i);

    }
}
