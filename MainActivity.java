package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        findViewById(R.id.btnIMC).setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, IMCActivity.class));
        });

        findViewById(R.id.btnCombustivel).setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, CombustivelActivity.class));
        });

        findViewById(R.id.btnApresentacao).setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, ApresentacaoActivity.class));
        });

        findViewById(R.id.btnSair).setOnClickListener(v -> {
            finish();
        });
    }
}
