package com.example.deliverybagual;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Carrinho extends AppCompatActivity {
    private Pedido pedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carrinho);

        this.pedido = (Pedido) getIntent().getSerializableExtra("pedido");

        ListView listView = findViewById(R.id.listaItens);

        ArrayAdapter<Item> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, this.pedido.items);
        listView.setAdapter(adapter);
    }

    public void adicionarMaisItens(View view)
    {
        Intent i = new Intent(this, AdicionarItem.class);
        i.putExtra("pedido", this.pedido);
        startActivity(i);
    }

    public void agendarEntrega(View view)
    {
        Intent i = new Intent(this, AgendarEntrega.class);
        i.putExtra("pedido", this.pedido);
        startActivity(i);
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setMessage(R.string.desejacancelarpeiddo)
                .setPositiveButton(R.string.cancelarpedido, new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i = new Intent(Carrinho.this, ListaPedidos.class);
                        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(i);
                        finish();
                    }

                })
                .setNegativeButton(R.string.continuar, null)
                .show();
    }
}
