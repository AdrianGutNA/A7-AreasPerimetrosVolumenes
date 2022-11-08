package com.example.a7_areasperimetrosvolumenes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toolbar;

public class TrianguloActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText    txtN1;
    private Button      btnResultado;
    private TextView    txtResultadoPerimetro;
    private TextView    txtResultadoArea;

    private double lado1 = 0;
    private double resultadoPerimetro = 0;
    private double resultadoArea = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);

        getSupportActionBar().setTitle("Triangulo");

        btnResultado            =            findViewById(R.id.btnResultado);
        txtN1                   = (EditText) findViewById(R.id.txtN1);
        txtResultadoArea        = (TextView) findViewById(R.id.txtResultadoArea);
        txtResultadoPerimetro   = (TextView) findViewById(R.id.txtResultadoPerimetro);

        btnResultado.setOnClickListener(this);
        txtN1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnResultado:

                lado1 = Double.valueOf(txtN1.getText().toString());

                double resPerimetro = lado1 * 3;
                resultadoPerimetro = Math.round(resPerimetro*100.0)/100.0;

                double resultadoAltura1 = Math.pow(lado1,2)  - Math.pow(lado1/2,2);
                double altura1 = Math.sqrt(resultadoAltura1);

                double altura = (lado1 * altura1) / 2;
                resultadoArea = Math.round(altura*100.0)/100.0;

                txtResultadoArea.setText("" + resultadoArea + "cm^2.");
                txtResultadoPerimetro.setText("" + resultadoPerimetro + "cm.");
        }
    }
}