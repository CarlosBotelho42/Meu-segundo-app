package com.example.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        private EditText p_gasolina;
        private EditText p_alcool;
        private Button botao;
        private TextView resultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        p_gasolina = findViewById(R.id.p_gasolina);
        p_alcool = findViewById(R.id.p_alcool);
        botao = findViewById(R.id.botao);
        resultado = findViewById(R.id.resultado);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             //pegar valores digitados
            String textoPalcool = p_alcool.getText().toString();
            String textoPgasolina = p_gasolina.getText().toString();

            //converter strings para numeros
            Double valorAlcool = Double.parseDouble(textoPalcool);
            Double valorGasolina = Double.parseDouble(textoPgasolina);

            //alccol/gasolina

            double resultadoCalculo = valorAlcool / valorGasolina;

            if(resultadoCalculo >=0.7 ){

               resultado.setText("Melhor por Gasolina!");

            }else{

                resultado.setText("Melhor usar Álcool!!");

            }

            }
        });


    }
}
