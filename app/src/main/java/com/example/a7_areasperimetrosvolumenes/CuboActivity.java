package com.example.a7_areasperimetrosvolumenes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CuboActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText txtN1;
    private Button btnResultado;
    private TextView txtResultadoVolumen;

    private double lado1 = 0;
    private double resultadoVolumen = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cubo);

        getSupportActionBar().setTitle("Cubo");

        btnResultado            =            findViewById(R.id.btnResultado);
        txtN1                   = (EditText) findViewById(R.id.txtN1);
        txtResultadoVolumen     = (TextView) findViewById(R.id.txtResultadoVolumen);

        btnResultado.setOnClickListener(this);
        txtN1.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnResultado:

                lado1 = Double.valueOf(txtN1.getText().toString());

                double resultadoVolumen1 = Math.pow(lado1,3);

                resultadoVolumen = Math.round(resultadoVolumen1*100.0)/100.0;

                txtResultadoVolumen.setText("" + resultadoVolumen + "cm^3.");
        }
    }
}