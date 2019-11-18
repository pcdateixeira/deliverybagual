package com.example.deliverybagual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AdicionarTipodeItem extends AppCompatActivity {

    private TextView titulo;
    private Button itemUm;
    private Button itemDois;
    private Button itemTres;
    private Button itemQuatro;
    private Button botaoCarrinho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adicionar_tipode_item);

        titulo = findViewById(R.id.titulo);
        itemUm = findViewById(R.id.botaoItemUm);
        itemDois = findViewById(R.id.botaoItemDois);
        itemTres = findViewById(R.id.botaoItemTres);
        itemQuatro = findViewById(R.id.botaoItemQuatro);
        botaoCarrinho = findViewById(R.id.botaoCarrinho);

        String tipoItem = getIntent().getStringExtra("tipo");
        switch(tipoItem) {
            case "bovina":
                titulo.setText(R.string.bovina);
                itemUm.setText(R.string.maminha);
                itemDois.setText(R.string.picanha);
                itemTres.setText(R.string.costela);
                itemQuatro.setText(R.string.chuleta);
                break;
            case "suina":
                titulo.setText(R.string.suina);
                itemUm.setText(R.string.costela);
                itemDois.setText(R.string.lombo);
                itemTres.setText(R.string.salsichao);
                itemQuatro.setText(R.string.picanha);
                break;
            case "frango":
                titulo.setText(R.string.frango);
                itemUm.setText(R.string.peito);
                itemDois.setText(R.string.coxa);
                itemTres.setText(R.string.sobrecoxa);
                itemQuatro.setText(R.string.coracao);
                break;
            case "aperitivos":
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

    public void VerCarrinho(View view)
    {
        Intent i = new Intent(this, Carrinho.class);
        startActivity(i);
    }
}
