package com.example.imc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referência ao botão
        Button btnCalculadora = findViewById(R.id.btn_calculadora);

        // Evento de clique do botão
        btnCalculadora.setOnClickListener(new View.OnClickListener() {


        Button btnCalculadora = findViewById(R.id.btn_calculadora);

                @Override
                public void onClick(View v) {
                    // Criando uma Intent para abrir a tela de cálculo do IMC
                    Intent intent = new Intent(MainActivity.this, CalculoIMCActivity.class);
                    startActivity(intent);
                }
            });
        }
    }
