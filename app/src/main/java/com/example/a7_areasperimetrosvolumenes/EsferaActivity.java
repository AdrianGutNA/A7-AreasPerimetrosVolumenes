package com.example.a7_areasperimetrosvolumenes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EsferaActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText txtN1;
    private Button btnResultado;
    private TextView txtResultadoVolumen;

    private double lado1 = 0;
    private double resultadoVolumen = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfera);

        getSupportActionBar().setTitle("Cono");

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

                double resultadoVolumen1 = (4 * Math.PI * Math.pow(lado1,3)) / 3;
                resultadoVolumen = Math.round(resultadoVolumen1*100.0)/100.0;

                txtResultadoVolumen.setText("" + resultadoVolumen + "cm^3.");
        }
    }
}