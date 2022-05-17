package com.example.temperaturacomgrilo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText etGorjeios;
    Button btnCalcular;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etGorjeios = (EditText) findViewById(R.id.etGorjeios);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        tvResultado = (TextView) findViewById(R.id.tvResultado);

        tvResultado.setVisibility(View.GONE);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numGorjeios = Integer.parseInt(etGorjeios.getText().toString().trim());
                double temperatura = ((numGorjeios/3.0) + 4);
                DecimalFormat numberFormat = new DecimalFormat("#.0");

                String texto = "A temperatura ambiente é de aproximadamente "+numberFormat.format(temperatura)+" ºC";

                tvResultado.setText(texto);
                tvResultado.setVisibility(View.VISIBLE);
            }
        });
    }
}