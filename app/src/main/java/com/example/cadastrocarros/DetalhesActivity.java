package com.example.cadastrocarros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetalhesActivity extends AppCompatActivity {

    TextView tvMarca;
    TextView tvModelo;
    TextView tvAno;
    TextView tvCor;
    TextView tvMotor;
    TextView tvCombustivel;
    TextView tvValorFipe;
    CarroDAO dao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);
        tvMarca = findViewById(R.id.tvMarca);
        tvModelo = findViewById(R.id.tvModelo);
        tvAno = findViewById(R.id.tvAno);
        tvCor = findViewById(R.id.tvCor);
        tvMotor = findViewById(R.id.tvMotor);
        tvCombustivel = findViewById(R.id.tvCombustivel);
        tvValorFipe = findViewById(R.id.tvValorFipe);
//
//        Intent intent = getIntent();
//
//        int position = intent.getIntExtra("position", -1);
//
//        if(position == -1){finish();}

        dao = new CarroDAO();
        Carro carro = dao.getCarro();
        tvMarca.setText("Marca: "+carro.getMarca());
        tvModelo.setText("Modelo: "+carro.getModelo());
        tvAno.setText("Ano: "+carro.getAnoFab());
        tvCor.setText("Cor: "+carro.getCor());
        tvMotor.setText("Motor: "+carro.getMotor());
        tvCombustivel.setText("Motor: "+carro.getMotor());
        tvValorFipe.setText("Valor FIPE: R$ "+carro.getValorFipe());
    }
}