package com.example.a7_areasperimetrosvolumenes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CilindroActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText txtN1;
    private EditText txtN2;
    private Button btnResultado;
    private TextView txtResultadoVolumen;

    private double radio = 0;
    private double altura = 0;
    private double resultadoVolumen = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cilindro);

        getSupportActionBar().setTitle("Triangulo");

        btnResultado            =            findViewById(R.id.btnResultado);
        txtN1                   = (EditText) findViewById(R.id.txtN1);
        txtN2                   = (EditText) findViewById(R.id.txtN2);
        txtResultadoVolumen     = (TextView) findViewById(R.id.txtResultadoVolumen);

        btnResultado.setOnClickListener(this);
        txtN1.setOnClickListener(this);
        txtN2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.txtN1:
                txtN2.requestFocus();
                break;
            case R.id.txtN2:
                btnResultado.requestFocus();
                break;
            case R.id.btnResultado:

                radio = Double.valueOf(txtN1.getText().toString());
                altura = Double.valueOf(txtN2.getText().toString());

                double resultadoVolumen1 = (Math.PI * Math.pow(radio,2) * altura);

                resultadoVolumen = Math.round(resultadoVolumen1*100.0)/100.0;


                txtResultadoVolumen.setText("" + resultadoVolumen + "cm^3.");
        }
    }
}