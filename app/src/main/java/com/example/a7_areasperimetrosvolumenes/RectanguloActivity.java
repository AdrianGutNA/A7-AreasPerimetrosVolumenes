package com.example.a7_areasperimetrosvolumenes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RectanguloActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText txtN1;
    private EditText txtN2;
    private Button btnResultado;
    private TextView txtResultadoPerimetro;
    private TextView    txtResultadoArea;

    private double lado1 = 0;
    private double lado2 = 0;
    private double resultadoPerimetro = 0;
    private double resultadoArea = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo);

        getSupportActionBar().setTitle("Rectangulo");

        btnResultado            =            findViewById(R.id.btnResultado);
        txtN1                   = (EditText) findViewById(R.id.txtN1);
        txtN2                   = (EditText) findViewById(R.id.txtN2);
        txtResultadoArea        = (TextView) findViewById(R.id.txtResultadoArea);
        txtResultadoPerimetro   = (TextView) findViewById(R.id.txtResultadoPerimetro);

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
                btnResultado.requestFocus();
                break;
            case R.id.btnResultado:

                lado1 = Double.valueOf(txtN1.getText().toString());
                lado2 = Double.valueOf(txtN2.getText().toString());

                double resPerimetro = (lado1 * 2) + (lado2 * 2);
                resultadoPerimetro = Math.round(resPerimetro*100.0)/100.0;

                double resArea = lado1 * lado2;
                resultadoArea = Math.round(resArea*100.0)/100.0;

                txtResultadoArea.setText("" + resultadoArea + "cm^2.");
                txtResultadoPerimetro.setText("" + resultadoPerimetro + "cm.");
        }
    }
}