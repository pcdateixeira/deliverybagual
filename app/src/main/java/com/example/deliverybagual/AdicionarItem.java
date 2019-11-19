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
    }

    public void selecionaItem(View view) {
        Intent i = new Intent(this, AdicionarItemPorTipo.class);
        Button b = (Button) view;

        i.putExtra("tipo", b.getText().toString());
        startActivity(i);
    }

    public void VerCarrinho(View view)
    {
        Intent i = new Intent(this, Carrinho.class);
        startActivity(i);
    }
}
