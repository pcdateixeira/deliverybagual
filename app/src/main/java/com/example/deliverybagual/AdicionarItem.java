package com.example.deliverybagual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdicionarItem extends AppCompatActivity {
    private Pedido pedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adicionar_item);
        this.pedido = (Pedido) getIntent().getSerializableExtra("pedido");
    }

    public void selecionaItem(View view) {
        Intent i = new Intent(this, AdicionarItemPorTipo.class);
        Button b = (Button) view;

        i.putExtra("tipo", b.getText().toString());
        i.putExtra("pedido", this.pedido);
        startActivity(i);
    }

    public void verCarrinho(View view)
    {
        Intent i = new Intent(this, Carrinho.class);
        i.putExtra("pedido", this.pedido);
        startActivity(i);
    }
}
