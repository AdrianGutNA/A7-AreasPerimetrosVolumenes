package com.example.a7_areasperimetrosvolumenes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ParalelepipedoActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText txtN1;
    private EditText txtN2;
    private EditText txtN3;
    private Button btnResultado;
    private TextView txtResultadoVolumen;

    private double lado1 = 0;
    private double lado2 = 0;
    private double lado3 = 0;
    private double resultadoVolumen = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paralelepipedo);

        getSupportActionBar().setTitle("Paralelepipedo");

        btnResultado            =            findViewById(R.id.btnResultado);
        txtN1                   = (EditText) findViewById(R.id.txtN1);
        txtN2                   = (EditText) findViewById(R.id.txtN2);
        txtN3                   = (EditText) findViewById(R.id.txtN3);
        txtResultadoVolumen     = (TextView) findViewById(R.id.txtResultadoVolumen);

        btnResultado.setOnClickListener(this);
        txtN1.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.txtN1:
                txtN2.requestFocus();
                break;
            case R.id.txtN2:
                txtN3.requestFocus();
                break;
            case R.id.txtN3:
                btnResultado.requestFocus();
                break;
            case R.id.btnResultado:

                lado1 = Double.valueOf(txtN1.getText().toString());
                lado2 = Double.valueOf(txtN2.getText().toString());
                lado3 = Double.valueOf(txtN3.getText().toString());

                double resultado1 = lado1 * lado2 * lado3;
                resultadoVolumen = Math.round(resultado1*100.0)/100.0;

                txtResultadoVolumen.setText("" + resultadoVolumen + "cm^3.");
        }
    }
}