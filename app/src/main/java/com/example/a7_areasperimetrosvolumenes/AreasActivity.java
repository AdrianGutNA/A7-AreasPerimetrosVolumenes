package com.example.a7_areasperimetrosvolumenes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;

public class AreasActivity extends AppCompatActivity {

    private ArrayList<Datos> listDatos;
    private RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areas);

        getSupportActionBar().setTitle("Áreas y perimetros");


        recycler = findViewById(R.id.recyclerIdAreas);

        recycler.setHasFixedSize(true);
        Configuration orientation = new Configuration();

        if(this.recycler.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
            recycler.setLayoutManager(new GridLayoutManager(this,1));
        }
        else if(this.recycler.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            recycler.setLayoutManager(new GridLayoutManager(this,2));
        };

        listDatos = new ArrayList<Datos>();

        listDatos.add(new Datos(1,R.drawable.triangulo,"Triángulo"));
        listDatos.add(new Datos(2,R.drawable.rectangulo,"Rectángulo"));
        listDatos.add(new Datos(3,R.drawable.rombo,"Rombo"));
        listDatos.add(new Datos(4,R.drawable.circulo,"Círculo"));
        listDatos.add(new Datos(5,R.drawable.hexagono,"Hexágono"));

        AdapterDatos adapter = new AdapterDatos(listDatos);

        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent();
                if(listDatos.get(recycler.getChildAdapterPosition(view)).getIdFigura() == 1){
                    b = new Intent(AreasActivity.this, TrianguloActivity.class);
                } else if(listDatos.get(recycler.getChildAdapterPosition(view)).getIdFigura() == 2){
                    b = new Intent(AreasActivity.this, RectanguloActivity.class);
                }else if(listDatos.get(recycler.getChildAdapterPosition(view)).getIdFigura() == 3){
                    b = new Intent(AreasActivity.this, RomboActivity.class);
                }else if(listDatos.get(recycler.getChildAdapterPosition(view)).getIdFigura() == 4){
                    b = new Intent(AreasActivity.this, CirculoActivity.class);
                }else if(listDatos.get(recycler.getChildAdapterPosition(view)).getIdFigura() == 5){
                    b = new Intent(AreasActivity.this, HexagonoActivity.class);
                };

                startActivity(b);
            }
        });

        recycler.setAdapter(adapter);
    }
}