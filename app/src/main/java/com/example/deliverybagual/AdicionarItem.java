package com.example.deliverybagual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AdicionarItem extends AppCompatActivity {

    private TextView itens;
    private Button botaoBovina;
    private Button botaoSuina;
    private Button botaoFrango;
    private Button botaoAperitivos;
    private Button botaoCarrinho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adicionar_item);

        itens = findViewById(R.id.itens);
        botaoBovina = findViewById(R.id.botaoBovina);
        botaoSuina = findViewById(R.id.botaoSuina);
        botaoFrango = findViewById(R.id.botaoFrango);
        botaoAperitivos = findViewById(R.id.botaoAperitivos);
        botaoCarrinho = findViewById(R.id.botaoCarrinho);
    }

    public void maisUmItem(View view) {
        Intent i = new Intent(this, AdicionarTipodeItem.class);

        switch(view.getId()) {
            case R.id.botaoBovina:
                i.putExtra("tipo", "bovina");
                break;
            case R.id.botaoSuina:
                i.putExtra("tipo", "suina");
                break;
            case R.id.botaoFrango:
                i.putExtra("tipo", "frango");
                break;
            case R.id.botaoAperitivos:
                i.putExtra("tipo", "aperitivos");
        }
        startActivity(i);
    }

    public void VerCarrinho(View view)
    {
        Intent i = new Intent(this, Carrinho.class);
        startActivity(i);
    }
}
