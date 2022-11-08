package com.example.a7_areasperimetrosvolumenes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CirculoActivity extends AppCompatActivity implements View.OnClickListener {


    private EditText txtN1;
    private Button btnResultado;
    private TextView txtResultadoPerimetro;
    private TextView    txtResultadoArea;

    private double radio = 0;
    private double resultadoPerimetro = 0;
    private double resultadoArea = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);

        getSupportActionBar().setTitle("Circulo");

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

                radio = Double.valueOf(txtN1.getText().toString());

                double resultadoPerimetro1 = 2 * Math.PI * radio;

                double resultadoArea1 = Math.PI * Math.pow(radio,2);

                resultadoPerimetro = Math.round(resultadoPerimetro1*100.0)/100.0;;

                resultadoArea = Math.round(resultadoArea1*100.0)/100.0;

                txtResultadoArea.setText("" + resultadoArea + "cm^2.");
                txtResultadoPerimetro.setText("" + resultadoPerimetro + "cm.");
        }
    }
}