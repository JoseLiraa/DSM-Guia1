package com.sv.udb.ml161665.operacionesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button buttonSumar;
    private Button buttonRestar;
    private Button buttonMultiplicar;
    private Button buttonDvidirr;

    private TextView textRespuesta;

    private EditText editNumeroUno;
    private EditText editNumeroDos;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textRespuesta = findViewById(R.id.respuesta);

        editNumeroUno = findViewById(R.id.numero1);
        editNumeroDos = findViewById(R.id.numero2);

        buttonSumar = findViewById(R.id.btnSumar);
        buttonSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textRespuesta.setText( suma( Double.parseDouble(editNumeroUno.getText().toString()) , Double.parseDouble(editNumeroDos.getText().toString()) )+"");
            }
        });


        buttonRestar = findViewById(R.id.btnRestar);
        buttonRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textRespuesta.setText( resta( Double.parseDouble(editNumeroUno.getText().toString()) , Double.parseDouble(editNumeroDos.getText().toString()) )+"");
            }
        });


        buttonMultiplicar = findViewById(R.id.btnMultiplicar);
        buttonMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textRespuesta.setText( multiplicacion( Double.parseDouble(editNumeroUno.getText().toString()) , Double.parseDouble(editNumeroDos.getText().toString()) )+"");
            }
        });

        buttonDvidirr = findViewById(R.id.btnDividir);
        buttonDvidirr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textRespuesta.setText( division( Double.parseDouble(editNumeroUno.getText().toString()) , Double.parseDouble(editNumeroDos.getText().toString()) )+"");
            }
        });

    }

    public double suma (double a, double b){
        return a+b;
    }

    public double resta (double a, double b){
        return a-b;
    }

    public double multiplicacion (double a, double b){
        return a*b;
    }

    public double division (double a, double b){
        double respuesta = 0;
        if (b != 0){
            respuesta = a/b;
        }
        return respuesta;
    }
}