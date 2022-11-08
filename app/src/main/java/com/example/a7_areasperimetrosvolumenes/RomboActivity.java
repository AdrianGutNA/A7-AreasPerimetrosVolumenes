package com.example.a7_areasperimetrosvolumenes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RomboActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText txtN1;
    private Button btnResultado;
    private TextView txtResultadoPerimetro;
    private TextView    txtResultadoArea;

    private double lado1 = 0;
    private double resultadoPerimetro = 0;
    private double resultadoArea = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rombo);

        getSupportActionBar().setTitle("Rombo");

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

                resultadoPerimetro = lado1 * 4;

                double diagonalMenor1 = 4 * Math.pow(lado1,2);
                double diagonalMenor2 = diagonalMenor1 / 5;
                double diagonalMenor3 = Math.sqrt(diagonalMenor2);
                double diagonalMenor = Math.round(diagonalMenor3*100.0)/100.0;
                double diagonalMayor = diagonalMenor * 2;
                resultadoArea = (diagonalMayor * diagonalMenor) / 2;

                txtResultadoArea.setText("" + resultadoArea + "cm");
                txtResultadoPerimetro.setText("" + resultadoPerimetro + "cm.");
        }
    }
}