package com.example.imc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class AbaixoDoPesoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abaixo_do_peso);

        TextView txtPeso = findViewById(R.id.txt_peso);
        TextView txtAltura = findViewById(R.id.txt_altura);
        TextView txtIMC = findViewById(R.id.txt_imc);
        TextView txtClassificacao = findViewById(R.id.txt_classificacao);
        TextView txtMensagem = findViewById(R.id.txt_mensagem);
        ImageView imgCategoria = findViewById(R.id.img_categoria);
        Button btnFechar = findViewById(R.id.btn_fechar);

        Intent intent = getIntent();
        double peso = intent.getDoubleExtra("peso", 0);
        double altura = intent.getDoubleExtra("altura", 0);
        double imc = intent.getDoubleExtra("imc", 0);
        String classificacao = intent.getStringExtra("classificacao");

        txtPeso.setText("Peso: " + peso + " kg");
        txtAltura.setText("Altura: " + altura + " m");
        txtIMC.setText("IMC: " + String.format("%.2f", imc));
        txtClassificacao.setText("Classificação: " + classificacao);
        txtMensagem.setText("Mantenha uma alimentação balanceada e busque orientação nutricional!");
        imgCategoria.setImageResource(R.drawable.abaixo_do_peso);

        btnFechar.setOnClickListener(v -> {
            Intent mainIntent = new Intent(AbaixoDoPesoActivity.this, MainActivity.class);
            startActivity(mainIntent);
            finish();
        });
    }
}
