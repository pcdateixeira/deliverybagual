package com.example.deliverybagual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AdicionarItemPorTipo extends AppCompatActivity {
    private Pedido pedido;

    private TextView titulo;
    private Button itemUm;
    private Button itemDois;
    private Button itemTres;
    private Button itemQuatro;
    private Button botaoCarrinho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adicionar_item_por_tipo);

        titulo = findViewById(R.id.titulo);
        itemUm = findViewById(R.id.botaoItemUm);
        itemDois = findViewById(R.id.botaoItemDois);
        itemTres = findViewById(R.id.botaoItemTres);
        itemQuatro = findViewById(R.id.botaoItemQuatro);
        botaoCarrinho = findViewById(R.id.botaoCarrinho);

        this.pedido = (Pedido) getIntent().getSerializableExtra("pedido");

        String tipoItem = getIntent().getStringExtra("tipo");
        switch(tipoItem) {
            case "Bovina":
                titulo.setText(R.string.bovina);
                itemUm.setText(R.string.maminha);
                itemDois.setText(R.string.picanha);
                itemTres.setText(R.string.costela);
                itemQuatro.setText(R.string.chuleta);
                break;
            case "Suína":
                titulo.setText(R.string.suina);
                itemUm.setText(R.string.pernil);
                itemDois.setText(R.string.lombo);
                itemTres.setText(R.string.linguica);
                itemQuatro.setText(R.string.bisteca);
                break;
            case "Frango":
                titulo.setText(R.string.frango);
                itemUm.setText(R.string.peito);
                itemDois.setText(R.string.coxa);
                itemTres.setText(R.string.sobrecoxa);
                itemQuatro.setText(R.string.coracao);
                break;
            case "Aperitivos":
                titulo.setText(R.string.aperitivos);
                itemUm.setText(R.string.polenta);
                itemDois.setText(R.string.paoalho);
                itemTres.setText(R.string.xixo);
                itemQuatro.setText(R.string.maionese);
        }
        titulo.setVisibility(View.VISIBLE);
        itemUm.setVisibility(View.VISIBLE);
        itemDois.setVisibility(View.VISIBLE);
        itemTres.setVisibility(View.VISIBLE);
        itemQuatro.setVisibility(View.VISIBLE);
    }

    public void selecionaItem(View view) {
        Intent i = new Intent(this, AdicionarItemPorTamanho.class);
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
