package com.example.app;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class IMCActivity extends AppCompatActivity {

    private EditText etPeso, etAltura;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);
        
        etPeso = findViewById(R.id.etPeso);
        etAltura = findViewById(R.id.etAltura);
        tvResultado = findViewById(R.id.tvResultado);
        
        findViewById(R.id.btnCalcular).setOnClickListener(v -> calcularIMC());
        
        findViewById(R.id.btnLimpar).setOnClickListener(v -> limparCampos());
        
        findViewById(R.id.btnVoltar).setOnClickListener(v -> finish());
    }

    private void calcularIMC() {
        double peso = Double.parseDouble(etPeso.getText().toString());
        double altura = Double.parseDouble(etAltura.getText().toString());
        double imc = peso / (altura * altura);

        String classificacao;
        if (imc < 18.5) classificacao = "Abaixo do peso";
        else if (imc < 24.9) classificacao = "Peso normal";
        else if (imc < 29.9) classificacao = "Sobrepeso";
        else classificacao = "Obesidade";

        tvResultado.setText("IMC: " + imc + "\nClassificação: " + classificacao);
    }

    private void limparCampos() {
        etPeso.setText("");
        etAltura.setText("");
        tvResultado.setText("");
    }
}
