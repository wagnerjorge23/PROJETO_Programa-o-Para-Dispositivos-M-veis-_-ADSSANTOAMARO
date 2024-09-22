package com.example.app;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CombustivelActivity extends AppCompatActivity {

    private EditText etGasolina, etAlcool;
    private TextView tvResultado;
    private RadioGroup rgCombustivel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combustivel);

        etGasolina = findViewById(R.id.etGasolina);
        etAlcool = findViewById(R.id.etAlcool);
        tvResultado = findViewById(R.id.tvResultado);
        rgCombustivel = findViewById(R.id.rgCombustivel);

        rgCombustivel.setOnCheckedChangeListener((group, checkedId) -> calcularMelhorCombustivel());
    }

    private void calcularMelhorCombustivel() {
        double gasolina = Double.parseDouble(etGasolina.getText().toString());
        double alcool = Double.parseDouble(etAlcool.getText().toString());
        double relacao = alcool / gasolina;

        String resultado;
        if (relacao <= 0.7) {
            resultado = "Álcool é mais vantajoso";
        } else {
            resultado = "Gasolina é mais vantajosa";
        }
        tvResultado.setText("Resultado: " + resultado + "\nRelação: " + (relacao * 100) + "%");
    }
}
