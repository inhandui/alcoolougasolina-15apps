package com.cursoandroid.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText precoAlcool;
    private EditText precoGasolina;

    private Button verificar;

    private TextView resultado;

    private String sPrecoAlcool;
    private String sPrecoGasolina;

    private int valorAlcool;
    private int valorGasolina;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoAlcool = findViewById(R.id.precoAlcool);
        precoGasolina = findViewById(R.id.precoGasolina);

        verificar = findViewById(R.id.btn_verificar);

        resultado = findViewById(R.id.resultado);

        verificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Get text from EditText elements
                sPrecoAlcool = precoAlcool.getText().toString();
                sPrecoGasolina = precoGasolina.getText().toString();

                //Get int values from string prices.
                valorAlcool = Integer.getInteger(sPrecoAlcool);
                valorGasolina = Integer.getInteger(sPrecoGasolina);

            }
        });

    }
}
